//Justifier si les codes suivants contiennent des erreurs ou pas

//  1__________________
public class Program1{
  public static void main(String args) {
    System.out.println("Hello world !!");
  }
} /*Ce code ne s'exécute pas car le paramètre de la méthode main n'est pas un tableau de chaîne de caractère, en gros, il manque [] au milieur de String et args*/

//  2__________________
public class Program1{
  public static void main(String [] args) {
    System.out.println("Hello world !!");
  }
} /*Ce code s'exécute car la signature de main et de son caractère est correcte*/

//  3__________________
public class Program1{
  public static void main(String args []) {
    System.out.println("Hello world !!");
  }
} /*Ce code est exécutable car on peut mettre [] au avant ou après le args*/

//  4__________________
public class Program1{
  public static void main(String [] abc) {
    System.out.println("Hello world !!");
  }
} /*Ce code est exécutable car il n'est pas obligé d'écrire args, args est écrit dans le programme par défaut*/

//  5__________________
public class Program1{
  public void main(String [] args) {
    System.out.println("Hello world !!");
  }
} /*Ce code n'est pas exécutable car il manque static*/

//Voici un programme, on va donner le rôle de chaque ligne

package week1.tps; //importation du package
public class Program1{
  public static void main(String [] args){
    int x; int y; //Déclaration de variables de type entier (int) x et y
    x = 5; //Affection de la valeur 5 à x
    y = 5+6; //Calculer 5+6 puis l'affecter à y
    System.out.println("("+x+" , "+y+")"); //Afficher les valeurs x et y sous forme (5,11)
  }
}

//Préciser les erreurs sur les lignes de code puis les corriger
publc class Program1{
  public static void main(String [] args){
    int a; int b; float f;
    a = 5; b = a+1;
    c = a%b; // il faut déclarer c --> int c;
    d = a>3; // il faut déclarer aussi d --> boolean d;
    e = a == b; // idem --> boolean e;
    a = f; //On ne peut pas mettre une valeur float dans une valeur int mais on peut faire une conversion (il en existe 2: upcasting __implicite__ et downcasting) --> float x = 6.2f
    f = a; //On peut mettre une valeur entière dans une valeur de type float
  }
}

// Ecrire l'instruction qui calcule la moyenne

package week1.tps.exercice1;
public class Program3 {
  public static void main (String [] args) {
    float note1, note2, note3;
    float coef1, coef2, coef3;
    float moyenne;
    note1 = 12;
    note2 = note3 = 14; //Affectation de la valeur 14 à note3 puis à note2

    // Calculer la moyenne
    moyenne = (note1 * coef1 + note2 * coef2 + note3 * coef3) / (coef1 + coef2 + coef3); 
    
    if(moyenne > 10){ //si l'instruction à l'intérieur de if est supérieur à 1, il faut ouvrir une accolade
      System.out.println ("Valide");
      System.out.println ("Felicitation");
    }
    else{
      System.out.println ("Non Valide");
      System.out.println ("Plus d'\effort a faire ! ");
    }
  }
}

/*On veut maintenant transformer ça pour qu'on ai :

Relevé de notes
------------------------------------------------------------
Nom : Alibaba

Semestre : 1 ---- Année scolaire : 2022/2023

Module             Note            Validation
Java               12.0            Validé
XML                8.0             
English
-----------------------------------------------------------
Moyenne : 9.2
Semestre non validé !!!
*/


