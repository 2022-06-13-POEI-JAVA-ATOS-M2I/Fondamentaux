/**
 * Exercice Collections
 * 
 * Creer une liste vide
 * Ajouter des éléments de type String à cette liste
 * Insérer un élément au début de la liste
 * Afficher le nombre d'élément contenu dans la liste
 * Afficher la liste
 * Modifier un élément par une autre valeur
 * Parcourir la liste et afficher ses éléments un par un
 * Supprimer un élément de la liste et réafficher la liste
 */

package corriges.exercices.collection;

import java.util.ArrayList;

// Classe principale
public class ExCollection {
    public static void main(String args[]) {
        // Créer un ArrayList
        ArrayList<String> liste = new ArrayList<>();

        // Ajouter des éléments à l'ArrayList
        liste.add("Pascal");
        liste.add("C++");
        liste.add("PHP");
        liste.add("Python");
        
        // Insertion d'un élément au début de la liste
        liste.add(0, "Java");

        // Afficher la taille de la liste
        System.out.println("La taille de l'ArrayList : " + liste.size());
        
        // Afficher l'ArrayList
        System.out.println("Le contenu de l'ArrayList : " + liste);

        // Modification d'un élément de la liste
        liste.set(3, "Cobol");

        // Parcour de la liste
        for (String elem : liste) {
            System.out.println("Element : " + elem);
        }
        
        // Supprimer des éléments de l'ArrayList
        liste.remove("Pascal");

        // Afficher l'ArrayList
        System.out.println("ArrayList apres la suppression : " + liste);
        
        // parcour avec la methode ForEach() et une lambda
        liste.forEach(elem -> System.out.println("Element : " + elem));
    }
}