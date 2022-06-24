/**
 * Exercices methodes
 * 
 * 1. Définir une methode maximum(n1, n2, n3) qui renvoi le plus grand 
 * des 3 nombres n1, n2, n3 fourni en arguments
 * exemple : maximum(2, 15, 5) doit afficher : 15
 * 
 * 2. Ecrire une fonction cube qui retourne le cube de son argument.
 * Ecrire une fonction volumeSphere qui calcule le volume d’une sphère de rayon r
 * fourni en argument et qui utilise la fonction cube. 
 */

package corriges.exercices.methodes;

// Classe principale
public class ExMethodes {
    // Méthode maximum
    public int maximum(int n1, int n2, int n3) {
        int n = n1;
        
        if (n2 > n) {
            n = n2;
        }
        
        if (n3 > n) {
            n = n3;
        }
        
        return n;
    }

    // Méthode cube    
    public int cube(int x) {
        return x * x * x;
    }
    
    // Méthode volume    
    public double volume(int rayon) {
        return 4/3 * 3.14 * cube(rayon);
    }
    
    // Méthode principale    
    public static void main(String[] args) {
        int nombre = 5;
        ExMethodes m = new ExMethodes();

        System.out.println("le nombre le plus grand est : " + m.maximum(2, 15, 5));
        System.out.println("le cube de " +  nombre + " est : " + m.cube(nombre));
        System.out.println("Le volume est : " + m.volume(nombre));
    }
}