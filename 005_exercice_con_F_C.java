// Méthode 1

package javaapplication13;
import java.util.Scanner; //importation du package que contient notre objet Scanner qu'on aura à utiliser

public class Conversion {
        public static void main(String[] args) {
            //Notre objet Scanner
            Scanner sc = new Scanner(System.in);
            //initialisation des variables
            double aConvertir, convertit=0;
            char reponse=' ';
            int mode = 0;
            System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
            System.out.println("-------------------------------------------------");
                            
            do{//tant que reponse = O //boucle principale
                do{//tant que reponse n'est pas O ou N
                mode = 0;
                    System.out.println("Choisissez le mode de conversion : ");
                    System.out.println("1 - Convertisseur Celsius - Fahrenheit");
                    System.out.println("2 - Convertisseur Fahrenheit - Celsius");
                    mode = sc.nextInt();
                    
                    if(mode != 1 && mode != 2)
                        System.out.println("Mode inconnu, veuillez réitérer votre choix.");
                        
                    }while (mode != 1 && mode != 2);
                        //saisie de la température à convertir
                        System.out.println("Température à convertir :");
                        aConvertir = sc.nextDouble(); //cette ligne permet de stocker ce que l'utilisateur a rentré et qu'on peut utiliser
                        //Pensez à vider la ligne lue
                        sc.nextLine();
                        //Selon le mode, on calcule différemment et on affiche le résultat
                            if(mode == 1){
                                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                                System.out.print(aConvertir + " °C correspond à : ");
                                System.out.println(arrondi(convertit, 2) + " °F.");
                            }
                            else{
                                convertit = ((aConvertir - 32) * 5) / 9;
                                System.out.print(aConvertir + " °F correspond à : ");
                                System.out.println(arrondi(convertit, 2) + " °C.");
                            }
                    //On invite l'utilisateur à recommencer ou à quitter
                    do{
                    System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
                    reponse = sc.nextLine().charAt(0);  //cette ligne permet de stocker ce que l'utilisateur a rentré et qu'on peut utiliser
                }while(reponse != 'O' && reponse != 'N');
                
            }while(reponse == 'O');
                System.out.println("Au revoir !");
                //Fin de programme
            }
        public static double arrondi(double A, int B) {
            return (double) ( (int) (A * Math.pow(10, B) + .5)) /Math.pow(10, B);
        }
    }
    
