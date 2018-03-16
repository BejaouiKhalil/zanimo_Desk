/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;
import java.util.Collection;
/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String image;
    private String type;
    private double prix;
    private String race;
    private String gendere;
    private double age;
    private String description;
    private Collection<Rateanimal> rateanimalCollection;

    public Animal() {
    }

    public Animal(Integer id) {
        this.id = id;
    }

    public Animal(Integer id, String image, String type, double prix, String race, String gendere, double age, String description) {
        this.id = id;
        this.image = image;
        this.type = type;
        this.prix = prix;
        this.race = race;
        this.gendere = gendere;
        this.age = age;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGendere() {
        return gendere;
    }

    public void setGendere(String gendere) {
        this.gendere = gendere;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Rateanimal> getRateanimalCollection() {
        return rateanimalCollection;
    }

    public void setRateanimalCollection(Collection<Rateanimal> rateanimalCollection) {
        this.rateanimalCollection = rateanimalCollection;
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
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Animal[ id=" + id + " ]";
    }
    
}
