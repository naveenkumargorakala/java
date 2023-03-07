import java.util.*;
public class Powersof2
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int x=1;
      System.out.println("Enter a number 0 to 31");
      int n = input.nextInt();
      for(int i=1;i<n+1;i++)
      {
       System.out.println("2"+"^"+i+"="+(x*=2));
      }
   }
}  