import java.util.Scanner;

/**
 * Receipt2.java  
 * modified from original
 * @author – Simon Crisp
 * @author – 3rd period
 */ 
public class Receipt2
{
   public static void main(String [] args)
   {  //"And the best part... You can eat em" - Clark
      System.out.println("Thank you for shopping at Captain Clark's Ottoman Empire");
      Scanner input = new Scanner(System.in);
      System.out.println("How many sofas are you ordering?");
      int sofas = input.nextInt();
      System.out.println("How many chairs are you ordering?");
      int chairs = input.nextInt();
      System.out.println("How many beds are you ordering?");
      int beds = input.nextInt();
      System.out.println("How many tables are you ordering?");
      int tables = input.nextInt();
      int ordernumber = (int) (Math.random() * 100);
      input.nextLine();
      System.out.println("Which city do you currently live in (city, state, country, planet)");
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
      //"I AM A F****** ARCHITECT!!!!!! SOMEONE JUST WONT GET OFF THEIR *** *** AND HELP ME!!!!" - Clark
      
      double drinkprice = 1.5;//Math.random() * 2;
      double candyprice = 1.25; //Math.random() * 2;
      double dogprice = 2.75;//Math.random() * 2;
      double burgerprice = 3.5;//Math.random() * 2;
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*     " + skeww.toUpperCase() + "                           *");
      System.out.println("*                                    *");
      System.out.println("*     Sofas ..........$"+drinkprice+"           *");                      
      System.out.println("*     Chairs ..........$"+candyprice+"          *");     
      System.out.println("*     Beds ........$"+dogprice+"          *");     
      System.out.println("*     Tables ......$"+burgerprice+"           *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      
      System.out.println("Order #: " + ordernumber);
      System.out.println("Sof@s ordered: " + sofas + " Total: " + sofas * drinkprice);
      System.out.println("Chairs ordered: " + chairs + " Total: " + chairs * candyprice);
      System.out.println("Beds ordered: " + beds + " Total: " + beds * dogprice);
      System.out.println("Tables ordered: " + tables + " Total: " + tables * burgerprice);
      double subtotal = sofas * drinkprice;
      subtotal += chairs * candyprice;
      subtotal += beds * dogprice;
      subtotal += tables * burgerprice;
      System.out.println("subtotal price: " + subtotal);
      double tax = 1.38;
      
      double total = subtotal * tax;
      System.out.println("T@x: " + tax);
      System.out.println("T0taI: " + total);
      System.out.println("It appears the reciept has glitched out, I am gonna go find the manager to solve this issue...");
      System.out.println("Ah, they must be downstairs, I see no on up here...");
      System.out.println("I have made it to the base of the stairs, about to step onto the next fl- AHHHHHHHHHHHH");
      System.out.println("you have fallen through the floor it seems, and are surrounded by rooms in yellow and a stinky moldy \n carpet, your way in appears to be out of reach....");
      System.out.println("What do you do now??? well, you could 1, walk to the right, or 2, to the left...");
      int choice = input.nextInt();
      if(choice == 1) {
         System.out.println("You go to the right, and find yourself going through an endless maze of yellow, with random furniture strewn about, you pass by a window in the wall... \n you see a tall man in a blue suit, he turns around, sees you, his eyes are purely white \n he carries a briefcase, 'You aren't supposed to be hear Mr. Freeman' Suddenly, the lights flicker and the man is gone... \n you look back behind you and hear a piercing bellow, suddenly a black creature made of wet, slick, twisted metal comes hurtling towards you, without thought, you jump for the window, the creature hot on your heels, you run through the maze, as you do, the creature is neither able to lose you or gain on you, your speeds seem equal to it.");
      }
      if(choice == 2) {
         System.out.println("You go to the left, and see a slide in the wall, you hear a noise behind you, get scared, and \n jump through head first, it takes a bit of time but... you see a light \n the slide ends at a huge drop into another room, you, unable to stop yourself \n fall what looks to be 200 feet an- *CRUNCH*");
         System.out.println("ASYNC Log 37654: Unidentified human subject killed by falling after attempting to escape animate hazard #12, cleaning team dispatched");
      }
   }
}