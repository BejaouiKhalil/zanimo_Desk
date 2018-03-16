/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.test;

import org.json.JSONException;
import org.json.JSONObject;
import pi.zanimo.entities.FosUser;
import pi.zanimo.services.WishlistService;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class TestServiceWishlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WishlistService WS = new WishlistService();
        JSONObject jo = new JSONObject();
        
        try {
            jo.put("food", 1);
            jo.put("accessory", 6);
        } catch (JSONException jSONException) {
        }
        
        String idProd = jo.toString();
        FosUser user = new FosUser(3);
        
        //WS.add(idProd, user);
        
        //WS.update(1, idProd);
        
        //WS.delete(1);
        
        
        System.out.println(WS.showAll().toString());
        

        System.out.println(WS.findById(1).toString());
    }
    
}
