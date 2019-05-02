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
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author Duong
 */
public class CartServlet extends HttpServlet {

    DaoProduct dao = new DaoProduct();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        HttpSession session = request.getSession();
        String service = request.getParameter("service");
        String pid = request.getParameter("sid");
        Cart cart = (Cart) session.getAttribute("cart");
        try {
            Product product = dao.getProductInfo(pid);
            switch(service) {
                case "plus":                  
                    if(cart.getCartItems().containsKey(pid)) {
                        cart.insertToCart(pid, new Item(product, cart.getCartItems().get(pid).getQuantity()));                      
                    }                     
                    else {
                        cart.insertToCart(pid, new Item(product, 1));                             
                    }
                    break;
                case "remove":
                    cart.removeCart(pid);
                    break;                       
            }
        } catch(Exception e) {
            e.printStackTrace();
            response.sendRedirect("index.jsp");
        }
        
        session.setAttribute("cart", cart);
        response.sendRedirect("index.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
