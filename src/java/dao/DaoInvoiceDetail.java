
package dao;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import connect.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Invoice;
import model.InvoiceDetail;


public class DaoInvoiceDetail {
    
    DBConnection DBCon = new DBConnection();
    Connection conn = DBCon.getConnection();
    
    public void insertInvoiceDetail(String hid,String sid,int quantity, double price) {
        String sql = "insert into HoaDonChiTiet values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hid);
            ps.setString(2, sid);
            ps.setInt(3, quantity);
            ps.setDouble(4, price);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoInvoiceDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<InvoiceDetail> getListInvoice(String hid) {
        String sql = "select * from HoaDonChiTiet where hid=?";
        ArrayList<InvoiceDetail> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                InvoiceDetail invoicedetail = new InvoiceDetail();
                invoicedetail.setHid(rs.getString("hid"));
                invoicedetail.setSid(rs.getString("sid"));
                invoicedetail.setQuantity(rs.getInt("quantity"));
                invoicedetail.setPrice(rs.getDouble("price"));
                list.add(invoicedetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoInvoiceDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;      
    }
    
    public static void main(String[] args) {
        DaoInvoiceDetail dao = new DaoInvoiceDetail();
        System.out.println(dao.getListInvoice("0784480b2887422c92f42a164e1d65c0").get(0).toString());
    }
    
}
