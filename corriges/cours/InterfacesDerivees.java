/**
 * Exemple sur les interfaces dérivées
 */

package cours_exercices.cours;

// Interface avec méthode défaut
interface IAffichage {
    default void affiche() {
        System.out.println("Je suis un IAffichage.");
    }
}

// Interface dérivée de l'interface IAffichage,
// utilise la méthode par défaut de IAffichage.
interface IAffichageDerivee1 extends IAffichage {}

// Interface dérivée de l'interface IAffichage,
// la méthode affiche devient abstraite.
interface IAffichageDerivee2 extends IAffichage {
    @Override
    void affiche();
}

// Interface dérivée de l'interface IAffichage,
// redéfinie la méthode affiche de IAffichage.
interface IAffichageDerivee3 extends IAffichage {
    @Override
    default void affiche() {
        System.out.println("Je suis IAffichageDerivee3 : ");
    }
}

// Classe A implémentant IAffichageDerivee1 qui implémente IAffichage.
// Pas besoin d'être définie grâce à la méthode default.
class A implements IAffichageDerivee1 {}

// Classe B implémentant IAffichageDerivee2 qui implémente IAffichage.
// Affiche doit être définie, car elle est devenue abstraite.
class B implements IAffichageDerivee2 {
    @Override
    public void affiche() {
        System.out.println("Je suis un B : ");
    }
}

// Classe C implémentant IAffichageDerivee1 qui implémente IAffichage.
// Pas besoin d'être définie grâce à la méthode default.
class C implements IAffichageDerivee3 {}

// Classe principale
public class InterfacesDerivees {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.affiche();
        b.affiche();
        c.affiche();
    }
}