package string;
import java.util.Scanner;
public class CompareString {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        
        if (string1.equals(string2)) {
            System.out.println("The two strings are equal.");
        } else {
        System.out.println(" The two strings are not equal.");
        }


    }
}