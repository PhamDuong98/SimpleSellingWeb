/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoCategory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Duong
 */
public class ChangeStatusCategoryServlet extends HttpServlet {

    DaoCategory dao = new DaoCategory();


        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hid = request.getParameter("hid");
        int status = Integer.parseInt(request.getParameter("status"));
//        try (PrintWriter out = response.getWriter()) {
//            out.print(username + "-" + status);
//        }
        dao.changeStatus(hid, status);
        response.sendRedirect("view_category.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
