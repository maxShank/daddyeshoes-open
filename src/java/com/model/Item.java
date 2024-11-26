/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author ACER
 */
public class Item {
    
    protected String itemid;
    protected String name;
    protected String description;
    protected String imagesource;
    protected int quantity;
    protected double price;
    
    public Item(){
        
    }
                   
    public String getItemid(){
        return itemid;
    }
    
    public void setItemid(String itemid){
        this.itemid = itemid;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDesc(){
        return description;
    }
    

    public void setDesc(String description){
        this.description = description;
    }
    public String getImage(){
        return imagesource;
    }
    
    public void setImage(String imagesource){
        this.imagesource = imagesource;
    }
        public Integer getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
   
}
