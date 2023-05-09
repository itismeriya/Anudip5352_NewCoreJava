import java.util.Scanner;
public class Vaccination {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int age;
	String gender;

	System.out.println("Enter age: ");
	age=sc.nextInt();

	sc.nextLine();	//consume delimiter
	System.out.println("Enter Gender: ");
	//char c=sc.next().charAt(0);
	gender=sc.nextLine();	

	if((age>=18)&&((gender.equalsIgnoreCase("MALE"))||(gender.equalsIgnoreCase("FEMALE"))))
	{
		System.out.println("You are eligible");
	}
	else
	{
		System.out.println("You are not eligible");
	}
}
}