/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.test;

import pi.zanimo.util.Dbcnx;
import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class CnxBd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnx = Dbcnx.getInstance().getConnection();
        
    }
    
}
