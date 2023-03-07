import java.util.*;
import java.util.Random;
public class coin
{  
   public static void main(String args[])
   { 
      int Head=0,Tail=0;
      Random rand = new Random();
      for(int i=0;i<10;i++)
      {
         int flip = rand.nextInt(2);
         if(flip == 1)
         {
            System.out.println("Heads");
            Head++;
         }
         else
         {
            System.out.println("Tails");
            Tail++;
         }
      }
   System.out.println("Heads percentage: "+((Head*100)/10));
   System.out.println("Tails percentage: "+((Tail*100)/10));
   
   }
}  