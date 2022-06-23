/**
 * Exemple sur les méthodes
 */

package corriges.cours;

// Classe principale
public class Methodes {
    // Méthode sans paramètre et ne retournant pas de valeur.
    public void ecrit() {
        System.out.println("la méthode écrit.");
    }
    
    // Méthode avec un paramètre et ne retournant pas de valeur.
    public void ecritParam1(String monTexte) {
        System.out.println(monTexte);
    }

    // Méthode avec plusieurs paramètres et ne retournant pas de valeur.
    public void ecritParam2(String monTexte, String monAutreTexte) {
        System.out.println(monTexte);
        System.out.println(monAutreTexte);
    }

    // Méthode avec paramètre et retournant une valeur.
    public int carre(int valeur) {
        return valeur * valeur;
    }
    
    // Méthode principale
    public static void main(String[] args) {
        Methodes m = new Methodes();

        m.ecrit();
        m.ecritParam1("mon texte");
        m.ecritParam2("texte 1", "texte 2");
        System.out.println(m.carre(5));
    }
}