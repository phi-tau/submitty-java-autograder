/** 
Write a program RainyDays to compute and print the percentage of 
days of rain in a year. Ask the user to input the city, the year 
and the number or rainy days for that year. Print a message that 
includes the year and the percentage of days that were rainy.

Use a custom method called getRainyPercentage() that computes 
the percentage with the parameters:
- year
- rainy days

E.g. What city?
Denver
What year?
2012
How many days of rain?
47
It rained 12.8767% of the year in Denver in 2012. 
**/

import java.util.Scanner;   
public class Week05c_RainyDays
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
     
      System.out.println("What city?");
      String city = keyboard.nextLine();
      
      System.out.println("What year?");
      int year = keyboard.nextInt();
         
      System.out.println("How many days of rain?");
      int daysOfRain = keyboard.nextInt();
   
      System.out.println("It rained " + getRainyPercentage(year, daysOfRain) 
         + "% of the year in "+ city
         + " in "+ year +".");
   }
   
   public static double getRainyPercentage(int year, int rainyDays){
      int daysPerYear;
      
      //check for leap year
      if(year%4==0 ){
         daysPerYear=366;
      }else{
         daysPerYear=365;
      }
      
      return 100.0*rainyDays/daysPerYear;
   } 
}
        

       


