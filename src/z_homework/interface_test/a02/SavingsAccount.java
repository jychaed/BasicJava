package z_homework.interface_test.a02;

public class SavingsAccount extends BankAccount {

	private double interestRate;
	
	public SavingsAccount(int a, double interestRate) { //빨간줄  부모클래스 없어서
		super(a); //<< 기본생성자가 없어서 ()안에 a를 넣어야함
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int a) {
		this.balance = (int)((this.balance * this.interestRate * a) + this.balance);
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return "저축예금";
	}
	
}
