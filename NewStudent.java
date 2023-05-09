import java.util.Scanner;

class NewEmployee {
	String name;
	char gender;
	int id;
	float salary;
	}
	
		
		
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee e1[]=new Employee[5];
	s1[0]=new Employee("Nobita","Male",101,10000.00);
	s1[1]=new Employee("Sizuka","Female",102,100000.00);
	s1[0]=new Employee("Zian","Male",103,60000.00);
	s1[0]=new Employee("Suniyo","Male",104,8000.00);
	s1[0]=new Employee("Dekisugi","Male",105,100.oo);

		Employee max = new Employee();
		Employee min = new Employee();
		for (int i = 0; i < n; i ++) {
			e.name = in.next();
			e.id = in.next();
			e.salary = in.nextInt();
			if (max.salary< e.salary) {
				max.name = e.name;
				
				max.salary = e.salary;
			}
			if (min.salary > e.salary) {
				min.name = e.name;
				min.id = e.id;
				min.salary = e.salary;
			}
		}
		System.out.println("name, ID ,salary,gender:");
		System.out.println(max.name + " " + max.id);
		System.out.println(min.name + " " + min.id);
		in.close();
	}
}
