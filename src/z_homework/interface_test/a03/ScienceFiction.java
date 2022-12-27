package z_homework.interface_test.a03;

public class ScienceFiction extends Book {

	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	@Override // 이건 사실 임플리먼트다 !!!!!!!
	public int getLateFee(int a) {
		return a * 600;
	}

}
