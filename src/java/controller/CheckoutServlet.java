package controller;

import dao.DaoInvoice;
import dao.DaoInvoiceDetail;
import dao.DaoProduct;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Customer;
import model.Invoice;
import model.Item;
import model.Product;

public class CheckoutServlet extends HttpServlet {

    DaoInvoice dao = new DaoInvoice();
    DaoInvoiceDetail daoIn = new DaoInvoiceDetail();
    Cart cart1 = new Cart();
    DaoProduct daoProduct = new DaoProduct();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("checkout.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String hid = dao.getRandonHid();
        String Rcname = request.getParameter("Rcname");
        String Raddress = request.getParameter("Raddress");
        String Rphone = request.getParameter("Rphone");
        Cart cart = (Cart) session.getAttribute("cart");       
        Customer customer = (Customer) session.getAttribute("customer");
        Invoice invoice = new Invoice();
        dao.insertInvoice(hid,customer.getCid(), Rcname, Raddress, Rphone, cart.total());
        for (Map.Entry<String, Item> list : cart.getCartItems().entrySet()) {
            Product p = daoProduct.getProductInfo(list.getValue().getProduct().getSid());
            p.setQuantity(p.getQuantity() - list.getValue().getQuantity());
            daoProduct.updateProduct(p);
            daoIn.insertInvoiceDetail(hid, list.getValue().getProduct().getSid(), list.getValue().getQuantity(), list.getValue().getProduct().getPrice());
        } 
        response.sendRedirect("index.jsp");
        session.removeAttribute("cart");
        //request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
