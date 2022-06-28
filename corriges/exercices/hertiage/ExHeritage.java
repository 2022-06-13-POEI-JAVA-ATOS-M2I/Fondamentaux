/**
 * Exercice Heritage
 * 
 * Définissez une classe Cercle. Les objets construits à partir de cette classe
 * seront des cercles de tailles variées. En plus de la méthode constructeur
 * (qui utilisera donc un paramètre rayon), vous définirez les méthodes surface et périmètre
 * qui devront renvoyer la surface et le périmètre du cercle.
 * Définissez ensuite une classe Cylindre dérivée de la précédente.
 * Le constructeur de cette nouvelle classe comportera les deux paramètres rayon et hauteur.
 * Vous y ajouterez une méthode volume qui devra renvoyer le volume du cylindre
 * (rappel : volume d’un cylindre = surface de section × hauteur).
 */
package corriges.exercices.hertiage;

// Classe Cercle
class Cercle {
    // Propriété
    private int rayon;
    
    // Constructeur
    public Cercle(int rayon) {
        this.rayon = rayon;
    }
    
    // Getters
    public int getRayon() {
        return this.rayon;
    }
    
    // Setters
    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
    
    // Methodes
    public double perimetre() {
        return Math.PI * 2 * this.rayon;
    }
    
    public double surface() {
        return Math.PI * this.rayon * this.rayon;
    }
}

// Classe Cylindre
class Cylindre extends Cercle {
    // Propriété
    private float hauteur;
    
    // Constructeur
    public Cylindre(int rayon, float hauteur) {
        super(rayon);
        this.hauteur = hauteur;
    }
    
    // Getters
    public float getHauteur() {
        return this.hauteur;
    }
    
    // Setters
    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }
    
    // Methode
    public double volume() {
        return super.surface() * this.hauteur;
    }
}

// Classe principale
public class ExHeritage {
    public static void main(String[] args) {
        Cercle ce = new Cercle(15);
        Cylindre cy = new Cylindre(10, 11);
        
        System.out.println("Cercle de rayon " + ce.getRayon() + " a pour perimetre " + ce.perimetre());
        System.out.println("Cercle de rayon " + ce.getRayon() + " a pour surface " + ce.surface());
        System.out.println("Cylindre de rayon " + cy.getRayon() + " et de hauteur " + cy.getHauteur() + " a pour volume " + cy.volume());
        
        // avec arrondi
        System.out.println();
        System.out.println("Avec arrondie : ");
        System.out.println("Cercle de rayon " + ce.getRayon() + " a pour perimetre " + Math.round(ce.perimetre() *100) / 100.0);
        System.out.println("Cercle de rayon " + ce.getRayon() + " a pour surface " + Math.round(ce.surface() * 100) / 100.0);
        System.out.println("Cylindre de rayon " + cy.getRayon() + " et de hauteur " + cy.getHauteur() + " a pour volume " + Math.round(cy.volume() * 100) / 100.0);
    }
}