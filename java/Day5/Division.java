import java.util.*;
public class Division
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a value");
      int divisor = input.nextInt();
      int dividend = input.nextInt();
      int remainder=0; 
         remainder=dividend%divisor;
         dividend=dividend/divisor;
      System.out.println("rem: "+remainder);
      System.out.println("Quotient is: "+dividend);
   }
}