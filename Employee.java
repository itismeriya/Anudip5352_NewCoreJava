/*wap to calculate increment appraisal of an any employee(HR). Increment % will be based on Goals.
Goals: 
	I.60% should achieve in recruiting candidates(total >=70 candidtes)-the increment will be 20% of an basic salary. (bs*20)/100

            	II.30% should achieve in recruiting candidates(total >=40 <70 candidtes)-the increment will be 15% of an basic salary.

	III.10 should achieve in recruiting candidates(total >=10 <40candidtes)-the increment will be 10% of an basic salary.

Input of Basic salary and no.of candidates recruits will be taken from user.
*/

import java.util.Scanner;
public class Employee {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);

		System.out.println("enter no of candidate: ");

        		int numc =s.nextInt();
      
  		System.out.println("enter basic salary: ");
      
  		int  bs=s.nextInt();
     
   		if(numc>=70)
           
 			bs=bs+((bs*20)/100);
      
  		else if(numc<70 && numc>=40)
   
      			bs=bs+((bs*15)/100);
    
    		else if(numc<40 && numc>=10)
          
  			bs=bs+((bs*10)/100);

		else
         
   			System.out.println("no increment");

    
    		System.out.println("new salary:"+bs);
}
}