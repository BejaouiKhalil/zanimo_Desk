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
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String body;
    private Date createdAt;
    private Thread threadId;
    private FosUser senderId;
    private Collection<MessageMetadata> messageMetadataCollection;

    public Message() {
    }

    public Message(Integer id) {
        this.id = id;
    }

    public Message(Integer id, String body, Date createdAt) {
        this.id = id;
        this.body = body;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Thread getThreadId() {
        return threadId;
    }

    public void setThreadId(Thread threadId) {
        this.threadId = threadId;
    }

    public FosUser getSenderId() {
        return senderId;
    }

    public void setSenderId(FosUser senderId) {
        this.senderId = senderId;
    }

    public Collection<MessageMetadata> getMessageMetadataCollection() {
        return messageMetadataCollection;
    }

    public void setMessageMetadataCollection(Collection<MessageMetadata> messageMetadataCollection) {
        this.messageMetadataCollection = messageMetadataCollection;
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
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Message[ id=" + id + " ]";
    }
    
}
