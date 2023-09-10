
//Boucles

package javaapplication13;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;

public class JavaApplication13 {
    public static void main(String[] args) {

    String prenom;
    char reponse = 'o';
    Scanner sc = new Scanner (System.in);
    
    while (reponse == 'o'){
        System.out.print("Donnez un prénom : ");
        prenom = sc.nextLine();
        System.out.print("Bonjour " +prenom+ ", comment allez-vous ?");
        //Sans ça, nous n'entrerions pas dans la deuxième boucle
        reponse = ' ';
        //Tant que la reponse n'est pas O ou N, on repose la question
        while (reponse != 'o' && reponse !='n')
        {
            //On demande si la personne veut faire un autre essaie
            System.out.print("Voulez vous reessayer ? (o/n) ");
            reponse = sc.nextLine().charAt(0);
        }
      }
    System.out.print("Au revoirrrr   !!!!!!! ");
   }
}

