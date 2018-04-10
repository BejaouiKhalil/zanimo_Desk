/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.test;

import pi.zanimo.services.UserService;
import pi.zanimo.util.Session;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class TestServiceUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserService.login("test2", "test2");
        System.out.println(Session.getInstance().toString());
        System.out.println(UserService.isLoggedIn());
        UserService.logout();
        System.out.println(UserService.isLoggedIn());
        UserService.login("test2", "test2");
        System.out.println(Session.getInstance().toString());
        System.out.println(UserService.isLoggedIn());
    }
    
}
