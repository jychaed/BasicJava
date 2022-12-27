package z_homework.extends_test.a04;

public class CheckingAccount extends BankAccount{

	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
		super.balance= balance;
		
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		super.balance= balance;
		this.protectedBy = protectedBy;
	}
	
	@Override
	public boolean withdraw(int amount) {
		if(super.balance<amount) {
			super.withdraw(balance);
			protectedBy.withdraw(amount-super.balance);
			
		}
		return true;
	}

}
