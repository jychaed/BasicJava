package z_homework.interface_test.a030729;

public class Poet extends Book {

	
	public Poet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Poet(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLateFee(int lateDays) {
		// TODO Auto-generated method stub
		return lateDays*200;
	}

}
