/*Les tableaux
  Qu'est ce que c'est ? : c'est une suite de structure de données qui permet de stocker un ensemble d'éléments de même type sous un même nom.
*************************************************************************
Programme java pour récapituler ce qu'il faut maîtriser ci-dessous : */

import java.util.Scanner;

public class Tableau {
  public static void main (String[]args){
    //Création d'un objet Scanner pour la saisie utilisateur mais de base, Scanner est une classe
    Scanner sc = new Scanner(System.in);
    
    //Demandons à l'utilisateur de saisir la taille du tableau
    System.out.print("Entrez le nombre de lignes du tableau : ");
    while (!sc.hasNextInt()){ //cette ligne nous demandera à nouveau à l'utilisateur quand il entrera autre chose à part un entier
        System.out.print("Entrez le nombre de lignes du tableau : ");
            sc.next();
          }
    int lignes = sc.nextInt(); //notons aussi que nextInt est reservé pour les entiers
    
    //Demandons à l'utilisateur de saisir le nombre de colonne 
    System.out.print("Entrez le nombre de colonnes du tableau : ");
    while (!sc.hasNextInt()){
        System.out.print("Entrez le nombre de colonnes du tableau : ");
            sc.next();
          }
    int colonnes = sc.nextInt();

    //Creation du tableau en fonction des dimensions
    int [][] tableau = new int [lignes][colonnes];

    //Demandons à l'utilisateur de saisir les éléments du tableau
    
    //System.out.print("Entrez les éléments du tableau à la position [" +i+ "] [" +j+ "] : ");
    for (int i=0; i<lignes; i++){
      for (int j=0; j<colonnes; j++){
          do{
              System.out.print("Entrez les éléments du tableau à la position [" +i+ "] [" +j+ "] : ");
              //Vérifions si l'entrée suivante est entier
              if(sc.hasNextInt()){
                  tableau[i][j] = sc.nextInt();
                  //Sortez de la boucle do-while si un entier valide a  été saisi
                  break;
                }else{
                  //vider la ligne do-while si saisie incorrecte
                  sc.nextLine();
                  System.out.print("Entrez les éléments du tableau à la position [" +i+ "] [" +j+ "] : ");
              }
          }while (true); //ici donne une boucle infini après vérification
        
        //tableau[i][j] = sc.nextInt();
      }
    }

    //Affichage du tableau
    System.out.println("Affichons ce que vous avez entré");
    for (int i=0; i<lignes; i++){
      for (int j=0; j<colonnes; j++){
        System.out.println("Vous avez entré : " + tableau[i][j]);
      }
      System.out.println(); //cette ligne de code fait un passage à la ligne après chaque ligne du tableau
    }

    //Faisons la somme du contenu du tableau et affichons
    int somme = 0;
    for (int i=0; i<lignes; i++){
      for (int j=0; j<colonnes; j++){
        somme += tableau[i][j];
      }
    }
    System.out.println("La somme des éléments du tableau : " +somme);

    //Fermeture du Scanner
    sc.close();
  }
}



/*Exemple de output : 

run:
Entrez le nombre de lignes du tableau : *
Entrez le nombre de lignes du tableau : 3
Entrez le nombre de colonnes du tableau : +
Entrez le nombre de colonnes du tableau : k
Entrez le nombre de colonnes du tableau : 2
Entrez les éléments du tableau à la position [0] [0] : 5
Entrez les éléments du tableau à la position [0] [1] : 4
Entrez les éléments du tableau à la position [1] [0] : 7
Entrez les éléments du tableau à la position [1] [1] : 8
Entrez les éléments du tableau à la position [2] [0] : 1
Entrez les éléments du tableau à la position [2] [1] : 5
Affichons ce que vous avez entré
Vous avez entré : 5
Vous avez entré : 4

Vous avez entré : 7
Vous avez entré : 8

Vous avez entré : 1
Vous avez entré : 5

La somme des éléments du tableau : 30
BUILD SUCCESSFUL (total time: 25 seconds)


*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Ce code ci-dessous empêche l'entrée d'espaces et caractères // aidé par Merveil

package javaapplication13;

import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez le nombre de lignes du tableau : ");
        int lignes = obtenirEntier(sc);

        System.out.print("Entrez le nombre de colonnes du tableau : ");
        int colonnes = obtenirEntier(sc);

        // Créez le tableau en fonction des dimensions
        int[][] tableau = new int[lignes][colonnes];

        // Demandez à l'utilisateur de saisir les éléments du tableau
        System.out.println("Entrez les éléments du tableau (utilisez l'indice [0][0] pour la première case) : ");
        remplirTableau(tableau, sc);

        // Affichez le tableau
        System.out.println("Affichons ce que vous avez entré :");
        afficherTableau(tableau);

        // Calculez la somme des éléments du tableau
        int somme = calculerSomme(tableau);
        System.out.println("La somme des éléments du tableau : " + somme);

        // Fermez le Scanner
        sc.close();
    }

    // Méthode pour obtenir un entier valide depuis l'utilisateur
    public static int obtenirEntier(Scanner sc) {
        while (true) {
            String ligne = sc.nextLine().trim();
            if (!ligne.isEmpty()) {
                try {
                    return Integer.parseInt(ligne);
                } catch (NumberFormatException e) {
                    System.out.print("Entrez un entier : ");
                }
            } else {
                System.out.print("Entrez un entier : ");
            }
        }
    }

    // Méthode pour remplir le tableau avec des entiers valides
    public static void remplirTableau(int[][] tableau, Scanner sc) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print("Entrez l'élément à la position [" + i + "][" + j + "] : ");
                tableau[i][j] = obtenirEntier(sc);
            }
        }
    }

    // Méthode pour afficher le contenu du tableau
    public static void afficherTableau(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println(); // Passage à la ligne pour la prochaine ligne du tableau
        }
    }

    // Méthode pour calculer la somme des éléments du tableau
    public static int calculerSomme(int[][] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                somme += tableau[i][j];
            }
        }
        return somme;
    }
}

/* Exemple de output

  run:
Entrez le nombre de lignes du tableau :  
Entrez un entier : +
Entrez un entier : u
Entrez un entier : 2
Entrez le nombre de colonnes du tableau : j
Entrez un entier : 0h
Entrez un entier : +-
Entrez un entier : 2
Entrez les éléments du tableau (utilisez l'indice [0][0] pour la première case) : 
Entrez l'élément à la position [0][0] : u
Entrez un entier : 5
Entrez l'élément à la position [0][1] : 0
Entrez l'élément à la position [1][0] : 2
Entrez l'élément à la position [1][1] : 1
Affichons ce que vous avez entré :
5 0 
2 1 
La somme des éléments du tableau : 8
BUILD SUCCESSFUL (total time: 37 seconds)

  */

    
