/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.zanimo.entities.FosUser;
import pi.zanimo.entities.Bill;
import pi.zanimo.entities.Orders;
import pi.zanimo.util.Dbcnx;
import sun.applet.Main;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class BillService {
    private Connection cnx = Dbcnx.getInstance().getConnection();
    
    public List<Bill> showAll(){
        List<Bill> lst = new ArrayList<Bill>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `bill`");
                
            while (rs.next()) {
                Bill blst = new Bill(rs.getInt(1));
                blst.setIdUser(new FosUser(rs.getInt(2)));
                blst.setIdOrder(new Orders(rs.getInt(3)));
                blst.setLstProd(rs.getString(4));
                lst.add(blst);
            }
            
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
        
    }
    
    public Bill findById(Integer id){
        Bill blst = new Bill(id);
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `bill` WHERE `id`="+id);
                
            while (rs.next()) {
                blst.setIdUser(new FosUser(rs.getInt(2)));
                blst.setIdOrder(new Orders(rs.getInt(3)));
                blst.setLstProd(rs.getString(4));
            }
            return blst;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void add(String idProd, FosUser user, Orders order){
        try {
            PreparedStatement prep = cnx.prepareStatement("INSERT INTO `bill` ( lst_prod, id_user, id_order ) VALUES (?,?,?) ");
            prep.setString(1, idProd);
            prep.setInt(2, user.getId());
            prep.setInt(3, order.getId());
            prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BillService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
