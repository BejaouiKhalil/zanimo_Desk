/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.services;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import pi.zanimo.entities.FosUser;
import pi.zanimo.util.Dbcnx;
import pi.zanimo.util.Session;
import sun.applet.Main;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class UserService {
    
    public static boolean login(String username, String password){
        String result = "";
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("http://127.0.0.1:8000/checkpassword");
        
        ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(2);
        params.add(new BasicNameValuePair("username", username));
        params.add(new BasicNameValuePair("password", password));
        
        try {
            httppost.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            
            if (entity != null) {
                InputStream instream = entity.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
                StringBuilder out = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {                    
                    out.append(line);
                }
                result = out.toString();
                
                reader.close();
            }
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (!result.equals("Failed")) {
            Session.getInstance().setUser(Integer.valueOf(result));
            return true;
        }else{
            System.out.println("Login Failed");
            return false;
        }
    }
    
    public static boolean isLoggedIn(){
        if(Session.getInstance().getUser() != null)
            return true;
        else
            return false;
    }
    
    public static void register(){
        
    }
    
    public FosUser getUser(Integer idUser){
        Connection cnx = Dbcnx.getInstance().getConnection();
        FosUser user = new FosUser();
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM `fos_user` where `id`="+idUser);
            while (rs.next()) {
                user = new FosUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getBoolean(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getString(12),rs.getString(13),rs.getString(14));
            }
            return user;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static void logout(){
        Session.getInstance().logout();
    }
    
}
