package basicprograms;
import java.util.*;


public class Armstrong
{
    public static void main(String[] args)
    {
        int n, sum = 0, num, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        if (n == sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}




public class Pattern {

	public static void main(String[] args) {
	int k=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
}
}

