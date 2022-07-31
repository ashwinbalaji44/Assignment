package exception_handing;

public class BankMainBalance {
	public static void main(String[] args) throws InsufficientBalanceException{
		AmountValidation  valid = new AmountValidation();
		valid.validAmount(10000,5000);
	}
}
