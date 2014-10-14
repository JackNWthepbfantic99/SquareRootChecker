import java.util.Scanner;

public class SquareRootChecker{
 
  public static void main(String[] args){
   Scanner scnr = new Scanner(System.in);
   
   System.out.println("Enter positve interger: ");
   int number = scnr.nextInt();
   
   if (number<0){
   System.out.println("Enter zero or quantity greater than 0: ");
   }else{
   System.out.println("The squareroot of you number is " + Math.sqrt(number));
   }
 }
}
   
