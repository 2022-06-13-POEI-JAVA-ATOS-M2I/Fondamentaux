/**
 * Exemple de getteurs / setteurs
 */

package corriges.cours;

class Velo{
    private int nbRoues = 2;
    
    public int getNbRoues() {
        return this.nbRoues;
    }
    
    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }
}


public class Getters_Setters {
    public static void main(String[] args) {
        Velo v = new Velo();
        
        System.out.println(v.getNbRoues());
        v.setNbRoues(3);
        System.out.println(v.getNbRoues());
    }
}
