package z_homework.extends_test.a04;

public class SavingsAccount extends BankAccount {
	
	private double interestRate; // 이자율

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		super.balance=balance;
		this.interestRate = interestRate;
	
	}

	public void updateBalance(int period) {  //저축기간을 인자로 받아 이자 계산해서 잔액 추가
		balance += (balance *period*interestRate);
		
	}


	}


