//class BankATMException created to handle and throw user defined exception
class BankATMException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// Parameterized constructor
	
	public BankATMException(String mymsg)
    {
        super(mymsg);
    }
}

//BankATM class created to do operation and throw out the user defined exeption
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
		
		//three objects created of BankATM class.
		
		BankATM b1=new BankATM();
		BankATM b2=new BankATM(20000);
		BankATM b3=new BankATM();
		//b1.deposit(30000);
		//calling withdraw class to throw the user defined exceptions
		
		b2.withdraw(8000);
		b3.withdraw(2000);
		//b3.withdraw(5000);
		//b1.withdraw(5000);
	}
	
	// Deposit method to deposit balance.
	
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
