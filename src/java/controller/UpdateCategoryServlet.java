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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;

/**
 *
 * @author Duong
 */
@WebServlet(name = "UpdateCategoryServlet", urlPatterns = {"/UpdateCategory"})
public class UpdateCategoryServlet extends HttpServlet {

    DaoCategory dao = new DaoCategory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("update_category.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int hid = Integer.parseInt(request.getParameter("hid"));
        String hname = request.getParameter("hname");
        String website = request.getParameter("website");
        Category category = new Category(hid,hname, website);
//        try (PrintWriter out = response.getWriter()) {
//            out.print(hid +"-" +hname + "-" + website);
//        }
        dao.updateCategory(category);

        response.sendRedirect("view_category.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
