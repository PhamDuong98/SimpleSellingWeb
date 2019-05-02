/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoProduct;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Duong
 */
public class InsertProductServlet extends HttpServlet {

    DaoProduct dao = new DaoProduct();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("insert_product.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sname = request.getParameter("sname");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        String picture = request.getParameter("picture");
        String description = request.getParameter("description");
        int hid  = Integer.parseInt(request.getParameter("hid")); 
        int status = Integer.parseInt(request.getParameter("status"));
        dao.insertProduct(sname, quantity, price, picture, description, status,hid);
        response.sendRedirect("view_product.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
