package z_homework.jh0730;

public class TestB extends TestA {
	int b = 10;
	int bb;
	public TestB() {
		//super(); //  부모클래스에서 가져올까디
		this.b =20; // 내 클래스에서 내가 바꿔서 쓸꺼다 초기화
	}

	public TestB(int a, int bb) {
		super(a); // 내 부모클래스의 생성자 TestA(int a) 를 쓰겠다 
		this.bb =bb;
	}

	// override methodA()  BA
	@Override
	public void methodA() {
		System.out.println("BA");
	}
 
	// methodB()
	public void methodB() {
		System.out.println("B");
	}
	
}



//  클래스 3개 
// 동물 , 호랑이 , 출력 
// 동물은 이름 , 나이, 걷는다는 메서드 , 울부짖는 메서드 , 
// 호랑이  사냥 메서드 