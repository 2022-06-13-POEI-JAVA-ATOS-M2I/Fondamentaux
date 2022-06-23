/**
* Exercice Tableaux
* 
* 1. Ecrire dans un tableau les valeurs suivantes : 1, 1, 2, 3, 5, 8, 13, 21
* 2. Créer un autre tableau ayant un élément de plus que le premier initialiser à 0.
* 3. Afficher les éléments du premier tableau
* 4. Afficher les éléments du 2eme tableau
* 5. Copier les valeurs du premier tableau dans le second et insérer une valeur aribitraire à la 3eme position 
* 6. Afficher le tableau après l'opération d'insertion
*/
 
package corriges.exercices.tableaux;

// Classe principale
public class ExTableaux {
    public static void main(String[] args) {
        int[] tab = {1, 1, 2, 3, 5, 8, 13, 21};
        int[] tab2 = new int[tab.length + 1];
        int pos = 2;

        // Afficher les éléments du tableau original
        System.out.println("Elément du tableau original :");
        
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Elément " + (i + 1) + " : " + tab[i]);
        }
 
        // Afficher les éléments du nouveau tableau
        System.out.println();
        System.out.println("Elément du nouveau tableau :");
        
        for (int i = 0; i < tab2.length; i++) {
            System.out.println("Elément " + (i + 1) + " : " + tab2[i]);
        }

        // Copie des éléments du premier tableau
        // et insertion d'un élément à la 3eme position
        for (int i = 0; i < tab.length; i++) {
            if (i < pos) {
                tab2[i] = tab[i];
            }

            if (i >= pos) {
                tab2[i + 1] = tab[i];
            }
        }
        tab2[pos] = 15; 
        
        // Afficher le tableau après l'opération d'insertion
        System.out.println();
        System.out.println("Nouveau tableau :");
        
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i]);

            if (i < tab2.length - 1) {
                System.out.print(", ");
            }
        }
        
        // Messaged de fin
        System.out.println("\nFin");
    }
}