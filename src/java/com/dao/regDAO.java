/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import com.util.DBConnection;

import com.model.Reg;

public class regDAO {
   
    private Connection connection;

    public regDAO() throws ClassNotFoundException {
        connection = DBConnection.getConnection();
    }

    public void addReg(Reg reg) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into wan(username, name, password, phonenumber, email,address) values(?, ?, ?, ?, ?,?)");
            //Parameters start with 1
            preparedStatement.setString(1, reg.getUsername());
            preparedStatement.setString(2, reg.getName());
            preparedStatement.setString(3, reg.getPassword());
            preparedStatement.setString(4, reg.getPhonenumber());
            preparedStatement.setString(5, reg.getEmail());
            preparedStatement.setString(6, reg.getAddress());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteReg(String username) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from wan where username=?");
            //Parameters start with 1
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
            System.out.print(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateReg(Reg reg) {
        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement("update wan set name=?, password=?, phonenumber=?, email=?, address=?"
                            + " where username=?");

            //Parameters start with 1
            preparedStatement.setString(1, reg.getName());
            preparedStatement.setString(2, reg.getPassword());
            preparedStatement.setString(3, reg.getPhonenumber());
            preparedStatement.setString(4, reg.getEmail());
            preparedStatement.setString(5, reg.getAddress());
            preparedStatement.setString(6, reg.getUsername());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Reg> getAllRegs() {
        List<Reg> regNumber = new ArrayList<Reg>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from wan");
            while (rs.next()) {
                Reg reg = new Reg();
                reg.setUsername(rs.getString("username"));
                reg.setName(rs.getString("name"));
                reg.setPassword(rs.getString("password"));
                reg.setPhonenumber(rs.getString("phonenumber"));
                reg.setEmail(rs.getString("email"));
                reg.setAddress(rs.getString("address"));
                regNumber.add(reg);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return regNumber;
    }

    public Reg getRegByUsername(String username) {//
        Reg reg = new Reg();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from wan where username=?");
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {               
                reg.setUsername(rs.getString("username"));
                reg.setName(rs.getString("name"));
                reg.setPassword(rs.getString("password"));
                reg.setPhonenumber(rs.getString("phonenumber"));
                reg.setEmail(rs.getString("email"));
                reg.setAddress(rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reg;
    }
      public Reg login(String username, String password) {//
        Reg reg = new Reg();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from wan where username=? and password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {               
                reg.setUsername(rs.getString("username"));
                reg.setName(rs.getString("name"));
                reg.setPassword(rs.getString("password"));
                reg.setPhonenumber(rs.getString("phonenumber"));
                reg.setEmail(rs.getString("email"));
                reg.setAddress(rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reg;
    }
    
}