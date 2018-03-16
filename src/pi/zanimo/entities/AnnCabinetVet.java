/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class AnnCabinetVet implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nomCabinet;
    private String adresseCabinet;
    private String lng;
    private String lat;
    private String email;
    private String numeroCabinet;
    private String description;
    private int validation;
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
