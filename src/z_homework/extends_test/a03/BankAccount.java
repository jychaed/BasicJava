package z_homework.extends_test.a03;

public class BankAccount {

	private int balance; // 잔액
	
	public BankAccount(int balance) {// 기본생성자는 없고 이건있다 int를 받는데 blance로 받음
		this.balance = balance; // 인자로 전달되는 값으로 필드의 balance 초기화
	}

	public int getBalance() { // get이니까 조건없이 가져와야하니 파리미터가 없어요
//		return balance;
		return this.balance;
		
	}

	public void deposit(int amount) { // 입급 메서드 //우선 int a< 뭔지모르니가 쓰는것
		
	}
	
//	public void deposit(int a) { // 입급 메서드 //우선 int a< 뭔지모르니가 쓰는것
//		//this.balance += a;
//	}
//	
	
	public boolean withdraw(int amount) {
		return false; // boolean의 초기값은 false라서 줌
		
	}
	
//	public boolean withdraw(int a) {
//		if(this.balance < a) {
//			return false;
//		}else {
//			this.balance -= a;
//			return true;
//		}
//		return false; // boolean의 초기값은 false라서 줌
//		
//	}
	
	
	
	public boolean transfer(int amount , BankAccount otherAccount) { //우선 int a, BankAccount ba < 뭔지모르니가 쓰는것
		if(this.balance >= amount) {
			this.balance -= amount;
			otherAccount.balance += amount;
			return true; // 조건문 맞으면 참
		}
		return false; // 밑줄생기기 싫으니까 우선 맹글어줌
	}
//	
//	public boolean transfer(int a , BankAccount ba({
//			//방법1.
//	if(this.ba)
//		return false; // 밑줄생기기 싫으니까 우선 맹글어줌
//	}
	
	
	
}
