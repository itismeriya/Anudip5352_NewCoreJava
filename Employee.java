package basicprograms;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter basic SALARY: ");
		
		double basicSal=s.nextInt();
		double hra=0,da=0;
		
		if(basicSal>1500)
		{
			hra=0.2*basicSal;
			da=0.9*basicSal;
		}
		else
		{
			hra=500;
			da=0.7*basicSal;
		}
		double grossSal=basicSal+hra+da;
		System.out.println(grossSal);
	}

}


package basicprograms;

public class LastPattern {

	public static void main(String[] args) {
		for(int i=5;i>=0;i--)
		{
			int k=5;
			for(int j=0;j<i;j++)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
	}

}

