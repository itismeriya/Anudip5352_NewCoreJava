import java.util.Scanner;
class Reverse
{
   public static void main(String args[])
   {
      int n=0;
      int r=0;
      System.out.println("Input: ");
      
      Scanner in = new Scanner(System.in);
      
     int n = in.nextInt();
      
      while( n != 0 )
      {
          r = r* 10;
          r= r + n%10;
          n= n/10;
      }

      System.out.println("Reverse of input number is: "+r);
   }
}