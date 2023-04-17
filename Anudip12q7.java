import java.util.Scanner;
class Anudip12q7
{

public static void main(String[ ] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter number of Widgets");
float nmbr_of_widgets=obj.nextInt();

System.out.println("Enter number of Gizmos");
float nmbr_of_gizmos=obj.nextInt();
System.out.println("The total weight is : "+((nmbr_of_widgets*75)+(nmbr_of_widgets*112)));
}
}

