import java.util.ArrayList;
import java.util.Scanner;

public class Lab3{

    // om >= 20 år OCH på Systemet -> ÖL
    // om >=18 OCH på krogen -> ÖL
    // annars inte
    public static boolean canIBuyBeer(int age, String location){
        if(age >=20 && location.equalsIgnoreCase("Systemet")) {
            return true;        
        }
        if(age >=18 && location.equalsIgnoreCase("Krogen")) {
            return true;        
        }
        return false;
    } 


    public static void main(String []args){

        ArrayList<String> players = new ArrayList<String>();
        //ArrayList<String> players = new ArrayList<>();
        //var players = new ArrayList<String>();

        String[] allDays ={"M", "T", "O"};

        for(String s: allDays){
            System.out.println(s);
            System.out.println("dsadasdas");
        }
        for(String s: allDays){
            System.out.println(s);
        }
        

        int age = 19;
        String location = "krogen"; //KrOgeN
        boolean isAllowed = canIBuyBeer(age, location); 
        //if(isAllowed){
        if(isAllowed == true){
            System.out.println("Yepp");
        }else{
            System.out.println("Nope");
        }

        if1();
        lab4();
        lab3();
   }

    public static void if1(){
/*Be användaren att mata in ett tal.
Kontrollera om talet är större än 10. Meddela
användaren om talet är större än 10- Talet är större än 10. Om det är mindre än 10
meddela användaren
– Talet är mindre än 10*/

        Scanner scanner = new Scanner(System.in);
        //Matar in

        System.out.print("Skriv in ett tal:");
        int tal = scanner.nextInt();
        if(tal > 10){
            System.out.println("Det är större än 10");
        }
        if(tal < 10){
            System.out.println("Det är mindre än 10");
        }
        scanner.close();

    }

    public static void lab4(){
/*a. Skriv ut Skriv in ditt förnamn: . Ta emot värdet i en variabel
b. Låt markören vänta på din inmatning på samma rad.
c. Gör på samma sätt med efternamnet.
d. Skriv sedan ut namnen i omvänd ordning.
e. Se till att resultatet ser ut så här. */        
        Scanner scanner = new Scanner(System.in);
        //Matar in

        System.out.print("Skriv in ditt förnamn:");
        String forNamn = scanner.nextLine();

        System.out.print("Skriv in ditt efternamn:");
        String efterNamn = scanner.nextLine();
        System.out.println("Du heter:" + efterNamn + ", " + forNamn);


        

    } 




   public static void lab3(){
/*
 Skapa en variabel String name med ditt namn
b. Skapa en int age med din ålder.
c. Skriv sedan ut Jag heter Kalle (innehållet i name) och är 27(innehållet i age) år.
 */

        String name  = "Stefan";
        int age = 51;
        System.out.println("Jag heter " + name + " och är "+ age + " år");

    }
}