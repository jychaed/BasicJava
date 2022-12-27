package e_oop2;

public class SampleChild extends SampleParent { //샘플자식은 샘플부모를 상속받았다.// 

	String var2; // 자식클래스는 부모클래스의 String var; 도 가지고 있음 
	
	public void childMethod() {
		// 상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); //부모의 변스
		System.out.println(method(1, 2));
		
	}
	
	// 오버라이딩(Override) : 상속받은 메서드의 내용을 재정의 하는 것
	@Override //어노테이션 :  클래스, 변수, 메서드 등에 표시해 놓는 것
	public int method(int a, int b) { // 파라미터()의 갯수와 종류가 동일해야 사용가능
		// 재정의 하기 위해서는 리턴타입 및 파라미터의 갯수와 종류가 동이랳야함
		// 컨트롤을 누를 상태에서 메서드를 누르면 원본으로 가진다! 오 신기
		return 0;
	}
	
	int var;
	
	public void testmethod(double var) {
		System.out.println(var); // 지역변수 (파라미터)
		System.out.println(this.var); // 자식클래스의 전역변수
		System.out.println(super.var); // 부모클래스의 전역변수
		// super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용함
		System.out.println(this.method(1, 2));
		System.out.println(super.method(1, 2));
	}
	
	SampleChild(){
		super(); //부모클래스의 생성자 호출
		// super()를 통해 클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
		// super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
		System.out.println("자식 클래스 생성!");
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		sc.method(1, 1);
		
		// 다형성
		// 부모타입의 변수로 자식타입의 객체를 사용하는 것
		
//		SampleParent sp = new SampleChild();
		// 부모가 가진 기능 sp.< 하면 자식이 가진거 보다 작음
		// 작은 쪽이 큰거에 담길 수 있음
		// 부모한테는 자식을 줄 수 있는데 자식한테는 부모를 줄 수 없음
		SampleParent sp = (SampleParent)(new SampleChild());
		// 자식타입->부모타입으로 형변환은 생략할 수 있다.
		
//		sc = new SampleParent(); // 자식>부모 라서 담을 수 없음
		sc = (SampleChild)(new SampleParent()); // (SampleChild) 붙여서 형변환
		// 부모타입->자식타입으로 형변환은 문제를 발생시킬 수 있기 때문에
		// 필수로 표기해서 사용해야한다.
		// 너 분명 오류 날껀데 우선 써준다 계약서 쓰듯 서명해
		
		SampleParent sp1 = (SampleParent) new Object();
		// 컬렉션 프레임워크??? 배열의 길이를 정하니까 길이 조절 안되니 불편해
		// 그리고 나는 인덱스를 모르겠어 넣긴했는데 모르겠어
		// 원래 for문 돌리지?
		// 기존 에는 몇번째인지 확인하고 가져왔는데
		// 맵이라는게 있어요....?
//		Map<String, Object>m = new HashMap<String, Object>();
		//Object 하나꺼내면 형태를 몰라요 이건 Object 형태입니다.
		// 이걸 강제로 형변환 해서 사용합니다.
		// 이거 하면 배열을 늘렸다 줄였다가 가능합니다.
	}

}









