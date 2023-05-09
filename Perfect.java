public class Perfect
 {
   public static void main (String[]args)
   {

     Scanner sc=new Scanner(System.in);
	System.out.print("Enter number- ");  
    int n=sc.nextInt();

     for (int i = 1; i < n; i++)
       {
     	if (n % i == 0)
 	        sum += i;
       }

     if (sum == n)
       System.out.println (n + " Is a perfect number");
     else
       System.out.println (n + " Is not a perfect number");

   }
 }