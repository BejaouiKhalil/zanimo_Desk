/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Dbcnx {
    String url="jdbc:mysql://localhost/zanimouu";
    String login="root";
    String pwd="";
    Connection cnx;
    private static Dbcnx instance;

    private Dbcnx() {
        try {
            cnx= DriverManager.getConnection(url, login, pwd);
        } catch (SQLException e){
            System.out.println("probleme dans la connection a la base de données");
            e.printStackTrace();
        }
    }
  public static Dbcnx getInstance(){
      if(instance == null){
          instance=new Dbcnx();
          System.out.println("Connection etablie !");
      }
      return instance;
  }
   
 public Connection getConnection(){
     return cnx;
 }
    
}
