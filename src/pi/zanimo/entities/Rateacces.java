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
public class Rateacces implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private int userId;
    private int stars;
    private String note;
    private Accessory accessoryId;

    public Rateacces() {
    }

    public Rateacces(Integer id) {
        this.id = id;
    }

    public Rateacces(Integer id, int userId, int stars, String note) {
        this.id = id;
        this.userId = userId;
        this.stars = stars;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Accessory getAccessoryId() {
        return accessoryId;
    }

    public void setAccessoryId(Accessory accessoryId) {
        this.accessoryId = accessoryId;
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
        if (!(object instanceof Rateacces)) {
            return false;
        }
        Rateacces other = (Rateacces) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Rateacces[ id=" + id + " ]";
    }
    
}
