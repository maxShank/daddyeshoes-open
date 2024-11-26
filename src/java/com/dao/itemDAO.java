/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import com.model.Item;
import com.util.DBConnection;

public class itemDAO {
      private Connection connection;
    
    public itemDAO() throws ClassNotFoundException {
        connection = DBConnection.getConnection();
    }
    public void addItem(Item item) {
        try {
            PreparedStatement preparedStatement = 
                    connection.prepareStatement("INSERT INTO item(itemid, name, description, imagesource, quantity, price) VALUES (?,?,?,?,?,?)");
            preparedStatement.setString(1, item.getItemid());
            preparedStatement.setString(2, item.getName());
            preparedStatement.setString(3, item.getDesc());
            preparedStatement.setString(4, item.getImage());
            preparedStatement.setInt(5, item.getQuantity());
            preparedStatement.setDouble(6, item.getPrice());
            preparedStatement.executeUpdate();           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
         public void deleteItem(String itemid){
        try {
            PreparedStatement preparedStatement = 
                    connection.prepareStatement("DELETE FROM item WHERE itemid=?");
            preparedStatement.setString(1, itemid);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
           public String updateItem (Item item){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE item SET name=?, description=?, quantity=?, imagesource=?, price=? WHERE itemid=?");
            
            preparedStatement.setString(1, item.getName());
            preparedStatement.setString(2, item.getDesc());
            preparedStatement.setString(3, item.getImage());
            preparedStatement.setInt(4, item.getQuantity());
            preparedStatement.setDouble(5, item.getPrice());;
            preparedStatement.setString(6, (item.getItemid()));
            
          int row =  preparedStatement.executeUpdate();
          return "line 66";
        }
              
            catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
            return e.toString();
        }
    }
                public List<Item> getAllItems() {
        List<Item> items = new ArrayList<Item>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM item");
            while (rs.next()){
               Item item= new Item();
                item.setItemid(rs.getString("itemid"));
                item.setName(rs.getString("name"));
                item.setDesc(rs.getString("description"));
                item.setImage(rs.getString("imagesource"));
                item.setQuantity(rs.getInt("quantity"));
                item.setPrice(rs.getDouble("price"));
                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }
       public Item getItemById(String itemid){
        Item item = new Item();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM item WHERE itemid=?");
            
            preparedStatement.setString(1, itemid);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                item.setItemid(rs.getString("itemid"));
                item.setName(rs.getString("name"));
                item.setDesc(rs.getString("description"));
                item.setImage(rs.getString("imagesource"));
                item.setQuantity(rs.getInt("quantity"));
                item.setPrice(rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }
}
