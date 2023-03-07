import java.util.*;
public class Evenodd
{
   public static void main(String args[])
   { 
      Scanner input = new Scanner(System.in);
      System.out.println("enter a val: ");
      int a = input.nextInt();      
      if(a%2==0)
         System.out.println(a+" is even number");
      else
         System.out.println(a+" is odd number");
   }
}
      