/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.util;


import java.util.HashMap;
import java.util.Map;
import pi.zanimo.entities.Accessory;
import pi.zanimo.entities.Animal;
import pi.zanimo.entities.Food;
import pi.zanimo.util.Product;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class Cart {
    
    private Map<Product, Integer> map = new HashMap<Product, Integer>();    
    private static Cart instance;
    
    private Cart(){
        
    }
    
    public void addProduct(Product Product, Integer qte){
        if(map.containsKey(Product))
            map.replace(Product, qte);
        else
            map.put(Product, qte);
    }
    
    
    public void removeProduct(Product Product){
        map.remove(Product);
    }
    
    public void clearCart(){
    }
    
    public static Cart getInstance(){
        if(instance == null){
            instance = new Cart();
            System.out.println("Cart Created");
        }
        return instance;
    }

    public Map<Product, Integer> getMap() {
        return map;
    }
    
    
    public double amount(){
        double amount = 0;
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();
            if(key instanceof Animal)
                amount = amount + ( ((Animal) key).getPrix() * value );
            if(key instanceof Food)
                amount = amount + ( ((Food) key).getPrix() * value );
            if(key instanceof Accessory)
                amount = amount + ( ((Accessory) key).getPrice() * value );
        }
        return amount;
    }
    
    
    
    
}
