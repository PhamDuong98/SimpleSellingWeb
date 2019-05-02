/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoProduct;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

/**
 *
 * @author Duong
 */
public class UpdateProductServlet extends HttpServlet {

    DaoProduct dao = new DaoProduct();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("update_product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sid = request.getParameter("sid");
        String sname = request.getParameter("sname");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        String image = request.getParameter("picture");
        String description = request.getParameter("description");
        Product product = new Product(sid, quantity, sname, image, description, price);
        dao.updateProduct(product);
//        try (PrintWriter out = response.getWriter()) {
//            out.print(sid + "-" + sname + "-" + quantity + "-" + price + "-" + image + "-" + status + "-" + description + "-" + hid);
//        }
        response.sendRedirect("view_product.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
