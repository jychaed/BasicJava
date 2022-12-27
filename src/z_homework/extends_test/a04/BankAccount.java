package z_homework.extends_test.a04;

public class BankAccount {
	protected int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	} 
	public void deposit(int amount) {
	}
    public boolean withdraw(int amount) {
		return true;
    	}
    public boolean transfer(int amount,BankAccount otherAccount) {
		return true;
    }
    @Override
    public String toString() {
    	return "현재 잔액 " + this.balance;
    }
    }
  
