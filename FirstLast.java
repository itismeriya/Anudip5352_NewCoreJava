import java.util.Scanner;
public class FirstLast {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        System.out.println("Enter : "+ n);
        int f= 0;
        int l= 0;
       
        l= n % 10;
        System.out.println("Last Digit is: " + l);        
       
        for(;n >=10;)
        {
                     n/=10;
        }
        System.out.println("First Digit is: " + f);
    }
}