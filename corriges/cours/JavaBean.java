/**
 * Exemple sur JavaBean
 */

package corriges.cours;

// Import de Serializable pour créer un JavaBean
import java.io.Serializable;

// Création d'un JavaBean
public class JavaBean implements Serializable {
    // Propriétés
    private static final long serialVersionUID = -1912226135224432621L;
    private Integer numero;
    private String libelle;

    // Constructeur sans paramètres
    public JavaBean() {
        System.out.println("Execution du constructeur du JavaBean");
    }

    // Getters
    public Integer getNumero() {
        return this.numero;
    }

    public String getLibelle() {
        return this.libelle;
    }

    // Setters
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}