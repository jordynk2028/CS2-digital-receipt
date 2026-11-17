
import java.util.Scanner;
public class Main {

   public static void main(String []args) {

      //Variables

      String highSchoolName = "BWL";
      double drinkPrice= 1.50;
      double candyPrice= 1.25;
      double hotdogPrice= 2.75;
      double hamburgerPrice= 3.50;
      int orderNum= (int) (Math.random()*100 +1);
      int numDrinks= (int) (Math.random()*3);
      int numCandies=(int) (Math.random()*3);
      int numHotdogs= (int) (Math.random()*3);
      int numHamburgers= (int) (Math.random()*3);
      double orderSubtotal = 
      (numDrinks * drinkPrice)
      +(numCandies * candyPrice)
      +(numHotdogs * hotdogPrice)
      +(numHamburgers * hamburgerPrice);

      double taxRate = 0.08;
      double totalTax = (orderSubtotal * taxRate);
      double orderTotal = (orderSubtotal + totalTax);


      //Scanner 
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter number of drinks");
      numDrinks=input.nextInt();

       System.out.print("Enter number of candies");
     numCandies=input.nextInt();

       System.out.print("Enter number hot dogs");
      numHotdogs=input.nextInt();

       System.out.print("Enter number of hamburgers");
      numHamburgers=input.nextInt();

      
  System.out.print("Enter High school name");
      highSchoolName=input.nextLine();



   
      // Receipt
      System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*     Order Number:"   + "orderNum             *");
     System.out.println("*     Drinks x" + numDrinks +" ..........$" + drinkPrice * numDrinks);                      
     System.out.println("*     Candy x" + numCandies +"..........$" + candyPrice * numCandies);     
     System.out.println("*     Hot Dog x" + numHotdogs +" ........$" + hotdogPrice * numHotdogs);     
     System.out.println("*     Hamburgerx" + numHamburgers +" ......$" + hamburgerPrice * numHamburgers);     
     System.out.println("*                                           *");    
     System.out.println("**************************************");
   }
}
  
 