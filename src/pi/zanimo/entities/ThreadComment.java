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
public class ThreadComment implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String permalink;
    private boolean isCommentable;
    private int numComments;
    private Date lastCommentAt;
    private Collection<Comment> commentCollection;

    public ThreadComment() {
    }

    public ThreadComment(String id) {
        this.id = id;
    }

    public ThreadComment(String id, String permalink, boolean isCommentable, int numComments) {
        this.id = id;
        this.permalink = permalink;
        this.isCommentable = isCommentable;
        this.numComments = numComments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public boolean getIsCommentable() {
        return isCommentable;
    }

    public void setIsCommentable(boolean isCommentable) {
        this.isCommentable = isCommentable;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public Date getLastCommentAt() {
        return lastCommentAt;
    }

    public void setLastCommentAt(Date lastCommentAt) {
        this.lastCommentAt = lastCommentAt;
    }

    public Collection<Comment> getCommentCollection() {
        return commentCollection;
    }

    public void setCommentCollection(Collection<Comment> commentCollection) {
        this.commentCollection = commentCollection;
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
        if (!(object instanceof ThreadComment)) {
            return false;
        }
        ThreadComment other = (ThreadComment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ThreadComment[ id=" + id + " ]";
    }
    
}
