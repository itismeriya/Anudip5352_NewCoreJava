import java.util.Scanner;


public class StaticBlock {

    static String name;

    static int id;


    static {
 
       Scanner scanner = new Scanner(System.in);
  
      System.out.print("Enter your name: ");
  
      name = scanner.nextLine();
  
      System.out.print("Enter your ID: ");
  
      id = scanner.nextInt();
  
  }

   
 public static void main(String[] args)
 {
        System.out.println("Name: " + name);
  
      System.out.println("ID: " + id);
  
  }
}