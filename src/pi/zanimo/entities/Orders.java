/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private BigDecimal amount;
    private PaymentInstructions paymentInstructionId;

    public Orders() {
    }

    public Orders(Integer id) {
        this.id = id;
    }

    public Orders(Integer id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentInstructions getPaymentInstructionId() {
        return paymentInstructionId;
    }

    public void setPaymentInstructionId(PaymentInstructions paymentInstructionId) {
        this.paymentInstructionId = paymentInstructionId;
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Orders[ id=" + id + " ]";
    }
    
}
