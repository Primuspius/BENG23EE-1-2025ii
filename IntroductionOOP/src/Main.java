
import  java.util.*;
class Human {


     String KingdomName;
     String Breath;
     String Hunger;


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);


         Female ofenale = new Female();
         Male omale = new Male();
         Human ohuman = new Human();


 while(true) {

     System.out.println("Welcome  Make a Choice \n _______________");
     System.out.println(" Option 1: Male");
     System.out.println(" Option 2:  Female");
     int choice;
     choice = sc.nextInt();
     switch(choice){
         case 1:
             System.out.println("You Have choosen the class Male ");
             System.out.println("Enter Your Name: ");
             ofenale.Name = sc.next();

             System.out.println("Enter Your Gender: ");
             ofenale.Gender = sc.next();
             ofenale.DisplayFemale();
             break;

     }
 }

//        // Just some outputs
//
//        System.out.println(" ________________ BENG23EE __________________ ");
//        System.out.println("                  CLASSES AND OBJECTS ");
//        System.out.println("             ***************************");


    }

}



