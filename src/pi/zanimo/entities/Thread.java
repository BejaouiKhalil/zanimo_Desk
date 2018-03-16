/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class Thread implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String subject;
    private Date createdAt;
    private boolean isSpam;
    private Collection<ThreadMetadata> threadMetadataCollection;
    private FosUser createdById;
    private Collection<Message> messageCollection;

    public Thread() {
    }

    public Thread(Integer id) {
        this.id = id;
    }

    public Thread(Integer id, String subject, Date createdAt, boolean isSpam) {
        this.id = id;
        this.subject = subject;
        this.createdAt = createdAt;
        this.isSpam = isSpam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean getIsSpam() {
        return isSpam;
    }

    public void setIsSpam(boolean isSpam) {
        this.isSpam = isSpam;
    }

    public Collection<ThreadMetadata> getThreadMetadataCollection() {
        return threadMetadataCollection;
    }

    public void setThreadMetadataCollection(Collection<ThreadMetadata> threadMetadataCollection) {
        this.threadMetadataCollection = threadMetadataCollection;
    }

    public FosUser getCreatedById() {
        return createdById;
    }

    public void setCreatedById(FosUser createdById) {
        this.createdById = createdById;
    }

    public Collection<Message> getMessageCollection() {
        return messageCollection;
    }

    public void setMessageCollection(Collection<Message> messageCollection) {
        this.messageCollection = messageCollection;
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
        if (!(object instanceof Thread)) {
            return false;
        }
        Thread other = (Thread) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Thread[ id=" + id + " ]";
    }
    
}
