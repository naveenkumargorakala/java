import java.util.*;
public class Vowel
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      char c = input.next().charAt(0);
         if(c == 'a' || c=='e' || c=='i' || c=='o' ||c=='u')
            System.out.println(c+" is vowel");
         else
            System.out.println(c+" is consonant");
   }
}
