/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class FinancialTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String extendedData;
    private BigDecimal processedAmount;
    private String reasonCode;
    private String referenceNumber;
    private BigDecimal requestedAmount;
    private String responseCode;
    private short state;
    private Date createdAt;
    private Date updatedAt;
    private String trackingId;
    private short transactionType;
    private Payments paymentId;
    private Credits creditId;

    public FinancialTransactions() {
    }

    public FinancialTransactions(Integer id) {
        this.id = id;
    }

    public FinancialTransactions(Integer id, BigDecimal processedAmount, BigDecimal requestedAmount, short state, Date createdAt, short transactionType) {
        this.id = id;
        this.processedAmount = processedAmount;
        this.requestedAmount = requestedAmount;
        this.state = state;
        this.createdAt = createdAt;
        this.transactionType = transactionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExtendedData() {
        return extendedData;
    }

    public void setExtendedData(String extendedData) {
        this.extendedData = extendedData;
    }

    public BigDecimal getProcessedAmount() {
        return processedAmount;
    }

    public void setProcessedAmount(BigDecimal processedAmount) {
        this.processedAmount = processedAmount;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
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

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public short getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(short transactionType) {
        this.transactionType = transactionType;
    }

    public Payments getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payments paymentId) {
        this.paymentId = paymentId;
    }

    public Credits getCreditId() {
        return creditId;
    }

    public void setCreditId(Credits creditId) {
        this.creditId = creditId;
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
        if (!(object instanceof FinancialTransactions)) {
            return false;
        }
        FinancialTransactions other = (FinancialTransactions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.FinancialTransactions[ id=" + id + " ]";
    }
    
}
