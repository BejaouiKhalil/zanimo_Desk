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
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
@Entity
@Table(name = "payment_instructions")
@NamedQueries({
    @NamedQuery(name = "PaymentInstructions.findAll", query = "SELECT p FROM PaymentInstructions p")})
public class PaymentInstructions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "approved_amount")
    private BigDecimal approvedAmount;
    @Basic(optional = false)
    @Column(name = "approving_amount")
    private BigDecimal approvingAmount;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "credited_amount")
    private BigDecimal creditedAmount;
    @Basic(optional = false)
    @Column(name = "crediting_amount")
    private BigDecimal creditingAmount;
    @Basic(optional = false)
    @Column(name = "currency")
    private String currency;
    @Basic(optional = false)
    @Column(name = "deposited_amount")
    private BigDecimal depositedAmount;
    @Basic(optional = false)
    @Column(name = "depositing_amount")
    private BigDecimal depositingAmount;
    @Basic(optional = false)
    @Lob
    @Column(name = "extended_data")
    private String extendedData;
    @Basic(optional = false)
    @Column(name = "payment_system_name")
    private String paymentSystemName;
    @Basic(optional = false)
    @Column(name = "reversing_approved_amount")
    private BigDecimal reversingApprovedAmount;
    @Basic(optional = false)
    @Column(name = "reversing_credited_amount")
    private BigDecimal reversingCreditedAmount;
    @Basic(optional = false)
    @Column(name = "reversing_deposited_amount")
    private BigDecimal reversingDepositedAmount;
    @Basic(optional = false)
    @Column(name = "state")
    private short state;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentInstructionId")
    private Collection<Payments> paymentsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentInstructionId")
    private Collection<Credits> creditsCollection;
    @OneToOne(mappedBy = "paymentInstructionId")
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
