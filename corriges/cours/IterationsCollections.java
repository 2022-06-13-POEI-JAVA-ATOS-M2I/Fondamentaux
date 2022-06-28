/**
 * Exemple sur l'itération de collection
 */

package corriges.cours;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Classe principale
public class IterationsCollections {
    public static void main(String[] args) {
        // LIST
        // Création d'une liste de type List
        List<String> maListe = new ArrayList<>();

        maListe.add("valeur1");
        maListe.add(1, "valeur2");
        maListe.add(0, "valeur3");
        maListe.add("valeur1");

        // Utilisation de l'interface Iterator
        System.out.println("Parcours de la liste avec iterateur");

        // Récupération d'un "Iterator" sur la liste voulue
        Iterator<String> monIterateur = maListe.iterator();

        // Parcours de la liste. La méthode hasNext() vérifie s'il y a encore un élément dans la liste
        while (monIterateur.hasNext()) {
            // La méthode next() passe à l'élément suivant de la liste
            String element = monIterateur.next();
            System.out.println(element);
        }

        // Parcours de la liste avec une boucle for classique 
        System.out.println("Parcours de la liste avec boucle for classique");
        for (int monIndice = 0; monIndice < maListe.size(); monIndice++) {
            String monElement = maListe.get(monIndice);
            System.out.println(monElement);
        }

        // Parcours de la liste avec une boucle for "intelligente"
        System.out.println("Parcours de la liste avec boucle for intelligente");
        for (String elem : maListe) {
            System.out.println(elem);
        }

        // Parcours de la liste avec une méthode forEach() 
        // La fonction donnée dans forEach est une fonction lambda
        System.out.println("Parcours de la liste avec methode forEach");
        maListe.forEach(e -> System.out.println(e));

        
        /// MAP
        // Création d'une Map
        Map<Integer, String> maMap = new HashMap<>();

        // La méthode put permet de charger un ensemble clé / valeur
        maMap.put(1, "Mercure");
        maMap.put(2, "Vénus");
        maMap.put(3, "Terre");

        // Parcours d'une Map avec la boucle "intelligente"
        System.out.println("Parcours avec for(:) :");        
        
        for(Map.Entry<Integer, String> entry : maMap.entrySet()) {
            System.out.println("Cle = " + entry.getKey() + " ; Valeur = " + entry.getValue());
        }

        // Parcours avec la méthode forEach
        System.out.println("Parcours avec forEach :");
        maMap.forEach((cle, valeur) -> System.out.println("Clé = " + cle + " ; Valeur = " + valeur));
    }
=======
/**
 * Exemple sur l'itération de collection
 */

package cours_exercices.cours;

// Classe principale

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IterationsCollections {
    public static void main(String[] args) {
        // LIST
        // Création d'une liste de type List
        List<String> maListe = new ArrayList<>();
        
        maListe.add("valeur1");
        maListe.add(1, "valeur2");
        maListe.add(0, "valeur3");
        maListe.add("valeur1");
        
        // Utilisation de l'interface Iterator
        System.out.println("Parcours de la liste avec Iterateur");
        
        // Récupération d'un "Iterator" sur la liste voulue
        Iterator<String> monIterateur = maListe.iterator();
        
        // Parcours de la liste. La méthode hasNext() vérifie s'il y a encore un élément dans la liste
        while (monIterateur.hasNext()) {
            // La méthode next() passe à l'élément suivant de la liste
            String element = monIterateur.next();
            System.out.println(element);
        }
        

        // Parcours de la liste avec une boucle for classique 
        System.out.println("Parcours de la liste avec boucle for classique");
        
        for (int monIndice = 0; monIndice < maListe.size(); monIndice++) {
            String monElement = maListe.get(monIndice);
            System.out.println(monElement);
        }
        
        // Parcours de la liste avec une boucle for "intelligente"
        System.out.println("Parcours de la liste avec boucle for intelligente");
        
        for (String elem : maListe) {
            System.out.println(elem);
        }
        
        // Parcours de la liste avec une méthode forEach() 
        // La fonction donnée dans forEach est une fonction lambda
        System.out.println("Parcours de la liste avec methode forEach");
        maListe.forEach(e -> System.out.println(e));        

        /// MAP
        // Création d'une Map
        Map<Integer, String> maMap = new HashMap<>();
        
        // La méthode put permet de charger un ensemble clé / valeur
        maMap.put(1, "Mercure");
        maMap.put(2, "Venus");
        maMap.put(3, "Terre");
        
        // Parcours d'une Map avec la boucle "intelligente"
        System.out.println("Parcours avec for(:) :");        
        
        for(Map.Entry<Integer, String> entry : maMap.entrySet()) {
            System.out.println("Cle = " + entry.getKey() + " ; Valeur = " + entry.getValue());
        }
    
        // Parcours avec la méthode forEach
        System.out.println("Parcours avec forEach :");
        maMap.forEach((cle, valeur) -> System.out.println("Cle = " + cle + " ; Valeur = " + valeur));
    }
>>>>>>> 4ca0bcd81011d336d5051fd0d00c7f8270f6d7ef
}
