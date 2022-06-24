/**
 * Exercice JavaBean 1
 * 
 * Créer un JavaBean Utilisateur ayant les propriétés suivantes :
 * id, nom, mdp, courriel, acces
 */

package corriges.exercices.javaBeans.ex1;

import java.io.Serializable;

// JavaBean Utilisateur
public class Utilisateur implements Serializable {
    // Propriétés
    private Integer id;
    private String nom;
    private String mdp;
    private String courriel;
    private String acces;

    // Constructeurs
    public Utilisateur() {}

    public Utilisateur(Integer id, String nom, String mdp, String courriel, String acces) {
        this.id = id;
        this.nom = nom;
        this.mdp = mdp;
        this.courriel = courriel;
        this.acces = acces;
    }
    
    // Getters
    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMdp() {
        return mdp;
    }

    public String getCourriel() {
        return courriel;
    }

    public String getAcces() {
        return acces;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public void setAcces(String acces) {
        this.acces = acces;
    }
}
