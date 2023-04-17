import java.util.Scanner;
class 12q5
{

public static void main(String[ ] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter length: ");
float l=obj.nextInt();

System.out.println("Enter width");
float w=obj.nextInt();

System.out.println("Area: "+l*w);
System.out.println("Area of the field in acres: "+(l*w)/43560);
}
}