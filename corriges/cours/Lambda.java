/**
 * Exemple sur les expressions lambda
 */

package corriges.cours;

// Interface fonctionnelle
@FunctionalInterface
interface Operation {
   public int calc(int x, int y);
}

// Classe principale
public class Lambda {
    // Méthode statique appelant la methode calc de notre objet fourni en paramètres
    private static int calculer(int x, int y, Operation op) {
        return op.calc(x, y);
    }   

    // Méthode principale
    public static void main(String args[]) {
        // Définition des objets implemant l'interface Operation via une lambda
        // Avec la déclaration de type
        Operation addition = (int x, int y) -> x + y;

        // Sans déclaration de type, ni return, ni accolade
        Operation soustraction = (x, y) -> x - y;

        // Avec 'return' et les accolades
        Operation multiplication = (int x, int y) -> { return x * y; };

        // Sans 'return' et sans les accolades
        Operation division = (int x, int y) -> x / y;

        // Appel de la methode statique et transmission des objet en parametre à cette methode
        System.out.println("8 + 2 = " + calculer(8, 2, addition));
        System.out.println("8 - 2 = " + calculer(8, 2, soustraction));
        System.out.println("8 x 2 = " + calculer(8, 2, multiplication));
        System.out.println("8 / 2 = " + calculer(8, 2, division));
    }
}