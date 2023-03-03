import java.util.*;
public class Prime
{
   public static void main(String args[])
   {
      System.out.println("enetr a num:");
      Scanner input= new Scanner(System.in);
      int x = input.nextInt();
      int c=0; 
      for(int i=2;i<x;i++)
      {
         if(x%i==0)
            c++;
      }
      if(c>0)
         System.out.println("NOT PRIME");
      else
            System.out.println(x + "is Prime");
      }
   }