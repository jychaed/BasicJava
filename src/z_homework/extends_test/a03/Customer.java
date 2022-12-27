package z_homework.extends_test.a03;

public class Customer {

	private String firstName; // 그림이 자물쇠니 private // 고객 이름, 성
	private String lastName; 
	private BankAccount account; // 고객 소유 계좌
	
	public Customer(String firstName, String lastName) { // 기본생성자는 없고 
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public BankAccount getAccount() { // alt shift s 게터세터
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

	@Override // 내가 이런식으로 변경해서 쓰겠다 재정의를 한다.
	public String toString() { // alt shift s 투스트링
		String cBalance = String.format("%,d",this.account.getBalance());
		return "이름: " + this.firstName + this.lastName + ", 잔고: " + cBalance +"원" ;
	}
	
	
	
}
