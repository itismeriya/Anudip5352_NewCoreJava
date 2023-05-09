import java.util.Scanner;

public class Calculatormethod {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
	c.add(10,20);
	c.subtract(20,10);
	c.multiplication(3,6);
	c.division(6/2);
	}

}
class Calculator
{
	public void add(int a,int b)
{
	System.out.prinltn(a+b);	
}
public void subtract(int a,int b)
{
	System.out.prinltn(a-b);	
}
public void multiplication(int a,int b)
{
	System.out.prinltn(a*b);	
}
public void division(int a,int b)
{
	System.out.prinltn(a/b);	
}
}