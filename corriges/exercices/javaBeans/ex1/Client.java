/**
 * Exercice JavaBean 1
 * 
 * Créer un JavaBean Client ayant les propriétés suivantes :
 * id, nom, prenom, societe, courriel, telFixe, telMobile, notes, actif
 */

package corriges.exercices.javaBeans.ex1;

import java.io.Serializable;

// JavaBean Client
public class Client implements Serializable {
    // Propriétés
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nom;
    private String prenom;
    private String societe;
    private String courriel;
    private String telFixe;
    private String telMobile;
    private String notes;
    private Boolean actif;

    // Constructeurs
    public Client() {}

    public Client(Integer id, String nom, String prenom, String societe, String courriel, String telFixe, String telMobile, String notes, Boolean actif) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.societe = societe;
        this.courriel = courriel;
        this.telFixe = telFixe;
        this.telMobile = telMobile;
        this.notes = notes;
        this.actif = actif;
    }
    
    // Getters
    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSociete() {
        return societe;
    }

    public String getCourriel() {
        return courriel;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public String getTelMobile() {
        return telMobile;
    }

    public String getNotes() {
        return notes;
    }

    public Boolean getActif() {
        return actif;
    }
    
        
    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public void setTelMobile(String telMobile) {
        this.telMobile = telMobile;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }
}