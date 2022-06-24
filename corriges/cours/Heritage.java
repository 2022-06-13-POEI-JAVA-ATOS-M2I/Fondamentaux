/**
 * Exemple sur l'héritage
 */

package corriges.cours;

// Classe Compte simple
class Compte {
    // Propriétés
    private Double solde;
    private String proprietaire;

    // Constructeur
    public Compte(Double solde, String proprietaire) {
        this.setSolde(solde);
        this.setProprietaire(proprietaire);
    }

    // Getters
    public String getProprietaire() {
        return proprietaire;
    }

    public Double getSolde() {
        return solde;
    }
    
    public String getElements() {
        return "Propriétaire : " + this.proprietaire + " - solde : " + this.solde;
    }

    // Setters
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }
}

// Classe CompteBancaire héritant de Compte
class CompteBancaire extends Compte {
    // Propriété
    private String nomBanque;

    // Constructeur
    public CompteBancaire(Double solde, String proprietaire, String nomBanque) {
        // appel le constructeur de la classe mère
        super(solde, proprietaire);
        this.setNomBanque(nomBanque);
    }

    // Getters
    public String getNomBanque() {
        return nomBanque;
    }

    @Override
    public String getElements() {
        return super.getElements() + " - Nom de la banque : " + this.nomBanque;
    }
    
    // Setters
    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
}

// Classe principale
public class Heritage {
    public static void main(String[] args) {
        CompteBancaire cb = new CompteBancaire(100.0, "Xavier", "Ma Banque");
        System.out.println(cb.getElements());
    }
}