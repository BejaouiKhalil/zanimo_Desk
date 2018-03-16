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
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private BigDecimal approvedAmount;
    private BigDecimal approvingAmount;
    private BigDecimal creditedAmount;
    private BigDecimal creditingAmount;
    private BigDecimal depositedAmount;
    private BigDecimal depositingAmount;
    private Date expirationDate;
    private BigDecimal reversingApprovedAmount;
    private BigDecimal reversingCreditedAmount;
    private BigDecimal reversingDepositedAmount;
    private short state;
    private BigDecimal targetAmount;
    private boolean attentionRequired;
    private boolean expired;
    private Date createdAt;
    private Date updatedAt;
    private PaymentInstructions paymentInstructionId;
    private Collection<FinancialTransactions> financialTransactionsCollection;
    private Collection<Credits> creditsCollection;

    public Payments() {
    }

    public Payments(Integer id) {
        this.id = id;
    }

    public Payments(Integer id, BigDecimal approvedAmount, BigDecimal approvingAmount, BigDecimal creditedAmount, BigDecimal creditingAmount, BigDecimal depositedAmount, BigDecimal depositingAmount, BigDecimal reversingApprovedAmount, BigDecimal reversingCreditedAmount, BigDecimal reversingDepositedAmount, short state, BigDecimal targetAmount, boolean attentionRequired, boolean expired, Date createdAt) {
        this.id = id;
        this.approvedAmount = approvedAmount;
        this.approvingAmount = approvingAmount;
        this.creditedAmount = creditedAmount;
        this.creditingAmount = creditingAmount;
        this.depositedAmount = depositedAmount;
        this.depositingAmount = depositingAmount;
        this.reversingApprovedAmount = reversingApprovedAmount;
        this.reversingCreditedAmount = reversingCreditedAmount;
        this.reversingDepositedAmount = reversingDepositedAmount;
        this.state = state;
        this.targetAmount = targetAmount;
        this.attentionRequired = attentionRequired;
        this.expired = expired;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(BigDecimal approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public BigDecimal getApprovingAmount() {
        return approvingAmount;
    }

    public void setApprovingAmount(BigDecimal approvingAmount) {
        this.approvingAmount = approvingAmount;
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

    public BigDecimal getDepositedAmount() {
        return depositedAmount;
    }

    public void setDepositedAmount(BigDecimal depositedAmount) {
        this.depositedAmount = depositedAmount;
    }

    public BigDecimal getDepositingAmount() {
        return depositingAmount;
    }

    public void setDepositingAmount(BigDecimal depositingAmount) {
        this.depositingAmount = depositingAmount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getReversingApprovedAmount() {
        return reversingApprovedAmount;
    }

    public void setReversingApprovedAmount(BigDecimal reversingApprovedAmount) {
        this.reversingApprovedAmount = reversingApprovedAmount;
    }

    public BigDecimal getReversingCreditedAmount() {
        return reversingCreditedAmount;
    }

    public void setReversingCreditedAmount(BigDecimal reversingCreditedAmount) {
        this.reversingCreditedAmount = reversingCreditedAmount;
    }

    public BigDecimal getReversingDepositedAmount() {
        return reversingDepositedAmount;
    }

    public void setReversingDepositedAmount(BigDecimal reversingDepositedAmount) {
        this.reversingDepositedAmount = reversingDepositedAmount;
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

    public boolean getAttentionRequired() {
        return attentionRequired;
    }

    public void setAttentionRequired(boolean attentionRequired) {
        this.attentionRequired = attentionRequired;
    }

    public boolean getExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PaymentInstructions getPaymentInstructionId() {
        return paymentInstructionId;
    }

    public void setPaymentInstructionId(PaymentInstructions paymentInstructionId) {
        this.paymentInstructionId = paymentInstructionId;
    }

    public Collection<FinancialTransactions> getFinancialTransactionsCollection() {
        return financialTransactionsCollection;
    }

    public void setFinancialTransactionsCollection(Collection<FinancialTransactions> financialTransactionsCollection) {
        this.financialTransactionsCollection = financialTransactionsCollection;
    }

    public Collection<Credits> getCreditsCollection() {
        return creditsCollection;
    }

    public void setCreditsCollection(Collection<Credits> creditsCollection) {
        this.creditsCollection = creditsCollection;
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
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Payments[ id=" + id + " ]";
    }
    
}
