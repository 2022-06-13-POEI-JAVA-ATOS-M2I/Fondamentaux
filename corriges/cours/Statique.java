/**
 * Exemple d'attributs et methodes static
 */
package corriges.cours;

class TestStatic {
    public int cpt = 0;
    public static int compteur = 5;
    
    public void afficheCompteurs() {
        System.out.println("cpt : " + this.cpt);
        System.out.println("compteur : " + compteur);
    }
    
    // methode static appelable sans creer un objet.
    public static int cube(int x) {  
        return x * x * x;  
    }
}

public class Statique {
    public static void main(String[] args) {
        TestStatic ts1 = new TestStatic();
        TestStatic ts2 = new TestStatic();
        
        ts1.afficheCompteurs();
        ts2.afficheCompteurs();
        
        ts1.cpt = 10;
        ts2.cpt = 20;
        ts1.afficheCompteurs();
        ts2.afficheCompteurs();
        
        TestStatic.compteur = 50;
        ts1.afficheCompteurs();
        ts2.afficheCompteurs();
        
        TestStatic ts3 = new TestStatic();
        ts3.afficheCompteurs();

        // acces à la methode static sans avoir à créer d'objet.
        // comme pour l'appel d'une methode Math
        System.out.println(TestStatic.cube(15));
    }
}
