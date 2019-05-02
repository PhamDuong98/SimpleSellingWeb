/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import connect.DBConnection;
import dao.DaoCustomer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duong
 */
public class Validate {
       
    DBConnection DBCon = new DBConnection();
    
    public boolean checkUsername(String username) {
        Connection con = DBCon.getConnection();
        String sql="select * from KhachHang where username='" +username+"'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                con.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
