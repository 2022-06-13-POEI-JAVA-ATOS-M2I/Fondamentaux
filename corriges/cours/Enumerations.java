/**
 * Exemple sur les enuméartions
 */

package corriges.cours;

// Enumération
// Avec enum on ne crée pas autant de constante qu'il y a de jours.
// On crée un ensemble de constantes affectées à un seul nom.
enum Jours {
    LUNDI,
    MARDI,
    MERCREDI
}

// Classe sans enumérations
class sansEnum {
    // Attributs
    public static final int LUNDI = 1;
    public static final int MARDI = 2;
    public static final int MERCREDI = 3;

    // Méthode
    public void methodeTest(int maDonnee) {
        if (maDonnee == LUNDI) {
            System.out.println(LUNDI);
        }
        if (maDonnee == MARDI) {
            System.out.println(MARDI);
        }
        if (maDonnee == MERCREDI) {
            System.out.println(MERCREDI);
        }
    }
 }

// Classe principale
public class Enumerations {
    public void methodeTest(Jours quelJour) {
        switch(quelJour) {
            case LUNDI: 	System.out.println(Jours.LUNDI); break;
            case MARDI: 	System.out.println(Jours.MARDI); break;
            case MERCREDI: 	System.out.println(Jours.MERCREDI); break;
            default: 		System.out.println("Autre jour.");
        }
    }

    // Méthode principale
    public static void main(String[] args) {
        sansEnum se = new sansEnum();
        Enumerations e = new Enumerations();

        se.methodeTest(1);
        e.methodeTest(Jours.MARDI);
    }
}