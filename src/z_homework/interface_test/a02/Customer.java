package z_homework.interface_test.a02;

public class Customer {
	private String firstName, lastName; // 고객이름, 성
	private BankAccount[] accounts; // 고객 소유 계좌
	private int numberOfAccounts;

	Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	public BankAccount getAccount(int i) {
		return accounts[i];
	}

	public void addAccount(BankAccount ba) {
		accounts[numberOfAccounts++] = ba;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		
		return  this.firstName + " " + this.lastName ;
	}
}
