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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String body;
    private Date createdAt;
    private String ancestors;
    private int depth;
    private int state;
    private ThreadComment threadId;
    private FosUser authorId;

    public Comment() {
    }

    public Comment(Integer id) {
        this.id = id;
    }

    public Comment(Integer id, String body, Date createdAt, String ancestors, int depth, int state) {
        this.id = id;
        this.body = body;
        this.createdAt = createdAt;
        this.ancestors = ancestors;
        this.depth = depth;
        this.state = state;
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

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public ThreadComment getThreadId() {
        return threadId;
    }

    public void setThreadId(ThreadComment threadId) {
        this.threadId = threadId;
    }

    public FosUser getAuthorId() {
        return authorId;
    }

    public void setAuthorId(FosUser authorId) {
        this.authorId = authorId;
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
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Comment[ id=" + id + " ]";
    }
    
}
