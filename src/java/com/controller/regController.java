/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.regDAO;
import com.model.Reg;


public class regController extends HttpServlet {

    private static String INSERT = "/reg.jsp";
    private static String EDIT = "/editreg.jsp";
    private static String PROFILE_REG = "/profilereg.jsp";
    private static String MAIN_PAGE = "/main.jsp";
    private static String LOGIN_PAGE = "/logins.jsp";
    private regDAO dao;

    public regController() throws ClassNotFoundException {
        super();
        dao = new regDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("actionreg");

        if (action.equalsIgnoreCase("deletereg")) {
            String username = request.getParameter("username");
            dao.deleteReg(username);
            forward = PROFILE_REG;
            request.setAttribute("reg", dao.getAllRegs());
        } 
        else if (action.equalsIgnoreCase("editreg")) {
            forward = EDIT;
            String username = request.getParameter("username");
            Reg reg = dao.getRegByUsername(username);
            request.setAttribute("reg", reg);
        } 
        else if (action.equalsIgnoreCase("profilreg")) {
            forward = PROFILE_REG;
            request.setAttribute("reg", dao.getAllRegs());
        } 
        else if (action.equalsIgnoreCase("insertreg")) {
            forward = INSERT;
        }
         else if (action.equalsIgnoreCase("loginreg")) {
             String username = request.getParameter("username");
              String password = request.getParameter("password");
            Reg myreg= dao.login(username,password);
            
            if(myreg!=null){
            forward =PROFILE_REG ;
            }else{
                forward="logins.jsp";
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
String forward;
        String action = request.getParameter("actionreg");
        Reg reg = new Reg();
        reg.setUsername(request.getParameter("username"));
        reg.setName(request.getParameter("name"));
        reg.setPassword(request.getParameter("password"));
        reg.setPhonenumber(request.getParameter("phonenumber"));
        reg.setEmail(request.getParameter("email"));
        reg.setAddress(request.getParameter("address"));
       

        if (action.equalsIgnoreCase("editreg")) {
            dao.updateReg(reg);
         
        } else if (action.equalsIgnoreCase("loginregs")) {
             String username = request.getParameter("username");
              String password = request.getParameter("password");
            Reg myreg=null;myreg= dao.login(username,password);
            
            if(myreg!=null){
            forward ="logins.jsp" ;
               RequestDispatcher view = request.getRequestDispatcher(forward);
        request.setAttribute("reg", reg);
        view.forward(request, response);
            }else{
                forward="logins.jsp";
                  RequestDispatcher view = request.getRequestDispatcher(forward);
        request.setAttribute("reg", reg);
        view.forward(request, response);
            }
        } else {
            dao.addReg(reg);
            
        }
        RequestDispatcher view = request.getRequestDispatcher(PROFILE_REG);
        request.setAttribute("reg", dao.getAllRegs());
        view.forward(request, response);
    }
    
    
}
