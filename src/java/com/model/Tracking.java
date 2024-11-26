/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.sql.Date;

/**
 *
 * @author Name: Mohammad Alif Akhbar Bin Mohd Nizam Program: SMSK with IM
 * Course: CSF3104 Lab: Date:
 *
 */
public class Tracking {

    private int id;
    private String status;
    private String location;
    private Date orderDate;

    public Tracking() {

    }

    public Tracking(String status, String location, Date orderDate) {
        super();
        this.status = status;
        this.location = location;
        this.orderDate = orderDate;

    }
    
    public Tracking(int id, String status, String location, Date orderDate) {
        super();
        this.id=id;
        this.status = status;
        this.location = location;
        this.orderDate = orderDate;

    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
