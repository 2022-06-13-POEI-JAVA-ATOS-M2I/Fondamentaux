/*
 * Exercice conditions
 * 
 * 1. Chercher le plus grand des 3 nombres saisie par l'utilisateur
 * 2. Afficher sur les nombres saisie sont pairs ou impairs
 * 3. Demander à l'utilisateur de saisir le numéro d'un mois de l'année
 * et afficher le nombre de jours correspondant au mois choisi (28/29) pour février
 * indiquer un message d'erreur si le numéro de mois n'est pas compris entre 1 et 12.
 */
package corriges.exercices.conditions;
import java.util.Scanner;
        
public class ExConditions {
    public static void main(String[] args) {
        // Déclarations / définitions des variables
        Scanner clavier = new Scanner(System.in);
 
        int num1, num2, num3, max;
        int mois;
         
        // Fournir les données d'entrée
        System.out.print("Saisir le numéro 1 ");
        num1 = clavier.nextInt();
 
        System.out.print("Saisir le numéro 2 ");
        num2 = clavier.nextInt();
 
        System.out.print("Saisir le numéro 3 ");
        num3 = clavier.nextInt();
 
        // Chercher le maximum
        if(num1 > num2) {
            if(num1 > num3) {
                // si num1 > num2 et num1 > num3
                max = num1;
            }
            else {
                // si num1 > num2 mais num1 < num3
                max = num3;
            }
        }
        else {
            if(num2 > num3) {
                // Si num1 < num2 et num2 > num3
                max = num2;
            } else {
                // si num1 < num2 et num2 > num3
                max = num3;
            }
        }
 
        // Afficher le résultat
        System.out.println("le maximum est = " + max);
 
        // Afficher si num1 est pair ou impair
        System.out.println((num1 % 2 == 0) ? "le nombre 1 est pair" : "le nombre 1 est impair");
        System.out.println((num2 % 2 == 0) ? "le nombre 2 est pair" : "le nombre 1 est impair");
        System.out.println((num3 % 2 == 0) ? "le nombre 3 est pair" : "le nombre 1 est impair");

        // Fournir les données d'entrée
        System.out.print("Saisir le numero de mois (1-12) : ");
        mois = clavier.nextInt();
 
        // Afficher le résultat
        switch(mois) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 jours");
                break;
            case 2:
                System.out.println("28/29 jours");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 jours");
                break;
            default:
                System.out.println("Entree invalide! Veuillez saisir le numero du mois entre (1-12).");
        }
        
        // Fermer les ressources
        clavier.close();
    }
}