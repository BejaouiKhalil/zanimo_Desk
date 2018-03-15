/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
@Entity
@Table(name = "annoncedresseur")
@NamedQueries({
    @NamedQuery(name = "Annoncedresseur.findAll", query = "SELECT a FROM Annoncedresseur a")})
public class Annoncedresseur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nom_salle")
    private String nomSalle;
    @Basic(optional = false)
    @Column(name = "adresse_salle")
    private String adresseSalle;
    @Basic(optional = false)
    @Column(name = "lng")
    private String lng;
    @Basic(optional = false)
    @Column(name = "lat")
    private String lat;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "numero_salle")
    private String numeroSalle;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "validation")
    private int validation;
    @Basic(optional = false)
    @Column(name = "datedeoffre")
    @Temporal(TemporalType.DATE)
    private Date datedeoffre;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @OneToOne
    private FosUser idUser;

    public Annoncedresseur() {
    }

    public Annoncedresseur(Integer id) {
        this.id = id;
    }

    public Annoncedresseur(Integer id, String nomSalle, String adresseSalle, String lng, String lat, String email, String numeroSalle, String description, int validation, Date datedeoffre) {
        this.id = id;
        this.nomSalle = nomSalle;
        this.adresseSalle = adresseSalle;
        this.lng = lng;
        this.lat = lat;
        this.email = email;
        this.numeroSalle = numeroSalle;
        this.description = description;
        this.validation = validation;
        this.datedeoffre = datedeoffre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public String getAdresseSalle() {
        return adresseSalle;
    }

    public void setAdresseSalle(String adresseSalle) {
        this.adresseSalle = adresseSalle;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(String numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValidation() {
        return validation;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

    public Date getDatedeoffre() {
        return datedeoffre;
    }

    public void setDatedeoffre(Date datedeoffre) {
        this.datedeoffre = datedeoffre;
    }

    public FosUser getIdUser() {
        return idUser;
    }

    public void setIdUser(FosUser idUser) {
        this.idUser = idUser;
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
        if (!(object instanceof Annoncedresseur)) {
            return false;
        }
        Annoncedresseur other = (Annoncedresseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Annoncedresseur[ id=" + id + " ]";
    }
    
}
