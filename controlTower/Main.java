/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    /* Write your code here */
   Scanner scan = new Scanner(System.in);
  
  //instance variables
   String callSign;
   double distance;
   int degrees;
   int altitude;
  
   
   //default airplane 1
   Assignment2 airplane1 = new Assignment2("AAA01", 1, 0, 0);
   System.out.print(airplane1);
   
  //default airplane 2
   Assignment2 airplane2 = new Assignment2("AAA02", 15.8, 128, 30,000);
   System.out.print(airplane2);
   
   
   //take input for airplane 3
   System.out.print("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
   
   //assign the inputs to variables
    callSign = scan.nextLine();
    String uCallSign = callSign.toUpperCase();
    distance = scan.nextDouble();
    degrees = scan.nextInt();
    altitude = scan.nextInt();
    
    //create airplane 3 with above variables
    Assignment2 airplane3 = new Assignment2(uCallSign, distance, degrees, altitude);
   
   //skip a line
   System.out.println("");
   
   //prints out the intial positions of the airplanes
   //I think this needs like commas??
   System.out.println("Initial Positions:");
   System.out.println("\"Airplane 1\": " + airplane1);
   System.out.println("\"Airplane 2\": " + airplane2);
   System.out.println("\"Airplane 2\": " + airplane3);
   
   
   //calculates distance of miles
   double dist1 = airplane1.distTo(airplane2);
   double dist2 = airplane1.distTo(airplane3);
   double dist3 = airplane2.distTo(airplane3);
   
   System.out.println("");
   
   //prints my distance in miles
   System.out.println("Initial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + dist1 + " miles."); 
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + dist2  + " miles."); 
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + dist3  + " miles."); 
   
   System.out.println("");
   
   //gets my initial height difference
   System.out.println("Initial Height Difference:");
   double height1 = airplane1.getAlt();
   double height2 = airplane1.getAlt();
   double height3 = airplane2.getAlt();
   
   //prints my initial height difference
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + height1 + " feet."); 
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + height2 + " feet."); 
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + " feet."); 
   
   
   System.out.println("");
   
   
   //moves my airplanes
   airplane1.gainAlt();
   airplane1.gainAlt();
   airplane1.gainAlt();
   airplane2.loseAlt();
   airplane2.loseAlt();
   airplane3.loseAlt();
   airplane3.loseAlt();
   airplane3.loseAlt();
   airplane3.loseAlt();
   
   
   //prints out my new plane positions 
   System.out.println("New Positions:");
   System.out.println("\"Airplane 1\": " + airplane1);
   System.out.println("\"Airplane 2\": " + airplane2);
   System.out.println("\"Airplane 2\": " + airplane3);
   
   
   //prints out my new plane distances
   System.out.println("New Distances:");
   double newDist1 = airplane1.distTo(airplane2);
   double newDist2 = airplane1.distTo(airplane3);
   double newDist3 = airplane2.distTo(airplane3);
  
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + newDist1 + " miles."); 
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + newDist2  + " miles."); 
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + newDist3  + " miles."); 
   
   
   //gets my new height differences
  System.out.println("New Height Difference:");
   double newHeight1 = airplane1.getAlt();
   double newHeight2 = airplane1.getAlt();
   double newHeight3 = airplane2.getAlt();
   
    //prints out my new height differences
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + newHeight1 + " feet."); 
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + newHeight2 + " feet."); 
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + newHeight3 + " feet."); 

  }
}
