/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class Credits implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private boolean attentionRequired;
    private Date createdAt;
    private BigDecimal creditedAmount;
    private BigDecimal creditingAmount;
    private BigDecimal reversingAmount;
    private short state;
    private BigDecimal targetAmount;
    private Date updatedAt;
    private Collection<FinancialTransactions> financialTransactionsCollection;
    private Payments paymentId;
    private PaymentInstructions paymentInstructionId;

    public Credits() {
    }

    public Credits(Integer id) {
        this.id = id;
    }

    public Credits(Integer id, boolean attentionRequired, Date createdAt, BigDecimal creditedAmount, BigDecimal creditingAmount, BigDecimal reversingAmount, short state, BigDecimal targetAmount) {
        this.id = id;
        this.attentionRequired = attentionRequired;
        this.createdAt = createdAt;
        this.creditedAmount = creditedAmount;
        this.creditingAmount = creditingAmount;
        this.reversingAmount = reversingAmount;
        this.state = state;
        this.targetAmount = targetAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getAttentionRequired() {
        return attentionRequired;
    }

    public void setAttentionRequired(boolean attentionRequired) {
        this.attentionRequired = attentionRequired;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getCreditedAmount() {
        return creditedAmount;
    }

    public void setCreditedAmount(BigDecimal creditedAmount) {
        this.creditedAmount = creditedAmount;
    }

    public BigDecimal getCreditingAmount() {
        return creditingAmount;
    }

    public void setCreditingAmount(BigDecimal creditingAmount) {
        this.creditingAmount = creditingAmount;
    }

    public BigDecimal getReversingAmount() {
        return reversingAmount;
    }

    public void setReversingAmount(BigDecimal reversingAmount) {
        this.reversingAmount = reversingAmount;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Collection<FinancialTransactions> getFinancialTransactionsCollection() {
        return financialTransactionsCollection;
    }

    public void setFinancialTransactionsCollection(Collection<FinancialTransactions> financialTransactionsCollection) {
        this.financialTransactionsCollection = financialTransactionsCollection;
    }

    public Payments getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payments paymentId) {
        this.paymentId = paymentId;
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
        if (!(object instanceof Credits)) {
            return false;
        }
        Credits other = (Credits) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Credits[ id=" + id + " ]";
    }
    
}
