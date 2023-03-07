import java.util.*;
public class swap
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      System.out.println("enter two vals:");
      int a = input.nextInt();
      int b = input.nextInt();
      System.out.println("before Swapping a: "+a+ "b: "+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After Swapping a: "+a+ "b:" +b); 
   }
} 