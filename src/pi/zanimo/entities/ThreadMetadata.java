/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ben Ghozzia Ahmed
 */
public class ThreadMetadata implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private boolean isDeleted;
    private Date lastParticipantMessageDate;
    private Date lastMessageDate;
    private FosUser participantId;
    private Thread threadId;

    public ThreadMetadata() {
    }

    public ThreadMetadata(Integer id) {
        this.id = id;
    }

    public ThreadMetadata(Integer id, boolean isDeleted) {
        this.id = id;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getLastParticipantMessageDate() {
        return lastParticipantMessageDate;
    }

    public void setLastParticipantMessageDate(Date lastParticipantMessageDate) {
        this.lastParticipantMessageDate = lastParticipantMessageDate;
    }

    public Date getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(Date lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public FosUser getParticipantId() {
        return participantId;
    }

    public void setParticipantId(FosUser participantId) {
        this.participantId = participantId;
    }

    public Thread getThreadId() {
        return threadId;
    }

    public void setThreadId(Thread threadId) {
        this.threadId = threadId;
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
        if (!(object instanceof ThreadMetadata)) {
            return false;
        }
        ThreadMetadata other = (ThreadMetadata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ThreadMetadata[ id=" + id + " ]";
    }
    
}
