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
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String lstProd;
    private Orders idOrder;
    private FosUser idUser;

    public Bill() {
    }

    public Bill(Integer id) {
        this.id = id;
    }

    public Bill(Integer id, String lstProd) {
        this.id = id;
        this.lstProd = lstProd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLstProd() {
        return lstProd;
    }

    public void setLstProd(String lstProd) {
        this.lstProd = lstProd;
    }

    public Orders getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Orders idOrder) {
        this.idOrder = idOrder;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pi.zanimo.entities.Bill[ id=" + id + " ]";
    }
    
}
