
package dao;

import connect.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;


public class DaoAdmin {
    
    DBConnection DBCon = new DBConnection();
    Connection con = DBCon.getConnection();
    
    public Admin checkLogin(String username,String password) {
        String sql="select * from Admin where username=? and password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);         
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Admin admin = new Admin(rs.getString(1), rs.getString(2),rs.getInt(3));
                return admin;
            }
//            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
