/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoInvoice;
import dao.DaoInvoiceDetail;
import dao.DaoProduct;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Invoice;
import model.InvoiceDetail;
import model.Product;

public class UpdateInvoiceServlet extends HttpServlet {

    DaoInvoice daoIn = new DaoInvoice();
    DaoInvoiceDetail daoId = new DaoInvoiceDetail();
    DaoProduct daoProduct = new DaoProduct();
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("update_invoice.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hid = request.getParameter("hid");
        int status = Integer.parseInt(request.getParameter("status"));
        daoIn.changeStatus(hid, status);
        Invoice invoice = daoIn.getInvoiceById(hid);
        ArrayList<InvoiceDetail> list = daoId.getListInvoice(hid);
        if (status == 0) {
            for (InvoiceDetail id : list) {
                Product product = daoProduct.getProductInfo(id.getSid());
                product.setQuantity(product.getQuantity() + id.getQuantity());
                daoProduct.updateProduct(product);
            }
        }
        response.sendRedirect("view_invoice.jsp");
//        try (PrintWriter out = response.getWriter()) {
//            out.print(hid + "-" + status);
//        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
