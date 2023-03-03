import java.util.Random;
public class  CouponNumber
{
   public static void main(String args[])
   {
      int i=0,c=0;
      Random rand = new Random();

      int rand1=rand.nextInt(100);
        // System.out.println("rand1 is: "+rand1);
    while(i<100){
      int rand2=rand.nextInt(100);
         //System.out.println("rand2 is: "+rand2);
         if(rand1==rand2)
         {
            System.out.println("Here is distinct values: "+rand1);
            break;
         }
else
{
System.out.println(rand2);
c++;
}
}
System.out.println(c+" times after rand1 and rand2 are equal");

}
}