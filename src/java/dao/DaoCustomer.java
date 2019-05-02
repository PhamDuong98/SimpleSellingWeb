/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Product;

/**
 *
 * @author Duong
 */
public class DaoCustomer {
    
    DBConnection DBCon = new DBConnection();
    Connection con = DBCon.getConnection();
    
    
    public void addCustomer(Customer obj) {
        String sql = "Insert into KhachHang(cname,address,phone,username,password,status)"
                + " values(?,?,?,?,?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, obj.getCname());
            pre.setString(2, obj.getAddress());
            pre.setString(3, obj.getPhone());
            pre.setString(4, obj.getUsername());
            pre.setString(5, obj.getPassword());
            pre.setInt(6, 1);
            pre.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DaoCustomer.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public ArrayList<Customer> getCustomerInfo() {
        String sql = "select * from KhachHang where status = 1";
        ArrayList<Customer> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCid(rs.getInt("cid"));
                customer.setCname(rs.getString("cname"));
                customer.setAddress(rs.getString("address"));
                customer.setUsername(rs.getString("username"));
                customer.setPhone(rs.getString("phone"));
                customer.setPassword(rs.getString("password"));
                customer.setStatus(rs.getInt("status"));
                list.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
          
    public Customer checkLogin(String username,String password) {
        String sql="select * from KhachHang where username=? and password=? and status=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);         
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3,1);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                return customer;
            }
//            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void updateCustomerInfo(int cid,String cname,String address,String phone,String password) {
        String sql = "update KhachHang set cname=?,address=?,phone=?,password=? where cid=?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, cname);
            pre.setString(2, address);
            pre.setString(3, phone);
            pre.setString(4, password);
            pre.setInt(5, cid);
            pre.executeUpdate();
        } catch(SQLException ex) {
            Logger.getLogger(DaoCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void changeStatus(String userName, int status) {
        String sql = "update KhachHang set status=" +(status == 1 ? 0 : 1) +" where username=?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, userName);
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        DaoCustomer dao = new DaoCustomer();
        dao.changeStatus("luudat123", 0);
    }
    
}
