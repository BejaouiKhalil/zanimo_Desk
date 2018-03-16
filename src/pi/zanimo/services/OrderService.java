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
import pi.zanimo.entities.Orders;
import pi.zanimo.util.Dbcnx;
import sun.applet.Main;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class OrderService {
    
    private Connection cnx = Dbcnx.getInstance().getConnection();
    
    public List<Orders> showAll(){
        List<Orders> lst = new ArrayList<Orders>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `orders`");
                
            while (rs.next()) {
                lst.add(new Orders(rs.getInt(1),rs.getBigDecimal(3)));
            }
            
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
        
    }
    
    public Orders findById(Integer id){
        Orders odr = new Orders();
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `orders` where `id`="+id);
                
            while (rs.next()) {
                odr = new Orders(rs.getInt(1),rs.getBigDecimal(3));
            }
            return odr;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
