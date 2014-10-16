/**
*
* Reads in scores until a negative value is encountered, at which point it determines and prints the average
*
* @author Jack Navin-Weinstein
* @version Thursday,16 October
*
*/
import java.util.Scanner;

public class SquareRootChecker{
 
  public static void main(String[] args){
   Scanner scnr = new Scanner(System.in);
   
   System.out.println("Enter positve interger: ");
   double number = scnr.nextDouble();
   
   if (number<0){
   System.out.println("Enter zero or quantity greater than 0: ");
   }else{
   System.out.println("The squareroot of you number is " + Math.sqrt(number));
   }
 }
}
   
