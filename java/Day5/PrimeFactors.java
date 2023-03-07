import java.util.*;
public class PrimeFactors
{
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.println("enter n value:");
       int n = input.nextInt();
       for(int i=2;i<n;i++)
       {
          if(n%i==0)
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
                System.out.println("primefactors of: "+i);
             }
            
         }
      }
   }  
}            