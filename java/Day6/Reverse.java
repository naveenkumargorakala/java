import java.util.*;
public class Reverse
{
   public static void main(String[] args)
   {
      System.out.println("enter a num: ");
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      int r,s=0;
      while(x!=0)
      {
         r=x%10;
         s=s*10+r;
         x=x/10;
      }
System.out.println(s + "  is Reverse number");
}
}
