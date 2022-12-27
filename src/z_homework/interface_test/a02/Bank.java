package z_homework.interface_test.a02;

public class Bank {
	private Customer[] customers; // 은행의 고객목록
	private int numberOfCustomers; // 은행의 고객수

	Bank() { //생성자에는 void를 쓰면 안돼...
		customers = new Customer[10];
	}

	public void addCustomer(Customer c) {
		//방법1
//		for (int i = 0; i < customers.length; i++) {
//			if (customers[i] == null) { // 배열의 첫번째에 넣는다
//				customers[i] = c;
//				break;
//			}
//		}
//		this.numberOfCustomers++;
		
		//방법2
		customers[numberOfCustomers++] = c; //[numberOfCustomers++] ++순서주의 ++가 앞이면 1번째에 / 뒤면 0번째 드가고 그담 1+
//		numberOfCustomers++
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int i) {
		return customers[i];
	}
}
