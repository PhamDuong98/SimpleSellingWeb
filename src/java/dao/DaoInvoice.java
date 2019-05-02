
package dao;

import connect.DBConnection;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Invoice;
import model.Product;


public class DaoInvoice {
    
    DBConnection DBCon = new DBConnection();
    Connection conn = DBCon.getConnection();
    
    public String getRandonHid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
    
    public void insertInvoice(String hid,int cid,String rcName, String rcAddress,String rPhone, double total ) {
//        String randomId  = UUID.randomUUID().toString().replace("-", "");  create a random invoice id
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        String sql = "insert into HoaDon values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hid);
            ps.setTimestamp(2, ts);
            ps.setInt(3, cid);
            ps.setString(4, rcName);
            ps.setString(5, rcAddress);
            ps.setString(6, rPhone);
            ps.setDouble(7, total);
            ps.setInt(8, 1);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    public ArrayList<Invoice> getListInvoice() {
        String sql = "select * from HoaDon order";
        ArrayList<Invoice> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Invoice invoice = new Invoice();
                invoice.setHid(rs.getString("hid"));
                invoice.setCid(rs.getInt("cid"));
                invoice.setDate(rs.getTimestamp("date"));
                invoice.setRcAddress(rs.getString("Raddress"));
                invoice.setTotal(rs.getDouble("total"));
                invoice.setRcName(rs.getString("Rcname"));
                invoice.setStatus(rs.getInt("status"));
                invoice.setrPhone(rs.getString("Rphone"));
                list.add(invoice);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;      
    }
    
    public ArrayList<Invoice> getListInvoiceNotRejected() {
        String sql = "select * from HoaDon where status=1 or status = 2 or status = 3 order by date desc";
        ArrayList<Invoice> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Invoice invoice = new Invoice();
                invoice.setHid(rs.getString("hid"));
                invoice.setCid(rs.getInt("cid"));
                invoice.setDate(rs.getTimestamp("date"));
                invoice.setRcAddress(rs.getString("Raddress"));
                invoice.setTotal(rs.getDouble("total"));
                invoice.setRcName(rs.getString("Rcname"));
                invoice.setStatus(rs.getInt("status"));
                invoice.setrPhone(rs.getString("Rphone"));
                list.add(invoice);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;      
    }
    
    public Invoice getInvoiceById(String hid) {
        String sql = "select * from HoaDon where where hid=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Invoice invoice = new Invoice();
                invoice.setHid(rs.getString("hid"));
                invoice.setCid(rs.getInt("cid"));
                invoice.setDate(rs.getTimestamp("date"));
                invoice.setRcAddress(rs.getString("Raddress"));
                invoice.setTotal(rs.getDouble("total"));
                invoice.setRcName(rs.getString("Rcname"));
                invoice.setStatus(rs.getInt("status"));
                invoice.setrPhone(rs.getString("Rphone"));    
                return invoice;
            }        
        } catch (SQLException ex) {
            Logger.getLogger(DaoInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;      
    }
    
    public void changeStatus(String hid, int status) {
        String sql = "update HoaDon set status=? where hid=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1, status);
            pre.setString(2, hid);
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        DaoInvoice dao = new DaoInvoice();
        dao.changeStatus("74f07dce1edd4d27b4c4f67d85547be7", 1);
    }
    
}
