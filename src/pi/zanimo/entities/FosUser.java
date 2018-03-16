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
public class FosUser implements Serializable {

    private Wishlist wishlist;

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String usernameCanonical;
    private String email;
    private String emailCanonical;
    private boolean enabled;
    private String salt;
    private String password;
    private Date lastLogin;
    private String confirmationToken;
    private Date passwordRequestedAt;
    private String roles;
    private String adresse;
    private String profilePic;
    private String city;
    private int zipCodes;
    private String state;
    private String sexe;
    private String phoneNumber;
    private Annoncedresseur annoncedresseur;
    private Collection<Post> postCollection;
    private AnnCabinetVet annCabinetVet;
    private Collection<ThreadMetadata> threadMetadataCollection;
    private Collection<Commentaire> commentaireCollection;
    private Collection<Thread> threadCollection;
    private Collection<Message> messageCollection;
    private Collection<MessageMetadata> messageMetadataCollection;
    private Collection<LostAnimal> lostAnimalCollection;
    private Collection<Comment> commentCollection;

    public FosUser() {
    }

    public FosUser(Integer id) {
        this.id = id;
    }

    public FosUser(Integer id, String username, String usernameCanonical, String email, String emailCanonical, boolean enabled, String password, String roles, String adresse, String city, int zipCodes, String state, String sexe, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.usernameCanonical = usernameCanonical;
        this.email = email;
        this.emailCanonical = emailCanonical;
        this.enabled = enabled;
        this.password = password;
        this.roles = roles;
        this.adresse = adresse;
        this.city = city;
        this.zipCodes = zipCodes;
        this.state = state;
        this.sexe = sexe;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernameCanonical() {
        return usernameCanonical;
    }

    public void setUsernameCanonical(String usernameCanonical) {
        this.usernameCanonical = usernameCanonical;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCanonical() {
        return emailCanonical;
    }

    public void setEmailCanonical(String emailCanonical) {
        this.emailCanonical = emailCanonical;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public Date getPasswordRequestedAt() {
        return passwordRequestedAt;
    }

    public void setPasswordRequestedAt(Date passwordRequestedAt) {
        this.passwordRequestedAt = passwordRequestedAt;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(int zipCodes) {
        this.zipCodes = zipCodes;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Annoncedresseur getAnnoncedresseur() {
        return annoncedresseur;
    }

    public void setAnnoncedresseur(Annoncedresseur annoncedresseur) {
        this.annoncedresseur = annoncedresseur;
    }

    public Collection<Post> getPostCollection() {
        return postCollection;
    }

    public void setPostCollection(Collection<Post> postCollection) {
        this.postCollection = postCollection;
    }

    public AnnCabinetVet getAnnCabinetVet() {
        return annCabinetVet;
    }

    public void setAnnCabinetVet(AnnCabinetVet annCabinetVet) {
        this.annCabinetVet = annCabinetVet;
    }

    public Collection<ThreadMetadata> getThreadMetadataCollection() {
        return threadMetadataCollection;
    }

    public void setThreadMetadataCollection(Collection<ThreadMetadata> threadMetadataCollection) {
        this.threadMetadataCollection = threadMetadataCollection;
    }

    public Collection<Commentaire> getCommentaireCollection() {
        return commentaireCollection;
    }

    public void setCommentaireCollection(Collection<Commentaire> commentaireCollection) {
        this.commentaireCollection = commentaireCollection;
    }

    public Collection<Thread> getThreadCollection() {
        return threadCollection;
    }

    public void setThreadCollection(Collection<Thread> threadCollection) {
        this.threadCollection = threadCollection;
    }

    public Collection<Message> getMessageCollection() {
        return messageCollection;
    }

    public void setMessageCollection(Collection<Message> messageCollection) {
        this.messageCollection = messageCollection;
    }

    public Collection<MessageMetadata> getMessageMetadataCollection() {
        return messageMetadataCollection;
    }

    public void setMessageMetadataCollection(Collection<MessageMetadata> messageMetadataCollection) {
        this.messageMetadataCollection = messageMetadataCollection;
    }

    public Collection<LostAnimal> getLostAnimalCollection() {
        return lostAnimalCollection;
    }

    public void setLostAnimalCollection(Collection<LostAnimal> lostAnimalCollection) {
        this.lostAnimalCollection = lostAnimalCollection;
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
        if (!(object instanceof FosUser)) {
            return false;
        }
        FosUser other = (FosUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.FosUser[ id=" + id + " ]";
    }

    public Wishlist getWishlist() {
        return wishlist;
    }

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
    }
    
}
