/**
 * Exercice Interface
 * 
 * Ecrire une interface nommée FigureGeometrique
 * cette interface doit avoir la déclaration de 2 méthodes :
 * getAire() et getPerimetre()
 * 
 * Ecrire les classes Carre, Cercle, Rectangle et TriangleRectangle implémentant l'interface
 * 
 * Ecrire une classe principale appelant
 */
package corriges.exercices.interfaces;

// Interface FigureGeométrique
interface FigureGeometrique {
    public float getAire();
    public float getPerimetre();
}

// Classe Carre
class Carre implements FigureGeometrique {
    // Propriété
    private int cote;
    
    // Constructeur
    public Carre(int cote) {
        this.cote = cote;
    }

    // Getter
    public int getCote() {
        return cote;
    }
    
    // Setter
    public void setCote(int cote) {
        this.cote = cote;
    }

    // Implementation des méthodes de l'interface
    @Override
    public float getAire() {
        return (float) Math.pow(this.getCote(), 2);
    }

    @Override
    public float getPerimetre() {
        return 4 * this.getCote();
    }
}

// Classe Cercle
class Cercle implements FigureGeometrique {
    // Propriété
    private int rayon;
    
    // Constructeur
    Cercle(int rayon) {
        this.rayon = rayon;
    }
    
    // Getter
    public int getRayon() {
        return rayon;
    }

    // Setter
    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    // Implementation des méthodes de l'interface
    @Override
    public float getAire() {
        return (float) (Math.PI * (Math.pow(this.getRayon(), 2)));
    }

    @Override
    public float getPerimetre() {
        return (float) (2 * Math.PI * this.getRayon());
    }
}

// Classe Rectangle
class Rectangle implements FigureGeometrique {
    // Propriétés
    private int longueur;
    private int largeur;

    // Constructeur
    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Getters
    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    // Setters
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    // Implementation des méthodes de l'interface
    @Override
    public float getAire() {
        return this.getLongueur() * this.getLargeur();
    }

    @Override
    public float getPerimetre() {
        return 2 * (this.getLongueur() + this.getLargeur());
    }
}

// Classe TriangleRectangle
class TriangleRectangle implements FigureGeometrique {
    // Propriétés
    private int a;
    private int b;

    // Constructeur
    public TriangleRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // Getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    // Setters
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Implementation des méthodes de l'interface
    @Override
    public float getAire() {
        return this.getA() * this.getB() / 2;
    }

    @Override
    public float getPerimetre() {
        return (float) (this.getA() + this.getB() + this.getHypotenuse());
    }

    // Methode de la classe
    public double getHypotenuse(){
        double temp = Math.pow(getA(), 2) + Math.pow(getB(), 2);
        return Math.sqrt(temp);
    }
}

// Classe principale
public class ExInterfaces {
    public static void main(String... args) {
        Cercle cercle = new Cercle(3);
        System.out.println("L'aire du cercle de rayon " + cercle.getRayon() + " est de " + cercle.getAire());
        System.out.println("Le perimetre du cercle de rayon " + cercle.getRayon() + " est de " + cercle.getPerimetre());

        Carre carre = new Carre(8);
        System.out.println("L'aire du carré de cote " + carre.getCote() + " est de " + carre.getAire());
        System.out.println("Le perimetre du carre de cote " + carre.getCote() + " est de " + carre.getPerimetre());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("L'aire du rectangle de longueur " + rectangle.getLongueur() + " et de largeur " + rectangle.getLargeur() + " est de " + rectangle.getAire());
        System.out.println("Le perimetre du rectangle de longueur " + rectangle.getLongueur() + " et de largeur " + rectangle.getLargeur() + " est de " + rectangle.getPerimetre());

        TriangleRectangle triangleRectangle = new TriangleRectangle(3, 4);
        System.out.println("L'aire du triangle rectangle est de " + triangleRectangle.getAire());
        System.out.println("Le perimetre du triangle rectangle est de " + triangleRectangle.getPerimetre());
    }
}