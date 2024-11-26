/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.TrackingDao;
import com.model.Tracking;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Name: Mohammad Alif Akhbar Bin Mohd Nizam Program: SMSK with IM
 * Course: CSF3104 Lab: Date:
 *
 */
@WebServlet("/")
public class TrackingController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private TrackingDao dao;

    public void init() {
        dao = new TrackingDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;

                case "/insert":
                    insertTracking(request, response);
                    break;

                case "/delete":
                    deleteTracking(request, response);
                    break;

                case "/edit":
                    showEditForm(request, response);
                    break;

                case "/update":
                    updateTracking(request, response);
                    break;
                    
                case "/check":
                    checkTracking(request, response);
                    break;

                default:
                    listTracking(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listTracking(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Tracking> listTracking = dao.courierViewAllTracking();
        request.setAttribute("listTracking", listTracking);
        RequestDispatcher dispatcher = request.getRequestDispatcher("courierView.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("addTracking.jsp");
        dispatcher.forward(request, response);
    }

    private void checkTracking(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Tracking existingTracking = dao.findTrackingById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("checkTracking.jsp");
        request.setAttribute("tracking", existingTracking);
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Tracking existingTracking = dao.findTrackingById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("addTracking.jsp");
        request.setAttribute("tracking", existingTracking);
        dispatcher.forward(request, response);
    }

    private void insertTracking(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String status = request.getParameter("status");
        String location = request.getParameter("location");
        Date orderdate = Date.valueOf(request.getParameter("date"));

        Tracking newTracking = new Tracking(status, location, orderdate);
        dao.userAddTracking(newTracking);
        
        
        response.sendRedirect("checkTracking.jsp");
    }

    private void updateTracking(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String status = request.getParameter("status");
        String location = request.getParameter("location");
        Date orderdate = Date.valueOf(request.getParameter("date"));

        Tracking tracking = new Tracking(id, status, location, orderdate);
        dao.courierUpdateLocationStatusOrderDate(tracking);
        response.sendRedirect("list");
    }

    private void deleteTracking(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        dao.deleteTracking(id);
        response.sendRedirect("list");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
