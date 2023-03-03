import java.util.*;
public class Fibonacci
{
   public static void main(String[] args)
   {
      System.out.println("enter a num:");
      Scanner input=new Scanner(System.in);
      int x= input.nextInt();
      System.out.println("\n");
      int a=0;
      int b=1,t;
      System.out.println(a);
      System.out.println(b);
      // num.of fibonaccies
      for(int i=0; i<x;i++)
      {
         t=a+b;
         System.out.println(t);
         a=b;
         b=t;
         t=a;
      }
   }
}