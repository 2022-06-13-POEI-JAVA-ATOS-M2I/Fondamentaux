/**
 * Exemple sur l'abstraction et le polymorphisme
 */

package corriges.cours;

// Classe abstraite Vehicule
// car on déclare une méthode abstraite dans la classe
abstract class Vehicule {
    // Attribut
    protected Boolean type;

    // Méthode abstraite
    abstract public void rouler();
	
    // Constructeur
    public Vehicule(Boolean type) {
    	this.type = type;
    }

    // Méthode concrète qui ne sera pas executer
    // sur la classe Vehicule mais sur une classe
    // concrète (Voiture ou Camion) 
    public void demarrer() {
    	this.rouler();
    }
}

// Classe Voiture qui hérite de la classe Vehicule
class Voiture extends Vehicule {
    // constructeur
    public Voiture(Boolean type) {
    	super(type);
    }
	
    // Définition de la méthode rouler pour la clasee Voiture
    @Override
    public void rouler() {
    	System.out.println("La voiture roule");
    }
}

// Classe Camion qui hérite de la classe Vehicule
class Camion extends Vehicule {
    // Constructeur
    public Camion(Boolean type) {
    	super(type);
    }
	
    // Définition de la méthode rouler pour la clasee Voiture
    @Override
    public void rouler() {
    	System.out.println("Le camion roule");
    }
}

// Classe principale
public class AbstractionPolymorphisme {
    public static void main(String[] args) {
    	Vehicule v1 = new Voiture(true);
	Vehicule v2 = new Camion(false);
	
	// Appel de la méthode rouler() possible 
	// car rouler() à été déclarée dans Vehicule.
	// A l’exécution, c’est la méthode définie 
	// sur l’objet réel qui est appelée ! -> Polymorphisme.
	v1.rouler();
	v2.rouler();
	
	// Appel de la méthode définie dans la classe abstraite Vehicule
	// mais executée sur la classe voiture (polymorphisme).
	v1.demarrer();
    }
}