package string;
import java.util.*;
public class ReverseString {




    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println("Reverse of the string: " + reverse);
    }
}