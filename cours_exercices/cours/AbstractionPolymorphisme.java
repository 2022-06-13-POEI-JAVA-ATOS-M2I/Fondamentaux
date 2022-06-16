/**
 * Exemple sur l'abstraction et le polymorphisme
 */

package cours_exercices.cours;

// Classe abstraite Vehicule
// car on déclare une méthode abstraite dans la classe
    // Attribut

    // Méthode abstraite
	
    // Constructeur

    // Méthode concrète qui ne sera pas executer
    // sur la classe Vehicule mais sur une classe
    // concrète (Voiture ou Camion) 

// Classe Voiture qui hérite de la classe Vehicule
    // constructeur
	
    // Définition de la méthode rouler pour la clasee Voiture

// Classe Camion qui hérite de la classe Vehicule
    // Constructeur
	
    // Définition de la méthode rouler pour la clasee Voiture

// Classe principale
public class AbstractionPolymorphisme {
    public static void main(String[] args) {	
	// Appel de la méthode rouler() possible 
	// car rouler() à été déclarée dans Vehicule.
	// A l’exécution, c’est la méthode définie 
	// sur l’objet réel qui est appelée ! -> Polymorphisme.
	
	// Appel de la méthode définie dans la classe abstraite Vehicule
	// mais executée sur la classe voiture (polymorphisme).
    }
}