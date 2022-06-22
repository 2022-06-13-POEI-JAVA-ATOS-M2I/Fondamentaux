/**
 * Exemple sur les variables
 */

package corriges.cours;

import java.util.Scanner;

// Classe principale

public class Variables {
    public static void main(String[] args) {
        // Opérateur d'affectation Simple
        int i = 1;
        
        // Affichage simple d'une variable
        System.out.println(i);
        
        // Affectation multiple
        String a, b, c = b = a = "test";
        int x, y, z = y = x = 5;
        
        System.out.println(a + " " + b + " " + c);
        System.out.println(x + " " + y + " " + z);
        
        // Boxing
        Integer I = i;
        System.out.println(I);
        
        // Unboxing
        int val = I;
        System.out.println(val);

        // Casting
        int k = 5;
        System.out.println(k);
        System.out.println((float)k);

        // Conversion d'une String en classe Integer
        String chaine = "100";
        Integer valInt = Integer.valueOf(chaine);
        System.out.println(valInt);

        // Conversion d'une String en int primitif
        int j = Integer.parseInt(chaine);
        System.out.println(j);

        // Conversion d'un double en String
        double d = 3.14159;
        String pi = Double.toString(d);
        System.out.println(d);
        System.out.println(pi);

        // Opérateur arithmétique simple
        i = i + 1;
        System.out.println(i);

        // Opérateur unitaire postfixé
        System.out.println(i++);
        // Opérateur unitaire préfixé
        System.out.println(++i);

        // Opérateur binaire
        System.out.println(i == j);
        // Comparaison avec des chaines de caractères 
        System.out.println(chaine.equals(pi));

        // Opérateur de comparaison logique
        i = I;
        System.out.println(i == I || chaine.equals(pi));

        // Opérateur de négation
        System.out.println(!chaine.equals(pi));

        // Opérateur avec assignation
        i += 10;
        System.out.println(i);	
        
        // Saisir au clavier et affecter la saisie à une variable
        var keyb = new Scanner(System.in);
        
        // Récupérer la ligne saisie
        System.out.println("Entrez votre nom : ");
        String nom = keyb.nextLine();

        // Récupérer un caractère
        System.out.println("Entrez votre genre : ");
        char genre = keyb.next().charAt(0);
        
        // Récupérer un entier
        System.out.println("Entrez votre age : ");
        int age = keyb.nextInt();

        // Récupérer un nombre à virgule (ne pas saisir un point)
        System.out.println("Entrez votre taille : ");
        double taille = keyb.nextDouble();
        
        // Récupérer un boolean (saisir true ou false seulement)
        System.out.println("Etes-vous celibataire : ");
        boolean marier = keyb.nextBoolean();

        // Affichage des variables
        System.out.println("Nom : " + nom + "\nAge : " + age +  "\nGenre : " + genre + "\nTaille : " + taille + "\nEtat marial : " + marier + "\n");
        keyb.close();
    }
}