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

package week1.tps; //package
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class moyenne {
    
    public static void main (String [] args){
        //objet Scanner
        Scanner sc = new Scanner(System.in);
        //Déclaration des variables
        double note1, note2, note3;
        int coeff1, coeff2, coeff3;
        double moy;
        char reponse = ' ';
        String nom =" ";
    do{ 
    reponse = ' ';   
    System.out.println("____________Relevé de notes________________\n");
    System.out.println("Semestre : 1 ---- Année scolaire : 2022/2023");
    
    System.out.print("Entrez le nom de l'élève : ");
    nom = sc.nextLine();
    
    //Entrer les coefficients
    
    System.out.print("Entrez le coefficient du module Java : ");
    coeff1 = sc.nextInt(); //TODO : control des coeff
    System.out.print("Entrez le coefficient du module XML : ");
    coeff2 = sc.nextInt();
    System.out.print("Entrez le coefficient du module English : ");
    coeff3 = sc.nextInt();
    
    int[] classe = new int [2]; // un tableau qui peut contenir 2 int
    int maison[] = {2}; // decl & ini
    //Vider
    sc.nextLine();
    
    //Entrons les notes
    
    System.out.print("Entrez la note du module Java : ");
    note1 = sc.nextDouble();
    do{
           System.out.print("Entrez la note de Java : ");
       } while (note1<0 || note1>20);
    System.out.print("Entrez la note du module XML : ");
    note2 = sc.nextDouble();
    do{
           System.out.print("Entrez la note de XML : ");
       } while (note2<0 && note2>20);
    System.out.print("Entrez la note du module English : ");
    note3 = sc.nextDouble();
    do{
           System.out.print("Entrez la note de English : ");
       } while (note3<0 && note3>20);
    
    //Vider
    sc.nextLine();
    
    //Calculons la moyenne
    moy = (note1*coeff1 + note2*coeff2 + note3*coeff3) / (coeff1 + coeff2 + coeff3);
    
    //Affichage de la moyenne
    
    System.out.println("La moyenne de " +nom+ " est : " +moy);
    
    //Condition pour avoir la conclusion
    
    if(moy < 10){
        System.out.println("Semestre non validé !");
    } else {
        System.out.println("Semestre Validé !");
    }
    System.out.print("Voulez vous calculer la moyenne d'un autre étudiant ?? (o/n) :  ");
    reponse = sc.nextLine().charAt(0);
  } while (reponse == 'o');
    
    System.out.print("Merci, Au revoir !!! ");
}
   // public static void validationNote(String matiere,double note){
     //   do{
        //    System.out.print("Entrez la note de : "+matiere);
        //} while (note<0 && note>20);
    //}
}


/* Exercice : Utilisation de variables d'instance et de classe

Créez une classe Personne avec les propriétés suivantes :

Une variable d'instance nom de type String.
Une variable d'instance age de type int.
Ajoutez un constructeur à la classe Personne qui prend deux arguments (nom et age) et initialise les propriétés correspondantes.

Ajoutez une méthode afficherDetails à la classe Personne qui affiche le nom et l'âge de la personne.

Créez une classe principale appelée Main avec la méthode main.

Dans la méthode main, créez deux objets Personne avec des noms et des âges différents.

Affichez les détails des deux personnes en appelant la méthode afficherDetails pour chaque objet.*/

//Classe Personne
public class Personne{
//Variables d'instances
 public String nom;
 private int age;
//Constructeur
  public Personne(String nom, int age){
    this.nom = nom;
    this.age = age;
  }
//methode afficherDetail
  public void afficherDetail(){
  System.out.print("nom : " + nom);
  System.out.print("age : " + age);
  }
}

//classe main
public class Main{
//methode main
  public static void main (String[] args){
//objets personnes avec noms et ages #ts
    Personne personne1 = new Personne ("Shelby", 20);
    Personne personne2 = new Personne ("Thomas", 26);
  }
//affichage
  personne1.afficherDetail();
  personne2.afficherDetail();
  }
}

//20/09/2023

//Utiliser super() pour hériter une méthode Manger, un constructeur Boire et Accéder aux variables x de la classe parente et y de la classe fille 
super.Manger(); //appel à la méthode
super(Boire); //appel au constructeur
System.out.print(super.x); //var de la classe parente
System.out.print(this.y); //var de la classe enfant

/*Surcharge : C'est la copie d'une méthode mais avec des paramètres différentes*/
class Calculatrice {
    int addition(int a, int b) {
        return a + b;
    }
    double addition(double a, double b) { //Surcharge
        return a + b;
    }
}

/* Interface : classe contenant que des méthodes abstraites*/
interface Forme{
  double Perimetre();
  double Aire();
}

/*Encapsulation : regroupement de données et les méthodes opérant ces données dans une même entité appelée classe
Elle empêche l'accès direct aux données de cette classe depuis l'extérieur

Héritage : méthode permettant d'utiliser les propriétés d'une autre classe
La redéfinition est une surcharge de méthode
Polymorphisme : permet de manipuler les objets sans vraiment connaître leur type, elle se fait grace à l'héritage et à l'interface*/
class Animal {
    void faireDuBruit() {
        System.out.println("L'animal fait un bruit indéfini.");
    }
}

class Chien extends Animal { //héritage
    @Override
    void faireDuBruit() { // Redéfinition de la méthode faireDuBruit de la classe parente
        System.out.println("Le chien aboie.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal monAnimal = new Chien(); // Polymorphisme
        monAnimal.faireDuBruit(); // Appelle la méthode redéfinie du chien
    }
} // Tout ceci est une encapsulation


/*La classe object est défini dans le package java.lang , ce qui veut dire qu'on est pas obligé de l'invoquer;
Nous avons :
equals() : pour définir l'égalité des objets
hashcode(): pour retourner un code de hashage de l'objet */

/*
Supposons que vous construisez un petit jeu de société avec des figurines. Vous avez une classe de base appelée Figurine
et deux sous-classes appelées Joueur et Monstre. Chacune de ces classes a une méthode afficherRole qui doit être redéfinie
pour afficher le rôle spécifique de la figurine (joueur ou monstre).

Créez une classe Figurine avec une méthode afficherRole qui affiche "Je suis une figurine".

Créez une sous-classe Joueur de Figurine qui redéfinit la méthode afficherRole pour afficher "Je suis un joueur".

Créez une sous-classe Monstre de Figurine qui redéfinit la méthode afficherRole pour afficher "Je suis un monstre".

Dans la méthode main, créez une instance de Joueur et une instance de Monstre, puis appelez la méthode afficherRole pour chaque instance.
Utilisez le polymorphisme pour simplifier le code.
*/

/////////////J'ai essayé//////////////

public class Figurine {
   void afficherRole(){
       System.out.println("Je suis une figurine");
   }
   public static void main (String[] args){
    //Appel de fonctions
       Figurine joueur1 = new Joueur();
       Figurine monstre1 = new Monstre();      
    //afficher
        joueur1.afficherRole();
        monstre1.afficherRole();
   }
}
class Joueur extends Figurine{
    @Override
    void afficherRole(){
    System.out.println("Je suis un joueur");
    }
}
class Monstre extends Figurine{
    @Override
    void afficherRole(){
    System.out.println("Je suis un monstre");
  }
}
/*Output :
run:
Je suis un joueur
Je suis un monstre
BUILD SUCCESSFUL (total time: 0 seconds)
*/

/* Pour comprendre le polymorphisme
Enoncé de l'exercice :

Vous travaillez sur un système de gestion d'employés pour une entreprise. Vous avez une classe de base appelée Employe
et plusieurs sous-classes pour différents types d'employés, tels que EmployeTempsPlein et EmployeTempsPartiel. Chacune
de ces classes doit implémenter des méthodes spécifiques tout en maintenant l'encapsulation et en utilisant le polymorphisme,
la surcharge et la redéfinition.

Créez une classe de base Employe avec les attributs privés suivants :

nom (String) : le nom de l'employé.
salaireBase (double) : le salaire de base de l'employé.

-Ajoutez une méthode calculerSalaire dans la classe Employe qui renvoie le salaire total de l'employé en fonction du salaire de base.
Cette méthode sera redéfinie par les sous-classes pour prendre en compte leur logique spécifique.

-Créez une sous-classe EmployeTempsPlein de Employe qui ajoute un attribut privé heuresTravaillees (int) et qui redéfinit la méthode
calculerSalaire pour calculer le salaire total en fonction du salaire de base et du nombre d'heures travaillées. Utilisez la surcharge
pour fournir deux constructeurs : un avec toutes les informations et un avec seulement le nom et le salaire de base (heures travaillées
définies à zéro par défaut).

-Créez une sous-classe EmployeTempsPartiel de Employe qui ajoute un attribut privé tauxHoraire (double) et qui redéfinit la méthode
calculerSalaire pour calculer le salaire total en fonction du taux horaire et du salaire de base. Utilisez la surcharge pour fournir deux
constructeurs : un avec toutes les informations et un avec seulement le nom et le salaire de base (taux horaire défini à zéro par défaut).

-Dans la méthode main, créez des objets de type EmployeTempsPlein et EmployeTempsPartiel, définissez leurs attributs et calculez leur salaire
en utilisant la méthode calculerSalaire. Affichez les informations sur chaque employé.
*/

class Employe {
    private String nom;
    private double salaireBase;

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public double calculerSalaire() {
        return salaireBase;
    }
}

class EmployeTempsPlein extends Employe {
    private int heuresTravaillees;

    public EmployeTempsPlein(String nom, double salaireBase, int heuresTravaillees) {
        super(nom, salaireBase);
        this.heuresTravaillees = heuresTravaillees;
    }

    public EmployeTempsPlein(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + (heuresTravaillees * super.calculerSalaire());
    }
}

class EmployeTempsPartiel extends Employe {
    private double tauxHoraire;

    public EmployeTempsPartiel(String nom, double salaireBase, double tauxHoraire) {
        super(nom, salaireBase);
        this.tauxHoraire = tauxHoraire;
    }

    public EmployeTempsPartiel(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + (tauxHoraire * super.calculerSalaire());
    }
}

public class GestionEmployes {
    public static void main(String[] args) {
        EmployeTempsPlein employe1 = new EmployeTempsPlein("Alice", 15.0, 40);
        EmployeTempsPartiel employe2 = new EmployeTempsPartiel("Bob", 20.0, 0.5);

        // Affichez les informations sur les employés
        System.out.println("Employé Temps Plein : " + employe1.calculerSalaire());
        System.out.println("Employé Temps Partiel : " + employe2.calculerSalaire());
    }
}
