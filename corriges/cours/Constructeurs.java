/**
 * Exercice sur les constructeurs
 */

package corriges.cours;

// Classe Maison
class Maison {
    // Propriétés
    private String materiau;
    private Integer surface;
    private BlocPorte blocPorte;

    // Constructeurs
    public Maison(String materiau, Integer surface) {
	this.setMateriau(materiau);
	this.setSurface(surface);
    }

    public Maison(Integer surface) {
	this("brique", surface);
    }

    public Maison(String materiau) {
    	this(materiau, 100);
    }
	
    public Maison() {
	this("brique", 100);
    }

    // Constructeur appelant le constructeur de la classe BlocPorte.
    public Maison(String materiau, Integer surface, Integer hauteur, Integer largeur) {
	this(materiau, surface);
	this.setBlocPorte(new BlocPorte(hauteur, largeur));
    }

    // Getters
    public BlocPorte getBlocPorte() {
	return blocPorte;
    }

    public Integer getSurface() {
        return surface;
    }

    public String getMateriau() {
        return materiau;
    }

    // Setters
    public void setBlocPorte(BlocPorte blocPorte) {
    	this.blocPorte = blocPorte;
    }

    public void setSurface(Integer surface) {
        this.surface = surface;
    }

    public void setMateriau(String materiau) {
        this.materiau = materiau;
    }
}

// Classe BlocPorte
class BlocPorte {
    // Propriétés
    private Integer hauteur;
    private Integer largeur;

    // Constructeur
    public BlocPorte(Integer hauteur, Integer largeur) {
        this.setHauteur(hauteur);
        this.setLargeur(largeur);
    }

    // Getters
    public Integer getLargeur() {
        return largeur;
    }

    public Integer getHauteur() {
        return hauteur;
    }

    // Setters
    public void setLargeur(Integer largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(Integer hauteur) {
        this.hauteur = hauteur;
    }
}

// Classe principale
public class Constructeurs {
    public static void main(String[] args) {
        Maison petite = new Maison("Brique", 60);
        System.out.println(petite.getSurface());
        System.out.println(petite.getMateriau());
        System.out.println();


        Maison moyenne = new Maison("Pierre");
        System.out.println(moyenne.getSurface());
        System.out.println(moyenne.getMateriau());
        System.out.println();

        Maison grande = new Maison("Bois", 300, 200, 80);
        System.out.println(grande.getSurface());
        System.out.println(grande.getMateriau());
    }
}