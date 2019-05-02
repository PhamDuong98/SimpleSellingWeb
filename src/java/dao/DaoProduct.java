package dao;

import connect.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

public class DaoProduct {

    DBConnection DBCon = new DBConnection();

    public ArrayList<Product> getListProductByCategory(int hid) {
        Connection con = DBCon.getConnection();
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from SanPham where hid='" + hid + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setSid(rs.getString("sid"));
                product.setSname(rs.getString("sname"));
                product.setPicture(rs.getString("picture"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setStatus(rs.getInt("status"));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Product> getListProduct() {
        Connection con = DBCon.getConnection();
        String sql = "select * from SanPham where status = 1";
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setSid(rs.getString("sid"));
                product.setSname(rs.getString("sname"));
                product.setPicture(rs.getString("picture"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setStatus(rs.getInt("status"));
                product.setHid(rs.getInt("hid"));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<Product> getListProductByStatus() {
        Connection con = DBCon.getConnection();
        String sql = "select * from SanPham where status=1";
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setSid(rs.getString("sid"));
                product.setSname(rs.getString("sname"));
                product.setPicture(rs.getString("picture"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setStatus(rs.getInt("status"));
                product.setHid(rs.getInt("hid"));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Product getProductInfo(String sid) {
        Connection con = DBCon.getConnection();
        String sql = "select * from SanPham where sid='" + sid + "'";
        try {
            Product product = new Product();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                product.setSid(rs.getString("sid"));
                product.setSname(rs.getString("sname"));
                product.setPicture(rs.getString("picture"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setHid(rs.getInt("hid"));
                product.setStatus(rs.getInt("status"));
            }
            return product;
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void insertProduct(String sname, int quantity, double price, String picture, String description, int status, int hid) {
        Connection con = DBCon.getConnection();
        String randomId = UUID.randomUUID().toString().replace("-", "");
        String sql = "insert into SanPham values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, randomId);
            ps.setString(2, sname);
            ps.setInt(3, quantity);
            ps.setDouble(4, price);
            ps.setString(5, picture);
            ps.setString(6, description);
            ps.setInt(7, status);
            ps.setInt(8, hid);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateProduct(Product obj) {
        Connection con = DBCon.getConnection();
        String sql = "update SanPham set sname=?,quantity=?,price=?,picture=?,description=? where sid=?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, obj.getSname());
            pre.setInt(2, obj.getQuantity());
            pre.setDouble(3, obj.getPrice());
            pre.setString(4, obj.getPicture());
            pre.setString(5, obj.getDescription());
            pre.setString(6, obj.getSid());
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void changeStatus(String sid, int status) {
        Connection con = DBCon.getConnection();
        String sql = "update SanPham set status=" +(status == 1 ? 0 : 1) +" where sid=?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, sid);
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Product searchProduct(String search) {
        Connection con = DBCon.getConnection();
        String sql = "select * from SanPham where sname like '" +search+ "%'";
        try {
            Product product = new Product();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                product.setSid(rs.getString("sid"));
                product.setSname(rs.getString("sname"));
                product.setPicture(rs.getString("picture"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setHid(rs.getInt("hid"));
                product.setStatus(rs.getInt("status"));
            }
            return product;
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    // Phân trang product 
//    public ArrayList<Product> getListProductByNav(int hid, int minResult, int maxResult) {
//        Connection con = DBCon.getConnection();
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "select * from SanPham where hid = '" + hid + "' limit ?,?";
//        try {
//            PreparedStatement ps = con.prepareCall(sql);
//            ps.setInt(1, minResult);
//            ps.setInt(2, maxResult);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Product product = new Product();
//                product.setSid(rs.getString("sid"));
//                product.setSname(rs.getString("sname"));
//                product.setPicture(rs.getString("picture"));
//                product.setPrice(rs.getDouble("price"));
//                product.setDescription(rs.getString("description"));                
//                list.add(product);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return list;
//    }
//    
//    public int countProductByCategory(int hid) {
//        Connection con = DBCon.getConnection();
//        String sql = "select count(sid) from SanPham where hid = '" + hid + "'";
//        int count = 0;
//        try {
//            PreparedStatement ps = con.prepareCall(sql);
//            ResultSet rs = ps.executeQuery();       
//            while (rs.next()) {
//               count = rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return count;
//    }

    public static void main(String[] args) throws SQLException {
        DaoProduct dao = new DaoProduct();
    }

}
