/**
 * Exemple sur les interfaces multiples
 */

package corriges.cours;

// Interface Radio
interface IRadio {
    void setVolume(Integer volume);

    // Méthode default nommée start
    default void start() {
        System.out.println("Sonne comme une radio");
    }
}

// Interface reveil
interface IReveil {
    void setHeure(String heure);

    // Méthode default nommée start
    default void start() {
        System.out.println("Sonne comme une reveil");
    }
}

// Classe RadioReveil implémentant les interfaces
class RadioReveil implements IRadio, IReveil {
    // Propriétés
    // radio = true, reveil = false
    private Boolean typeReveil;
    private String heure;
    private Integer volume;

    // Constructeur
    public RadioReveil(Boolean typeReveil) {
        this.typeReveil = typeReveil;
        this.heure = "00h00m00s";
        this.volume = 0;
    }

    // Methode avec choix de la méthode default à utilisé
    @Override
    public void start() {
        if (typeReveil) {
            IRadio.super.start();
        }
        else {
            IReveil.super.start();
        }
    }

    // Getters
    public String getTypeReveil() {
        return (typeReveil) ? "Radio" : "Reveil";
    }

    public String getHeure() {
        return this.heure;
    }

    public Integer getVolume() {
        return this.volume;
    }

    // Setters
    @Override
    public void setHeure(String heure) {
        this.heure = heure;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}

// Classe principale
public class InterfacesMultiples {
    public static void main(String[] args) {
        Boolean radioReveil = false;
        // radio = true, reveil = false

        RadioReveil rr = new RadioReveil(radioReveil);
        System.out.println("Type : " + rr.getTypeReveil());
        System.out.println("Heure : " + rr.getHeure());
        System.out.println("Volume : " + rr.getVolume());
        
        rr.start();
        
        System.out.println();

        rr.setHeure("12h10m:20s");
        rr.setVolume(100);

        System.out.println("Type : " + rr.getTypeReveil());
        System.out.println("Heure : " + rr.getHeure());
        System.out.println("Volume : " + rr.getVolume());
        
        rr.start();
    }
}