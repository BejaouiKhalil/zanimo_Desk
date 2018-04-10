/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTreeTableView;
import com.sun.jna.platform.win32.OaIdl;
import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.util.Duration;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.example.invoice.document.Invoice;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import pi.zanimo.entities.Accessory;
import pi.zanimo.entities.Animal;
import pi.zanimo.entities.Food;
import pi.zanimo.util.Cart;
import pi.zanimo.util.Product;
import pi.zanimo.util.Session;
import pi.zanimo.util.TabCart;

/**
 * FXML Controller class
 *
 * @author Ben Ghozzia Ahmed
 */
public class CartController implements Initializable {

    
    @FXML
    private JFXListView<TabCart> lst;
    ObservableList<TabCart> data = FXCollections.observableArrayList();
    @FXML
    private Label order;
    @FXML
    private JFXButton btnCheckout;
    
    
    
    static class Cell extends ListCell<TabCart>{
        HBox hbox = new HBox();
        JFXButton remove = new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.CLOSE, "16px"));
        HBox quantity = new HBox();
        TextField txtQuantity = new TextField();
        Label product = new Label();
        ImageView img = new ImageView();
        Label price = new Label();
        Label total = new Label();
        Pane pane = new Pane();
        JFXButton minus = new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.MINUS, "16px"));
        JFXButton plus = new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.PLUS, "16px"));
        
        public Cell(){
            super();
            txtQuantity.setPrefWidth(50);
            quantity.getChildren().addAll(minus,txtQuantity,plus);
            quantity.setAlignment(Pos.CENTER);
            hbox.getChildren().addAll(remove,img,product,pane,price,quantity,total);
            hbox.setHgrow(pane, Priority.ALWAYS);
            hbox.setSpacing(10);
            hbox.setAlignment(Pos.CENTER);
            remove.setOnAction((event) -> {
                System.out.println(Session.getInstance().getCart().getMap().toString());
                if(getItem().getType() == "Animal"){
                    Session.getInstance().getCart().removeProduct(new Animal(getItem().getId()));
                }
                if(getItem().getType() == "Food"){
                    Session.getInstance().getCart().removeProduct(new Food(getItem().getId()));
                }
                if(getItem().getType() == "Accessory"){
                    Session.getInstance().getCart().removeProduct(new Accessory(getItem().getId()));
                }
                getListView().getItems().remove(getItem());
                System.out.println(Session.getInstance().getCart().getMap().toString());
                
            });
            minus.setOnAction((event) -> {
                if(Integer.parseInt(txtQuantity.getText()) > 1){
                    txtQuantity.setText(Integer.toString(Integer.parseInt(txtQuantity.getText()) - 1));
                    total.setText(Double.toString(Double.parseDouble(price.getText())* Integer.parseInt(txtQuantity.getText())));
                    if(getItem().getType() == "Animal"){
                        Session.getInstance().getCart().addProduct(new Animal(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                    }
                    if(getItem().getType() == "Food"){
                        Session.getInstance().getCart().addProduct(new Food(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                    }
                    if(getItem().getType() == "Accessory"){
                        Session.getInstance().getCart().addProduct(new Accessory(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                    }
                }
            });
            
            txtQuantity.setOnAction((event) -> {
                total.setText(Double.toString(Double.parseDouble(price.getText())* Integer.parseInt(txtQuantity.getText())));
                if(getItem().getType() == "Animal"){
                    Session.getInstance().getCart().addProduct(new Animal(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                }
                if(getItem().getType() == "Food"){
                    Session.getInstance().getCart().addProduct(new Food(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                }
                if(getItem().getType() == "Accessory"){
                    Session.getInstance().getCart().addProduct(new Accessory(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                }
            });
            
            plus.setOnAction((event) -> {
                txtQuantity.setText(Integer.toString(Integer.parseInt(txtQuantity.getText()) + 1));
                total.setText(Double.toString(Double.parseDouble(price.getText())* Integer.parseInt(txtQuantity.getText())));
                if(getItem().getType() == "Animal"){
                    Session.getInstance().getCart().addProduct(new Animal(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                }
                if(getItem().getType() == "Food"){
                    Session.getInstance().getCart().addProduct(new Food(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                }
                if(getItem().getType() == "Accessory"){
                    Session.getInstance().getCart().addProduct(new Accessory(getItem().getId()),Integer.parseInt(txtQuantity.getText()));
                }
            });
        }
        
        @Override
        public void updateItem(TabCart item, boolean empty){
            super.updateItem(item, empty);
            
            if (empty || item == null || item == null) {
                setText(null);
                setGraphic(null);
            } else {
                
                txtQuantity.setText(Integer.toString(item.getQuantity()));
                total.setText(Double.toString(item.getQuantity() * item.getPrice()));
                price.setText(Double.toString(item.getPrice()));
                img.setImage(item.getImg());
                product.setText(item.getName());
                setGraphic(hbox);
                
            }
        }
                
                //new HBox(new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.MINUS, "16px")),new TextField(Integer.toString(quantity)),new JFXButton(null,GlyphsDude.createIcon(FontAwesomeIcon.PLUS, "16px")));
    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(0.5), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                order.setText(Double.toString(Session.getInstance().getCart().amount()));
         }
        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();
       
        
       
        
        
        for (Map.Entry<Product, Integer> entry : Session.getInstance().getCart().getMap().entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();
            if(key instanceof Animal)
                data.add(new TabCart(((Animal) key).getRace(), ((Animal) key).getPrix(), value, value * ((Animal) key).getPrix(),"http://127.0.0.1:8000/"+((Animal) key).getImage(),"Animal",((Animal) key).getId()));
            if(key instanceof Food)
                data.add(new TabCart(((Food) key).getNom(), ((Food) key).getPrix(), value, value * ((Food) key).getPrix(),"http://127.0.0.1:8000/"+((Food) key).getImage(),"Food",((Food) key).getId()));
            if(key instanceof Accessory)
                data.add(new TabCart(((Accessory) key).getName(), ((Accessory) key).getPrice(), value, value * ((Accessory) key).getPrice(),"http://127.0.0.1:8000/"+((Accessory) key).getImageUrl(),"Accessory",((Accessory) key).getId()));
         
            
        }
        
        lst.setItems(data);
        
        
        
        lst.setCellFactory(param -> new Cell(){});
    }    
    
    
    @FXML
    private void checkout(ActionEvent event){
        
        PDDocument pdfDocument = new PDDocument();
    	try {
	    	JSONObject jsonDocument = 
	    		(JSONObject)JSONValue
	    			.parse(new FileReader(new File("C:/Users/Ben Ghozzia Ahmed/Desktop/java-by-example-master/invoice/afew.json")));

	    	//Invoice invoice = new Invoice(jsonDocument);
                
                JSONObject mainJSON = new JSONObject();
                
                JSONObject shipTo = new JSONObject();
                JSONObject billTo = new JSONObject();
                JSONObject name = new JSONObject();
                name.put("first", Session.getInstance().getUser().getUsername());
                name.put("last", "");
                name.put("title", "");
                billTo.put("name", name);
                billTo.put("address1", "");
                billTo.put("address2", "");
                billTo.put("address3", "");
                billTo.put("city", "");
                billTo.put("state", "");
                billTo.put("zipCode", "");
                billTo.put("country", "");
                billTo.put("email", "");
                billTo.put("phone", "");
                
                
                shipTo.put("sameAsBilling", true);
                
                
                JSONObject invoiceHeader = new JSONObject();
                invoiceHeader.put("invoiceDate", DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()));
                invoiceHeader.put("invoiceNumber", "");
                
                
                JSONArray products = new JSONArray();
                
                for (Map.Entry<Product, Integer> entry : Session.getInstance().getCart().getMap().entrySet()) {
                    Product key = entry.getKey();
                    Integer value = entry.getValue();
                    JSONObject product = new JSONObject();
                    if(key instanceof Animal){
                        product.put("productId", Integer.toString(((Animal) key).getId()));
                        product.put("description", ((Animal) key).getRace());
                        product.put("quantity", Integer.toString(value));
                        product.put("unitPrice", Double.toString(((Animal) key).getPrix()));
                        products.add(product);
                    }if(key instanceof Food){
                        product.put("productId", Integer.toString(((Food) key).getId()));
                        product.put("description", ((Food) key).getNom());
                        product.put("quantity", Integer.toString(value));
                        product.put("unitPrice", Double.toString(((Food) key).getPrix()));
                        products.add(product);
                    }if(key instanceof Accessory){
                        product.put("productId", Integer.toString(((Accessory) key).getId()));
                        product.put("description", ((Accessory) key).getName());
                        product.put("quantity", Integer.toString(value));
                        product.put("unitPrice", Double.toString(((Accessory) key).getPrice()));
                        products.add(product);
                    }
                    
                }
                
                mainJSON.put("invoiceRows", products);
                mainJSON.put("notes", "");
                mainJSON.put("billTo", billTo);
                mainJSON.put("shipTo", shipTo);
                mainJSON.put("invoiceHeader", invoiceHeader);
                    System.out.println(mainJSON.toJSONString());
                Invoice invoice = new Invoice(mainJSON);

            PDPage pdfPage = new PDPage();
            pdfDocument.addPage(pdfPage);
            PDPageContentStream contents = new PDPageContentStream(pdfDocument, pdfPage);

            invoice.printPDF(pdfDocument, contents);            

            pdfDocument.save("single-invoice.pdf");
    	} catch (Exception e) {
    		e.printStackTrace();
        } finally {
            try {
                pdfDocument.close();    
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        
        
        /*btnCheckout.getScene().getWindow().hide();
        MainController mainController = new MainController();
        mainController.setStage("Bill.fxml",null);*/
    }
    
}
