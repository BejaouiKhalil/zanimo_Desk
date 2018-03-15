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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
@Entity
@Table(name = "rateacces")
@NamedQueries({
    @NamedQuery(name = "Rateacces.findAll", query = "SELECT r FROM Rateacces r")})
public class Rateacces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "stars")
    private int stars;
    @Basic(optional = false)
    @Column(name = "note")
    private String note;
    @JoinColumn(name = "accessory_id", referencedColumnName = "id")
    @ManyToOne
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
