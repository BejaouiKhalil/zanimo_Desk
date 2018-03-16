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
public class PaymentInstructions implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private BigDecimal amount;
    private BigDecimal approvedAmount;
    private BigDecimal approvingAmount;
    private Date createdAt;
    private BigDecimal creditedAmount;
    private BigDecimal creditingAmount;
    private String currency;
    private BigDecimal depositedAmount;
    private BigDecimal depositingAmount;
    private String extendedData;
    private String paymentSystemName;
    private BigDecimal reversingApprovedAmount;
    private BigDecimal reversingCreditedAmount;
    private BigDecimal reversingDepositedAmount;
    private short state;
    private Date updatedAt;
    private Collection<Payments> paymentsCollection;
    private Collection<Credits> creditsCollection;
    private Orders orders;

    public PaymentInstructions() {
    }

    public PaymentInstructions(Integer id) {
        this.id = id;
    }

    public PaymentInstructions(Integer id, BigDecimal amount, BigDecimal approvedAmount, BigDecimal approvingAmount, Date createdAt, BigDecimal creditedAmount, BigDecimal creditingAmount, String currency, BigDecimal depositedAmount, BigDecimal depositingAmount, String extendedData, String paymentSystemName, BigDecimal reversingApprovedAmount, BigDecimal reversingCreditedAmount, BigDecimal reversingDepositedAmount, short state) {
        this.id = id;
        this.amount = amount;
        this.approvedAmount = approvedAmount;
        this.approvingAmount = approvingAmount;
        this.createdAt = createdAt;
        this.creditedAmount = creditedAmount;
        this.creditingAmount = creditingAmount;
        this.currency = currency;
        this.depositedAmount = depositedAmount;
        this.depositingAmount = depositingAmount;
        this.extendedData = extendedData;
        this.paymentSystemName = paymentSystemName;
        this.reversingApprovedAmount = reversingApprovedAmount;
        this.reversingCreditedAmount = reversingCreditedAmount;
        this.reversingDepositedAmount = reversingDepositedAmount;
        this.state = state;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public String getExtendedData() {
        return extendedData;
    }

    public void setExtendedData(String extendedData) {
        this.extendedData = extendedData;
    }

    public String getPaymentSystemName() {
        return paymentSystemName;
    }

    public void setPaymentSystemName(String paymentSystemName) {
        this.paymentSystemName = paymentSystemName;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Collection<Payments> getPaymentsCollection() {
        return paymentsCollection;
    }

    public void setPaymentsCollection(Collection<Payments> paymentsCollection) {
        this.paymentsCollection = paymentsCollection;
    }

    public Collection<Credits> getCreditsCollection() {
        return creditsCollection;
    }

    public void setCreditsCollection(Collection<Credits> creditsCollection) {
        this.creditsCollection = creditsCollection;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
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
        if (!(object instanceof PaymentInstructions)) {
            return false;
        }
        PaymentInstructions other = (PaymentInstructions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PaymentInstructions[ id=" + id + " ]";
    }
    
}
