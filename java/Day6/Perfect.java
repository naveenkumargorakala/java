import java.util.*;
public class Perfect
{
   public static void main(String[] args)
   {
      System.out.println("enter a num:");
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      int sum=0;
      for(int i=1;i<x;i++)
      {
          if(x%i==0)
             sum+=i;
      }
if(sum==x)
{
System.out.println(x+"Perfect num");
}
}
}
