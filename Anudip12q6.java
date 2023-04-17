import java.util.Scanner;
class Anudip12q6
{

public static void main(String[ ] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number: ");
int n=obj.nextInt();

System.out.println("Sum of the first "+n+" positive integers: "+(n*(n+1))/2);
}
}