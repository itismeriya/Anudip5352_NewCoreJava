import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = sc.nextInt();

		System.out.println("Enter second number");
		int secondNumber = sc.nextInt();
		
              
		Calculator cal = new Calculator();
		cal.setFirstNumber(firstNumber); 
		cal.setSecondNumber(secondNumber);
		
		Calculation cal = new Calculation();
		
		int addResult = c.add(cal.getFirstNumber(), cal.getSecondNumber());
		System.out.println("Addition Result ="+addResult);
		
		int subResult = c.substract(cal.getFirstNumber(), cal.getSecondNumber());
		System.out.println("Subtraction Result ="+subResult);
		
		int mulResult = c.multiply(cal.getFirstNumber(), cal.getSecondNumber());
		System.out.println("Multiplication Result ="+mulResult);
		
		float divResult = ca.divide(cal.getFirstNumber(), cal.getSecondNumber());
		System.out.println("Division Result ="+divResult);

	}

}