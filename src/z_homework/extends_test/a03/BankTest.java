package z_homework.extends_test.a03;

public class BankTest {

	public static void main(String[] args) {

	        Bank bank = new Bank();

	        Customer customer1 = new Customer("Tony", "Stark");
	        customer1.setAccount(new BankAccount(100_000));
	        bank.addCustomer(customer1);

	        Customer customer2 = new Customer("Peter", "Parker");
	        customer2.setAccount(new BankAccount(100));
	        bank.addCustomer(customer2);

	        Customer customer3 = new Customer("Thor", "Odinson");
	        customer3.setAccount(new BankAccount(30_000));
	        bank.addCustomer(customer3);

	        int max = Integer.MIN_VALUE; // 배열에서 금액비교하려고 돈을 가진 크기를
	        int min = Integer.MAX_VALUE;
	        Customer maxBalanceCustomer = null;
	        Customer minBalanceCustomer = null;
	        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
	            Customer account = bank.getCustomer(i);
	            if (account.getAccount().getBalance() > max) { // account.getAccount().getBalance() 나의. 계좌에. 들어온 돈
	                max = account.getAccount().getBalance();
	                maxBalanceCustomer = account;
	            }
	            if (account.getAccount().getBalance() < min) {
	                min = account.getAccount().getBalance();
	                minBalanceCustomer = account;
	            }
	        }
	        System.out.println("잔고가 가장 많은 사람");
	        System.out.println(maxBalanceCustomer);
	        System.out.println("잔고가 가장 적은 사람");
	        System.out.println(minBalanceCustomer);
	        if (maxBalanceCustomer.getAccount().transfer(max / 2, minBalanceCustomer.getAccount())) {
	            System.out.println(maxBalanceCustomer.getFirstName() + "가 " + minBalanceCustomer.getFirstName() + "에게 잔고의 반을 송금");
	        } else {
	            System.out.println("송금되지 않았습니다.");
	        }
	        System.out.println("송금 후 모든 고객의 정보");
	        for (Customer c : bank.getCustomers()) {
	            if (c != null) {
	                System.out.println(c);
	            }
	        }
	    }
	}