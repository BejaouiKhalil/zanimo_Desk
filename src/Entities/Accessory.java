/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
@Entity
@Table(name = "accessory")
@NamedQueries({
    @NamedQuery(name = "Accessory.findAll", query = "SELECT a FROM Accessory a")})
public class Accessory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "image_url")
    private String imageUrl;
    @Basic(optional = false)
    @Column(name = "stock")
    private int stock;
    @Column(name = "rate")
    private Integer rate;
    @Column(name = "promo")
    private Integer promo;
    @Basic(optional = false)
    @Column(name = "inserted")
    @Temporal(TemporalType.DATE)
    private Date inserted;
    @Column(name = "modificated")
    @Temporal(TemporalType.DATE)
    private Date modificated;
    @OneToMany(mappedBy = "accessoryId")
    private Collection<Image> imageCollection;
    @OneToMany(mappedBy = "accessoryId")
    private Collection<Rateacces> rateaccesCollection;

    public Accessory() {
    }

    public Accessory(Integer id) {
        this.id = id;
    }

    public Accessory(Integer id, String name, String description, double price, String type, String imageUrl, int stock, Date inserted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
        this.imageUrl = imageUrl;
        this.stock = stock;
        this.inserted = inserted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getPromo() {
        return promo;
    }

    public void setPromo(Integer promo) {
        this.promo = promo;
    }

    public Date getInserted() {
        return inserted;
    }

    public void setInserted(Date inserted) {
        this.inserted = inserted;
    }

    public Date getModificated() {
        return modificated;
    }

    public void setModificated(Date modificated) {
        this.modificated = modificated;
    }

    public Collection<Image> getImageCollection() {
        return imageCollection;
    }

    public void setImageCollection(Collection<Image> imageCollection) {
        this.imageCollection = imageCollection;
    }

    public Collection<Rateacces> getRateaccesCollection() {
        return rateaccesCollection;
    }

    public void setRateaccesCollection(Collection<Rateacces> rateaccesCollection) {
        this.rateaccesCollection = rateaccesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accessory)) {
            return false;
        }
        Accessory other = (Accessory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Accessory[ id=" + id + " ]";
    }
    
}
