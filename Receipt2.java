import java.util.Scanner;

/**
 * Receipt2.java  
 *
 * @author – Simon Crisp
 * @author – 3rd period
 */ 
public class Receipt2
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("How many drinks are you ordering?");
      int drinks = input.nextInt();
      System.out.println("How many candies are you ordering?");
      int candies = input.nextInt();
      System.out.println("How many hot dogs are you ordering?");
      int hotdogs = input.nextInt();
      System.out.println("How many hamburgers are you ordering?");
      int burgers = input.nextInt();

     String highschool = "Trevor Packer HS Snack Bar";
     double drinkprice = 1.50;
     double candyprice = 1.25;
     double dogprice = 2.75;
     double burgerprice = 3.50;
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*" + highschool + "           *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..........$"+drinkprice+"          *");                      
      System.out.println("*     Candy ..........$"+candyprice+"          *");     
      System.out.println("*     Hot Dog ........$"+dogprice+"          *");     
      System.out.println("*     Hamburger ......$"+burgerprice+"          *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      System.out.println("Order #: 35");
   }
}