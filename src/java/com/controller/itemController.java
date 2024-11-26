/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Controller;

/**
 *
 * @author ACER
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.itemDAO;
import com.model.Item;

public class itemController extends HttpServlet {
    

    private static String INSERT = "/itempage.jsp";
    private static String EDIT = "/itempage.jsp";
    private static String LIST_ITEM = "/itempage.jsp";
    private itemDAO dao;
    
    public itemController() throws ClassNotFoundException {
        super();
        dao = new itemDAO();
    }
 // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String forward ="";
        String action = request.getParameter("action");
        
        HttpSession session = request.getSession();
        
        if (action.equalsIgnoreCase("delete")){
            String itemid = request.getParameter("itemid");
            dao.deleteItem(itemid);
            forward = LIST_ITEM;
            session.setAttribute("items", dao.getAllItems());
        }
        else if (action.equalsIgnoreCase("edit")){
            forward = EDIT;
            String itemid = request.getParameter("itemid");
            Item item = dao.getItemById(itemid);
            session.setAttribute("item", item);
        }
        else if (action.equalsIgnoreCase("listItem")){
            forward = LIST_ITEM;
            session.setAttribute("custs", dao.getAllItems());
        }
      else if (action.equalsIgnoreCase("insert")){
            forward = INSERT;
        }
        
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        HttpSession session = request.getSession();
         
        Item item = new Item();
        item.setItemid(request.getParameter("itemid"));
        item.setName(request.getParameter("name"));
        item.setDesc(request.getParameter("description"));
        item.setImage(request.getParameter("imagesource"));
        item.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        item.setPrice(Double.parseDouble(request.getParameter("price")));
        
        
        if (action.equalsIgnoreCase("edit")){
          String row =  dao.updateItem(item);
               RequestDispatcher view = request.getRequestDispatcher(LIST_ITEM);
        session.setAttribute("items", dao.getAllItems());
        view.forward(request, response);
        } else {
            dao.addItem(item);
             RequestDispatcher view = request.getRequestDispatcher(LIST_ITEM);
        session.setAttribute("items", dao.getAllItems());
        view.forward(request, response);
        }
        
 
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}