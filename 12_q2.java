import java.util.Scanner;
class q2
{

public static void main(String[ ] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Rectangle: ");
System.out.println("Enter length: ");//Rectangle
float l=obj.nextInt();

System.out.println("Enter width: ");
float w=obj.nextInt();

System.out.println("Square: ");
System.out.println("Enter sides of square: ");//Square
float a=obj.nextInt();

System.out.println("Triangle: ");
System.out.println("Enter base");//Triangle
float b=obj.nextInt();

System.out.println("Enter height");
float h=obj.nextInt();

System.out.println("Area of r: "+l*w);
System.out.println("Area of s: "+a*a);
System.out.println("Area of t: "+(b*h)/2);
}
}