/**
 * Exemple sur les enuméartions
 */

package cours_exercices.cours;

// Enumération
// Avec enum on ne crée pas autant de constante qu'il y a de jours.
// On crée un ensemble de constantes affectées à un seul nom.
enum Jours { LUNDI, MARDI, MERCREDI }

// Classe sans enumérations
class SansEnum {
    // Attributs
    private static final int LUNDI = 1;
    private static final int MARDI = 2;
    private static final int MERCREDI = 3;

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
    // Méthode
    public void methodeTest(Jours quelJour) {
        switch (quelJour) {
            case LUNDI: System.out.println(Jours.LUNDI); break; // retourne la valeur
            case MARDI: System.out.println(Jours.MARDI); break;
            case MERCREDI: System.out.println(Jours.MERCREDI.ordinal()); break; // retourne l'index de la valeur
            default: System.out.println("Autre jour"); break;
        }
    }

    // Méthode principale
    public static void main(String[] args) {
        SansEnum se = new SansEnum();
        Enumerations e = new Enumerations();
        
        se.methodeTest(1);
        e.methodeTest(Jours.MARDI);
        e.methodeTest(Jours.MERCREDI);
    }
}