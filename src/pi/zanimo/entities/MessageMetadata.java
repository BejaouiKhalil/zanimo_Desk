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
public class MessageMetadata implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private boolean isRead;
    private Message messageId;
    private FosUser participantId;

    public MessageMetadata() {
    }

    public MessageMetadata(Integer id) {
        this.id = id;
    }

    public MessageMetadata(Integer id, boolean isRead) {
        this.id = id;
        this.isRead = isRead;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public Message getMessageId() {
        return messageId;
    }

    public void setMessageId(Message messageId) {
        this.messageId = messageId;
    }

    public FosUser getParticipantId() {
        return participantId;
    }

    public void setParticipantId(FosUser participantId) {
        this.participantId = participantId;
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
        if (!(object instanceof MessageMetadata)) {
            return false;
        }
        MessageMetadata other = (MessageMetadata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.MessageMetadata[ id=" + id + " ]";
    }
    
}
