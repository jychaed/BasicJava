package z_homework.interface_test.a030729;

public class Novel extends Book {

	public Novel(String title, String author) {   // 각 서브 클래스의 생성자는 super 키워드를 이용해 간접적으로 초기화를 진행한다.  
		super(title, author); // 왜 super가 붙는지 부터 이해를 하자..진영아 제발
		//Novel calss 는 Book이라는 조상을 받고 있는 자손이지?
		// 나는 지금 Bookr의 필드에 선언한 변수를 자손에서 쓰고싶어
		// Book에서 생성자를 만들었지? 그거 상속받아서 쓸거야!!
		// 조상에서 쓴 변수를 자손인 내가 쓰려면 super가 필요해!
		
	}
	

	@Override
	public int getLateFee(int lateDays) {
		// TODO Auto-generated method stub
		return lateDays*300;
	}

}
