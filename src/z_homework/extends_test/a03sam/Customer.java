package z_homework.extends_test.a03sam;

public class Customer {
	private String firstName, lastName; // 고객이름, 성
	private BankAccount account; // 고객 소유 계좌

	Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		String cBalance = String.format("%,d", this.account.getBalance());
		return "이름 : " + this.firstName + " " + this.lastName + ", 잔액 : " + cBalance;
	}
}
