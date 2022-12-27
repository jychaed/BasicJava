package z_homework.interface_test.a02;

public class CheckingAccount extends BankAccount {

	private SavingsAccount protectedBy;
	
	public CheckingAccount(int a) {
		super(a);
	}
	
	public CheckingAccount(int a, SavingsAccount sa) {
		super(a);
		this.protectedBy = sa;
	}
	
	@Override
	public boolean withdraw(int a) {
		if(this.balance < a) { // 내가 가진돈보다 빼려는게 크다면
			if(a > protectedBy.balance + this.balance){//인출돈에서 내꺼 빼고 ??
				System.out.println("잔액이부족합니다.");
				return false;
			}else {// 인출하려는 금액(a)  <= SA잔액(protectedBy.balance) +현재잔액(this.balance)
				a -= this.balance; // 빠지려는 금액이 잔액에서 우선 빠지고
				this.balance = 0;// 주계좌의 잔액은 0
				protectedBy.balance -= a; // 나머지는 SA잔액에서 빼주자!
				return true;
			}
		}else { //인출하려는 금액 <= 현재잔액
			this.balance -= a;
			return true;
		}
		
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return "당좌예금";
	}
	
}
