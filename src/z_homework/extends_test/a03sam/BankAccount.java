package z_homework.extends_test.a03sam;

public class BankAccount {
	private int balance; // 잔액

	BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int a) { // 입금 메서드
		this.balance += a;
	}

	public boolean withdraw(int a) { // 출금 메서드 // 송금을 하려면은 돈이 빠지는 거고 상대는 돈 입금이니까
		if (this.balance < a) {
			return false;
		} else {
			this.balance -= a;
			return true;
		}
	}

	public boolean transfer(int a, BankAccount ba) {
		// 방법1
//		if(this.balance < a) {
//			return false;
//		}else {
//			this.balance -= a;
//			ba.deposit(a);
//			return true;
//		}

		// 방법2
		boolean b = this.withdraw(a);
		if (b) {
			ba.deposit(a);
		} // 이거를 if (b) ba.deposit(a); 한줄로도 쓸 수 있음
		return b;
	}
}
