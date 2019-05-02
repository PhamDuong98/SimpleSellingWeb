/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoCustomer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import utils.Validate;

/**
 *
 * @author Duong
 */
public class RegisterServlet extends HttpServlet {

    

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Validate valid = new Validate();
        String cname = request.getParameter("cname");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        DaoCustomer dao = new DaoCustomer();
        Customer customer = new Customer(cname, address, phone,username, password,1);
        if(valid.checkUsername(username)) {
            request.setAttribute("mess", "Username is duplicate");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {          
            dao.addCustomer(customer);
            request.setAttribute("mess", "Register successfully");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
