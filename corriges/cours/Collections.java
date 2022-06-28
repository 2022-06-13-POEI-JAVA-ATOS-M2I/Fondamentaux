/**
 * Exemple sur les collections
 */

package corriges.cours;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Classe principale
public class Collections {
    public static void main(String[] args) {
	/// LIST
	// Création d'une liste de type List
	List<String> maListe = new ArrayList<>();
	
        // Ajout d'un élément au premier index disponible
	maListe.add("valeur1");
        
        // Insert un élément à l'index voulu
        maListe.add(1, "valeur2");
	maListe.add(0, "valeur3");
	maListe.add("valeur1");
        
        // Création d'une autre liste de Type List chargé avec le contenu de la première
	List<String> monAutreListe = new ArrayList<>();
	monAutreListe.addAll(maListe);
	
        // Parcour avec une boucle for intelligente
        for (String elem : maListe) {
            System.out.println("Elements : " + elem);
        }
        
        // Parcour avec la methode ForEach() et une lambda
        maListe.forEach(elem -> System.out.println("Element : " + elem));
        
        // Accès à un élément de la liste via son index
        System.out.println("Le deuxieme element de ma liste est : " + maListe.get(1));
		
	// Récupère le premier index de la liste ayant pour valeur "valeur 1"
	int indice = maListe.indexOf("valeur1");
	System.out.println("Le premier indice pour valeur1 est : " + indice);
		
	// Récupère le dernier index de la liste ayant pour valeur "valeur 1"
	int dernierIndice = maListe.lastIndexOf("valeur1");
	System.out.println("Le dernier indice pour valeur1 est : " + dernierIndice);
	
	// Recherche de l'existence d'un élément dans une liste
	System.out.println("La valeur 'valeur2' existe ? " + maListe.contains("valeur2"));
	System.out.println("La valeur 'valeur4' existe ? " + maListe.contains("valeur4"));
		
	// Taille de la liste
	System.out.println("Taille de la liste = " + maListe.size());
		
	// Suppression de l'élément à l'index 1
	maListe.remove(1);
	System.out.println("Taille de la liste = " + maListe.size());
	
	// Suppression de l'élément ayant la valeur "valeur 1"
	maListe.remove("valeur1");
	System.out.println("Taille de la liste = " + maListe.size());
	
	// Suppression de tous les éléments de la liste
	maListe.clear();
	System.out.println("Taille de la liste = " + maListe.size());
	
	/// SET
	// Définition d'une collection Set
	Set<String> monSet = new HashSet<>();
	
        // Charge monAutreListe de type List dans monSet de type Set
	monSet.addAll(monAutreListe);
	
	// Affichage du Set, on s'aperçoit qu'il n'y a plus de doublons
	System.out.println("Eléments du set = " + monSet);
	
	// Tableau de String chargé
	String[] valeurs = {"un", "deux", "trois"};
	
	// Conversion du tableau en liste de type List
	List<String> maNouvelleListe = (List<String>) Arrays.asList(valeurs);
	
	// Affichage de la nouvelle liste
	System.out.println(maNouvelleListe);
	
	// Création d'une liste de type List 
	List<Integer> listeInteger = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
	System.out.println("listeInteger : " + listeInteger);
	
	// Conversion en Set d'une liste d'int de Type List, il n'y a plus de doublons
	Set<Integer> setInteger = new HashSet<>(listeInteger);
	System.out.println("setInteger : " + setInteger);
	
	// Ajout de la valeur 5, mais elle existe déjà
	setInteger.add(5);
	System.out.println("setInteger après ajout de la valeur 5 : " + setInteger);
	
	// Création d'une liste de type List 
	List<String> listeString = Arrays.asList("toto", "abc", "xyz", "dede", "abc");
	System.out.println("listeString : " + listeString);
	
	// Conversion en Set d'une liste de String de type List, il n'y a plus de doublons
	Set<String> setString = new HashSet<>(listeString);
	System.out.println("setString : " + setString);
    }
}