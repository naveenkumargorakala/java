import java.util.*;
public class StopWatch
{
   public static void main(String[] args)
   {
       double difference;
       System.out.println("START");
       Scanner input = new Scanner(System.in);
       double start = input.nextDouble();
       start=System.currentTimeMillis();
       System.out.println("STOP");
       double stop = input.nextDouble();
       stop = System.currentTimeMillis();
       if(stop == 0)
       { 
          double now = System.currentTimeMillis();
          difference= now-start;
       }
       else
       {
          difference=stop-start;
       }
   double mils = difference % 1000;
   System.out.println("elapsed time: " + mils + "msec");
}
}