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
      int ordernumber = (int) (Math.random() * 100);
      input.nextLine();
      System.out.println("Which high school do you currently attend?");
      String highschool = input.nextLine();
      //"I DONT THINK YOU KNOW HOW MUCH LOOKS MATTER AT THIS SKEWW!!!!!!!" - Eric Cartman
      String skeww = highschool.substring(0,1);
      int space = highschool.indexOf(" ");
       
      skeww += highschool.substring(space + 1, space + 2);
      highschool = highschool.substring(space + 1);
      space = highschool.indexOf(" ");
       
      skeww += highschool.substring(space + 1, space + 2);
      highschool = highschool.substring(space + 1);
       space = highschool.indexOf(" ");
       
      skeww += highschool.substring(space + 1, space + 2);
      highschool = highschool.substring(space + 1);
    
      
      double drinkprice = 1.5;//Math.random() * 2;
      double candyprice = 1.25; //Math.random() * 2;
      double dogprice = 2.75;//Math.random() * 2;
      double burgerprice = 3.5;//Math.random() * 2;
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*" + skeww.toUpperCase() + "                             *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..........$"+drinkprice+"           *");                      
      System.out.println("*     Candy ..........$"+candyprice+"          *");     
      System.out.println("*     Hot Dog ........$"+dogprice+"          *");     
      System.out.println("*     Hamburger ......$"+burgerprice+"           *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      
      System.out.println("Order #: " + ordernumber);
      System.out.println("drinks ordered: " + drinks + " Total: " + drinks * drinkprice);
      System.out.println("candies ordered: " + candies + " Total: " + candies * candyprice);
      System.out.println("hot dogs ordered: " + hotdogs + " Total: " + hotdogs * dogprice);
      System.out.println("burgers ordered: " + burgers + " Total: " + burgers * burgerprice);
      double subtotal = drinks * drinkprice;
      subtotal += candies * candyprice;
      subtotal += hotdogs * dogprice;
      subtotal += burgers * burgerprice;
      System.out.println("subtotal price: " + subtotal);
      double tax = 1.38;
      
      double total = subtotal * tax;
      System.out.println("Tax: " + tax);
      System.out.println("Total: " + total);
   }
}