/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.util;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class TabCart {
    private String name;
    private double price;
    private Integer quantity;
    private double total;
    private JFXButton button;
    private HBox hbox;
    private Image img;
    private Integer id;
    private String type;

    public HBox getHbox() {
        return hbox;
    }

    public void setHbox(HBox hbox) {
        this.hbox = hbox;
    }

    public TabCart(String name, double price, Integer quantity, double total, String img, String type, Integer id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.button = new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.CLOSE, "16px"));
        this.hbox = new HBox(new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.MINUS, "16px")),new TextField(Integer.toString(quantity)),new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.PLUS, "16px")));
        this.type = type;
        this.id = id;
        this.img = new Image(img,100,100,false,false);
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(JFXButton button) {
        this.button = button;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
