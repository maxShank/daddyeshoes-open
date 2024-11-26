/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import java.util.ArrayList;
import java.util.List;

import com.model.Tracking;
import java.sql.Date;
import java.sql.DriverManager;

/**
 *
 * @author Name: Mohammad Alif Akhbar Bin Mohd Nizam Program: SMSK with IM
 * Course: CSF3104 Lab: Date:
 *
 */
public class TrackingDao {

    Connection conn = null;

    private String jdbcURL = "jdbc:mysql://localhost:3306/daddyeshoes";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";

    private static final String INSERT_TRACKING_SQL = "INSERT INTO `tracking` (`status`, `location`, `orderdate`) VALUES " + "(?,?,?);";
    private static final String SELECT_TRACKING_BY_ID = "SELECT `id`, `status`, `location`, `orderdate` FROM `tracking` WHERE `id` =?";
    private static final String SELECT_ALL_TRACKING = "SELECT * FROM `tracking`";
    private static final String DELETE_TRACKING_SQL = "DELETE FROM `tracking` WHERE `id`=?;";
    private static final String UPDATE_TRACKING_SQL = "UPDATE `tracking` SET `status`=?, `location`=?, `orderdate`=? WHERE `id`=?;";

    public TrackingDao() {

    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void userAddTracking(Tracking tracking) throws SQLException {
        System.out.println(INSERT_TRACKING_SQL);
        //try-with-resource statement will auto close the connection.
        try ( Connection connection = getConnection();  PreparedStatement preparedStatement
                = connection.prepareStatement(INSERT_TRACKING_SQL)) {
            preparedStatement.setString(1, tracking.getStatus());
            preparedStatement.setString(2, tracking.getLocation());
            preparedStatement.setDate(3, tracking.getOrderDate());

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public Tracking findTrackingById(int id) {
        Tracking tracking = null;

        // Step 1: Establishing a connection
        try ( Connection connection = getConnection(); //Step 2: Create a statement using connection object    
                  PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TRACKING_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);

            //Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object
            while (rs.next()) {

                String status = rs.getString("status");
                String location = rs.getString("location");
                Date orderDate = rs.getDate("orderdate");

                tracking = new Tracking(id, status, location, orderDate);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return tracking;
    }

    public List<Tracking> courierViewAllTracking() {

        //Using try-with-resources to avoid closing resources (boiler plate code)
        List<Tracking> trackings = new ArrayList<>();

        //Step 1: Establishing a connection
        try ( Connection connection = getConnection(); //Step 2:Create a statement using connection object
                  PreparedStatement preparedStatement
                = connection.prepareStatement(SELECT_ALL_TRACKING);) {

            System.out.println(preparedStatement);

            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String status = rs.getString("status");
                String location = rs.getString("location");
                Date orderDate = rs.getDate("orderdate");
                trackings.add(new Tracking(id, status, location, orderDate));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return trackings;
    }

    public boolean courierUpdateLocationStatusOrderDate(Tracking tracking) throws SQLException {
        boolean rowUpdated;
        try ( Connection connection = getConnection();  PreparedStatement statement
                = connection.prepareStatement(UPDATE_TRACKING_SQL);) {
            statement.setString(1, tracking.getStatus());
            statement.setString(2, tracking.getLocation());
            statement.setDate(3, tracking.getOrderDate());
            statement.setInt(4, tracking.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    public boolean deleteTracking(int id) throws SQLException {
        boolean rowDeleted;

        try ( Connection connection = getConnection();  PreparedStatement statement
                = connection.prepareStatement(DELETE_TRACKING_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
