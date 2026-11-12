public class Main {

   public static void main(String []args) {

      //Variables

      String highSchoolName = "BWL";
      double drinkPrice= 1.50;
      double candyPrice= 1.25;
      double hotdogPrice= 2.75;
      double hamburgerPrice= 3.50;
      int orderNum= Math.random()*100) +1;
      int numDrinks= Math.random()*3);
      int numCandies= Math.random()*3);
      int numHotdogs= Math.random()*3);
      int numHamburgers= Math.random()*3);

   
      // Receipt
      System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice + "                        *");                      
     System.out.println("*     Candy ..........$" + candyPrice + "        *");     
     System.out.println("*     Hot Dog ........$" + hotdogPrice + "        *");     
     System.out.println("*     Hamburger ......$" + hamburgerPrice + "        *");     
     System.out.println("*                                           *");    
     System.out.println("**************************************");
   }
}
  
 