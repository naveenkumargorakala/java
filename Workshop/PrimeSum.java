import java.util.*;
public class PrimeSum
{
   public static void main(String args[])
   {
      int sum=0;
      for(int i=2;i<50;i++)
      {
         int c=0;
         for(int j=2;j<i;j++)
         {
            if(i%j==0)
            {
             c++;
            }
         }
         if(c>0)
         {
            continue;
         }
         else
         {
            System.out.println(".;
            sum+=i;
         }
      }
      System.out.println("Sum of prime numbers are: "+sum);
   }
}