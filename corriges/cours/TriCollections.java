/**
 * Exemple sur le tri des collections
 */

package corriges.cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Classe de tri de Planètes implémentant l'interface Comparator
class ComparateurPlanetes implements Comparator<Planete> {
    @Override
    public int compare(Planete planete1, Planete planete2) {
        return planete1.taille.compareTo(planete2.taille);
    }
}

// Classe Planète
class Planete {
    // Attributs
    public String nom;
    public Integer taille;
    public Integer distance;

    // Constructeur
    public Planete(String nom, Integer taille, Integer distance) {
        this.nom = nom;
        this.taille = taille;
        this.distance = distance;
    }
}

// Classe de tri simple
class TriSimple {
    // Méthode de tri classique
    public void TriListeClassique() {
        // Création d'une liste de type List non triée
        List<String> maListeNonTriee = new ArrayList<>();
        maListeNonTriee.add("vaucluse");
        maListeNonTriee.add("allier");
        maListeNonTriee.add("loire");

        // Tri d'une Collection List
        Collections.sort(maListeNonTriee);

        // Affichage des éléments de la liste
        System.out.println(maListeNonTriee.get(0));
        System.out.println(maListeNonTriee.get(1));
        System.out.println(maListeNonTriee.get(2));
    }
}

// Classe principale
public class TriCollections {
    public static void main(String[] args) {
        // Appel d'un tri simple
        TriSimple ts = new TriSimple();
        ts.TriListeClassique();

        // Saut de ligne
        System.out.println();

        // Création et chargement d'une liste de type List
        List<Planete> listeDesPlanetes = new ArrayList<>();
        listeDesPlanetes.add(new Planete("Mercure", 6000, 50));
        listeDesPlanetes.add(new Planete("Mars", 5000, 200));
        listeDesPlanetes.add(new Planete("Jupiter", 11000, 1100));

        // Implémentation de Comparator : on instancie l'interface en fournissant immédiatement l'implémentation de la méthode compare
        Comparator<Planete> comparateurDeTaille = new Comparator<>() {
            @Override
            public int compare(Planete planete1, Planete planete2) {
                // Comparaison par rapport à la propriété taille de la classe Planete
                return planete1.taille.compareTo(planete2.taille);
            }
        };

        // Méthode 1
        System.out.println("méthode 1");

        // Tri de la collection de type Planete via la méthode sort() de la classe Collections
        // en utilisant l'implémentation directe de Comparator ci-dessus
        Collections.sort(listeDesPlanetes, comparateurDeTaille);

        // Affichage des infos des planètes
        for (Planete element : listeDesPlanetes) {
            System.out.println("Nom : " + element.nom + " - Taille : " + element.taille + " - Distance : " + element.distance);
        }

        // Saut de ligne
        System.out.println();

        // Méthode 2
        System.out.println("méthode 2");

        // Tri de la collection de type Planete via la méthode sort() de la classe Collections
        // en utilisant l'implémentation faite dans la classe ComparateurPlanetes
        Collections.sort(listeDesPlanetes, new ComparateurPlanetes());

        // Affichage des infos des planètes
        for (Planete element : listeDesPlanetes) {
            System.out.println("Nom : " + element.nom + " - Taille : " + element.taille + " - Distance : " + element.distance);
        }
    }
}