package z_homework.extends_test.a04;

public class Customer{
	private String firstName;
	private String LastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;
	

	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.LastName = lastName;
		accounts = new BankAccount[5];
	}
	
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts]=account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return "이름 :" + firstName +" "+ LastName + ", 계좌의 갯수 : " + getNumberOfAccounts();
	}

}