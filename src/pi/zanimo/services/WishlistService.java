/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.services;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.zanimo.entities.FosUser;
import pi.zanimo.entities.Wishlist;
import pi.zanimo.util.Dbcnx;
import sun.applet.Main;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class WishlistService {
    
    private Connection cnx = Dbcnx.getInstance().getConnection();
    
    public List<Wishlist> showAll(){
        List<Wishlist> lst = new ArrayList<Wishlist>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `wishlist`");
                
            while (rs.next()) {
                Wishlist wlst = new Wishlist(rs.getInt(1));
                wlst.setIdProd(rs.getString(2));
                wlst.setIdUser(rs.getObject(3,FosUser.class));
                lst.add(wlst);
            }
            
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
        
    }
    
    public Wishlist findById(Integer id){
        Wishlist wlst = new Wishlist();
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `wishlist` WHERE `id`="+id);
                
            while (rs.next()) {
                wlst = new Wishlist(rs.getInt(1));
                wlst.setIdProd(rs.getString(2));
                wlst.setIdUser(rs.getObject(3,FosUser.class));
            }
            return wlst;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void update(Integer id, String idProd){
        try {
            PreparedStatement prep = cnx.prepareStatement("UPDATE `wishlist` SET `id_prod`=? WHERE id =" + id);
            prep.setString(1, idProd);
            prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(WishlistService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(Integer id){
        try {
            PreparedStatement prep = cnx.prepareStatement("DELETE FROM `wishlist` WHERE id =" + id);
            prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(WishlistService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void add(String idProd, FosUser user){
        try {
            PreparedStatement prep = cnx.prepareStatement("INSERT INTO `wishlist` ( id_prod, id_user ) VALUES (?,?) ");
            prep.setString(1, idProd);
            prep.setInt(2, user.getId());
            prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(WishlistService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
