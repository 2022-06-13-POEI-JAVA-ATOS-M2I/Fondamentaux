/**
 * Exemple sur les exceptions
 */

package corriges.cours;

// Classe Tableaux
class Tableaux {
    // Création d'un tableau avec 3 éléments
    private final String[] tableau = {"Ain", "Aisne", "Allier"};
    
    // Méthode affichant le tableau
    public void afficheTableau() throws Exception {
        // Parcours de 5 éléments
        for (int i = 0; i < 3; i++) {
            // Test si le numéro de l'éléemnt en cours
            // ne dépasse pas le nombre d'éléments dans le tableau.
            // Sinon on lève une exception.
            if (i > tableau.length - 1) {
                throw new Exception("Indice en dehors des bornes du tableau. indice = " + i);
            }

            // Affichage du tableau si tout est OK.
            System.out.println(tableau[i]);
        }
    }
}

// Classe principale
public class Exceptions {
     public static void main(String[] args) {
        // Creation d'un objet tableaux de Type Tableaux
	Tableaux tableau1 = new Tableaux();
        
        // Affiche le tableau si tout est OK
        try {
            tableau1.afficheTableau();
            System.out.println("Autres instructions");
        }
        catch (Exception e) {
        // Sinon affiche une erreur
            System.out.println("Erreur lors de l'affichage du tableau : " + e.getMessage());
        }
        // Puis affiche un message quelque soit le resultat de l'affichage du tableau.
        finally {
            System.out.println("Je suis dans le finally.");
        }
        
        System.out.println("Fin normale du programme.");
    }
}