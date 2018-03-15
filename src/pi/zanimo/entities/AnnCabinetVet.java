/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;
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

/**
 *
 * @author Ben Ghozzia Ahmed
 */
@Entity
@Table(name = "ann__cabinet__vet")
@NamedQueries({
    @NamedQuery(name = "AnnCabinetVet.findAll", query = "SELECT a FROM AnnCabinetVet a")})
public class AnnCabinetVet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nom_cabinet")
    private String nomCabinet;
    @Basic(optional = false)
    @Column(name = "adresse_cabinet")
    private String adresseCabinet;
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
    @Column(name = "numero_cabinet")
    private String numeroCabinet;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "validation")
    private int validation;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @OneToOne
    private FosUser idUser;

    public AnnCabinetVet() {
    }

    public AnnCabinetVet(Integer id) {
        this.id = id;
    }

    public AnnCabinetVet(Integer id, String nomCabinet, String adresseCabinet, String lng, String lat, String email, String numeroCabinet, String description, int validation) {
        this.id = id;
        this.nomCabinet = nomCabinet;
        this.adresseCabinet = adresseCabinet;
        this.lng = lng;
        this.lat = lat;
        this.email = email;
        this.numeroCabinet = numeroCabinet;
        this.description = description;
        this.validation = validation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomCabinet() {
        return nomCabinet;
    }

    public void setNomCabinet(String nomCabinet) {
        this.nomCabinet = nomCabinet;
    }

    public String getAdresseCabinet() {
        return adresseCabinet;
    }

    public void setAdresseCabinet(String adresseCabinet) {
        this.adresseCabinet = adresseCabinet;
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

    public String getNumeroCabinet() {
        return numeroCabinet;
    }

    public void setNumeroCabinet(String numeroCabinet) {
        this.numeroCabinet = numeroCabinet;
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
        if (!(object instanceof AnnCabinetVet)) {
            return false;
        }
        AnnCabinetVet other = (AnnCabinetVet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.AnnCabinetVet[ id=" + id + " ]";
    }
    
}
