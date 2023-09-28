import java.util.Scanner;

public class Lab3{
    public static void main(String []args){
        lab4();
        lab3();
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