/**
 * Exemple sur les classes
 */

package corriges.cours;

// Définition d'une classe avec visibilité limitée au package
class uneClasse{
    // Attribut public
    public int cpt = 10;

    // Emploi de this dans une methode de la classe
    public int addition() {
        return this.cpt + 15;
    }

    // Méthode private
    private int carre(int i) {
        return i * i;
    }

    // Méthode publique
    public int cube(int i) {
        return i * carre(i);
    }
}

// Classe principale
public class Classes {
    // Méthode sans valeur de retour
    public void sansRetour() {
        System.out.println("Je fait quelque chose et je ne retourne rien");
    }

    // Methode avec valeur de retour
    public int avecRetour() {
        int i = 5;
        System.out.println("Je fait quelque chose et je retourne la valeur : " + i);
        return i;
    }

    // Méthode avec retour et paramètre
    public int avecParamEtRetour(int i) {
        return i * 5;
    }

    // Méthode principale
    public static void main(String[] args) {
        int j;

        // Création d'un nouvel objet de type Classes nommé mc
        Classes mc = new Classes();

        // Appel de la méthode sansRetour
        mc.sansRetour();

        // Appel de la méthode avecRetour
        j = mc.avecRetour();
        System.out.println(j);

        // Appel d'une methode avec retour et paramètre 
        System.out.println(mc.avecParamEtRetour(j));

        // Création d'un objet de la classe uneClasse nommé uc
        uneClasse uc = new uneClasse();

        // Appel de l'attribut public d'une classe
        System.out.println(uc.cpt);
        uc.cpt = 20;
        System.out.println(uc.cpt);

        // Appel de la methode cube de la classe uneClasse
        System.out.println(uc.cube(uc.cpt));

        // Appel de la methode carre de la classe uneClasse impossible, car elle est privée
        // System.out.println(uc.carre(uc.cpt));

        // Appel de la methode addition de la classe uneClasse
        System.out.println(uc.addition());
    }
}