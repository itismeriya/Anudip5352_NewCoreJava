class  Bank{
 
   private int accountNo;

    private String accountHolderName;

    private double balance;


    public Bank(int accountNo, String accountHolderName, double balance)
 {
        this.accountNo = accountNo;

        this.accountHolderName = accountHolderName;
 
       this.balance = balance;
  
  }

  
  public void withdraw(double amount)
 {
       
 if (balance >= amount) 
{
  
          balance -= amount;
 
           System.out.println("Withdrawn amount: " + amount);

            System.out.println("Current balance: " + balance);
  
      } 
else
 {
 
           System.out.println("Insufficient balance.");
 
       }
  
  }

   

    public int getAccountNo() 
{
 
       return accountNo;
 
   }

  
  public void setAccountNo(int accountNo) 
{
        this.accountNo = accountNo;
    }

  
  public String getAccountHolderName() {
  
      return accountHolderName;
    
}

  
  public void setAccountHolderName(String accountHolderName)
 {
        this.accountHolderName = accountHolderName;
    }

   
 public double getBalance() 
{
        return balance;
    }

 
   public void setBalance(double balance)
 {
        this.balance = balance;
    }

}


public class balance{
   
 public static void main(String[] args)
 {
        Bank bank = new Bank(123456, "Koyel", 1000.0);

	bank.withdraw(500.0);
	 
bank.withdraw(700.0); 
  
  }

}