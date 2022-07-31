package exception_handing;

class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String str) {
		super(str);
	}
	
}

public class AmountValidation {
	
		public void validAmount(int amt, int balance) throws InsufficientBalanceException
		{
			if(balance>=amt)
			{
				System.out.println("Money available in the account");
			}
			else 
			{
				throw new InsufficientBalanceException("Insufficient Balance");
			}
		}

}
