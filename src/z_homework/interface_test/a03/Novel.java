package z_homework.interface_test.a03;

public class Novel extends Book {

	public Novel(String title, String author) {
		super(title, author); // 슈퍼로 간접적 초기화를 합니다.
	}

	@Override // 이건 사실 임플리먼트다 !!!!!!!
	public int getLateFee(int a) {
		return a * 300;
	}

}
