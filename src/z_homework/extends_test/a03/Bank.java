package z_homework.extends_test.a03;

public class Bank {
	private Customer[] customers; // 은행의 고객목록
	private int numberOfCustomers;  // 은행의 고객 수
		
	public Bank() {
		customers = new Customer[10]; // 10개 지정된 배열이 생성됨 / 아직 null값임..
	}
	
//	public void addCustomer(Customer c) { // 메인에서 고객 클래스로 만든 인스턴스를 가져옴 
//		customers[numberOfCustomers] = c; // 고객만 받을수 있는 배열
//		numberOfCustomers++; // 배열에 인덱스 번호를 알려주는 값
//	}
	
	public void addCustomer(Customer c) { // 메인에서 고객 클래스로 만든 인스턴스를 가져옴 
		for(int i = 0; i < customers.length; i++) {
			if(customers[i] == null) {
				customers[i] = c;
				break;
			}
		}
		this.numberOfCustomers++;
	}
	
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
//	public Customer getCustomer(int index) {// 여기서 눈치 챌 수 있죠 특정한 위치에 있는 걸 받을꺼같으니가 int i로 놓기
//		return customers[index]; //customers[i]; i번째 배열이라고 있음 
//	}
	public Customer getCustomer(int i) {// 여기서 눈치 챌 수 있죠 특정한 위치에 있는 걸 받을꺼같으니가 int i로 놓기
		return customers[i]; //customers[i]; i번째 배열이라고 있음 
	}
	
//	public void setNumberOfCustomers(int numberOfCustomers) {
//		this.numberOfCustomers = numberOfCustomers;
//	}
	
	
}
