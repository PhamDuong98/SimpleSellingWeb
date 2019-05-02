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
import model.Category;

/**
 *
 * @author Duong
 */
public class DaoCategory {

    DBConnection DBCon = new DBConnection();
    Connection conn = DBCon.getConnection();

    public ArrayList<Category> getListCategory() {

        String sql = "select * from HangSanXuat where status=1";
        ArrayList<Category> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Category category = new Category();
                category.setHid(rs.getInt("hid"));
                category.setHname(rs.getString("hname"));
                category.setWebsite(rs.getString("website"));
                category.setStatus(rs.getInt("status"));
                list.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<Category> getAllListCategory() {

        String sql = "select * from HangSanXuat";
        ArrayList<Category> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Category category = new Category();
                category.setHid(rs.getInt("hid"));
                category.setHname(rs.getString("hname"));
                category.setWebsite(rs.getString("website"));
                category.setStatus(rs.getInt("status"));
                list.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Category getCategory(int hid) {

        String sql = "select * from HangSanXuat where hid='" + hid + "'";
        try {
            Category category = new Category();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category.setHid(rs.getInt("hid"));
                category.setHname(rs.getString("hname"));
                category.setWebsite(rs.getString("website"));
                category.setStatus(rs.getInt("status"));
            }
            return category;
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean insertCategory(String hname, String website, int status) {
        String sql = "insert into HangSanXuat" + " values(?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, hname);
            pre.setString(2, website);
            pre.setInt(3, status);
            int temp = pre.executeUpdate();
            return temp == 1;
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void updateCategory(Category obj) {
        String sql = "update HangSanXuat set hname = ?,website = ?,status = ? where hid = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, obj.getHname());
            ps.setString(2, obj.getWebsite());
            ps.setInt(3, obj.getStatus());
            ps.setInt(4, obj.getHid());
//            int temp = ps.executeUpdate();
//            return temp == 1;
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
        }
    }

    public void changeStatus(String hid, int status) {
        Connection con = DBCon.getConnection();
        String sql = "update HangSanXuat set status=" + (status == 1 ? 0 : 1) + " where hid=?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, hid);
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean deleteCategory(int hid) {
        try {
            String sql = "delete from HangSanXuat where hid = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hid);
            int temp = ps.executeUpdate();
            return temp == 1;
        } catch (SQLException ex) {
            Logger.getLogger(DaoCategory.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static void main(String[] args) {
        DaoCategory dao = new DaoCategory();

    }
}
