class BankATMException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankATMException(String mymsg)
    {
        super(mymsg);
    }
}
public class BankATM {
	
	int atmId; 
	String bankName;
	String location;
	double balance;
	
	public BankATM()
	{
		
	}
	public BankATM(double amt)
	{
		this.balance=amt;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BankATM b1=new BankATM();
		BankATM b2=new BankATM(20000);
		BankATM b3=new BankATM();
		//b1.deposit(30000);
		b2.withdraw(8000);
		b3.withdraw(2000);
		//b3.withdraw(5000);
		//b1.withdraw(5000);
	}
	
	// Deposite method to deposite balance.
	
    public void deposit(double amt)
    {
    	this.balance = amt;
    	System.out.println(this.balance);
    }
	
    //withdraw method that throw user defined exception whenever bance is less than rs 10000.
    
    public void withdraw(double amt) throws BankATMException
    { 	double amount;
    	 amount=this.balance-amt;
        System.out.println(amount);
        if(amount<10000)
              
          {
            
        	throw new BankATMException("Balance is less than rs 10000.");
          }
        }
    

}
