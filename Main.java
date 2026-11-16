public class Main {

   public static void main(String []args) {

      //Variables

      String highSchoolName = "BWL";
      double drinkPrice= 1.50;
      double candyPrice= 1.25;
      double hotdogPrice= 2.75;
      double hamburgerPrice= 3.50;
      int orderNum= Math.random()*100 +1;
      int numDrinks= Math.random()*3;
      int numCandies= Math.random()*3;
      int numHotdogs= Math.random()*3;
      int numHamburgers= Math.random()*3;
      double orderSubtotal = 
      (numDrinks * drinkPrice)
      +(numCandies * candyPrice)
      +(numHotdogs * hotdogPrice)
      +(numHamburgers * hamburgerPrice);

      double taxRate = 0.08;
      double totalTax = (orderSubtotal * taxRate);
      double orderTotal = (orderSubtotal + totalTax);



   
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
  
 