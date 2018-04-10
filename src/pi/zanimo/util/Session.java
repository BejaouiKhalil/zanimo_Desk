/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.zanimo.entities.FosUser;
import sun.applet.Main;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class Session {
    
    private FosUser user = null;
    private Cart cart = Cart.getInstance();
    private static Session instance;
    

    private Session() {
    }
    
    
    public static Session getInstance(){
        if(instance == null){
          instance=new Session();
          System.out.println("Session Start");
      }
      return instance;
    }
    
    public void setUser(Integer idUser){
        Connection cnx = Dbcnx.getInstance().getConnection();
        FosUser user = new FosUser();
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `fos_user` where `id`="+idUser);
            while (rs.next()) {
                user = new FosUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getBoolean(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getString(12),rs.getString(13),rs.getString(14));
            }
            this.user = user;
            System.out.println("User Set");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public FosUser getUser(){
        if(instance != null)
            return user;
        else
            return null;
    }
    
    public void logout(){
        this.user = null;
    }
    
    public Cart getCart(){
        return cart;
    }
    
    
    
}
