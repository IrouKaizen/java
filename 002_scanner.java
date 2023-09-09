//Utilisation de l'objet Scanner

import java.util.Scanner; //importation du package

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); // initialisation pour récupérer après ce que nous allons taper en console
    
    System.out.println("Saisissez un entier : ");
    int i = sc.nextInt(); //nextInt est utilisé pour les int
    
    System.out.println("Saisissez une chaîne : ");
    sc.nextLine(); //On vide la ligne avant d'en lire une autre
    String str = sc.nextLine(); //nextLine est utilisé pour les String
    
    System.out.println("FIN ! ");
  }
}
