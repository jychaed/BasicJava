
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println(5%4);
		
		
		
		
		
		
		
		
		
		
		//20220702 연습
		
		
//		한줄 주석 :Ctrl + Shift + / (gowwp : \()*/
		/* 범위주석
		 * 범위주석
		 * 범위주석 */
		/* 데이터의 종류
		 * - 정수 : 10, -10, 8657, -167887
		 * - 실수 : 3.14, -1.8
		 * - 문자 : 'a', '3', '가'
		 * - 논리 : true, false
		 * 
		 *  프로그래밍 언어의 기준으로 데이터의 종류를 나워 놓은 것 : 자료형 (data type)
		 *  
		 *  기본형 타입 (괄호안에는 자료형의 크리 byte)
		 *  - 정수 : byte(1), short(2), int(4), long(8)
		 *  - 실수 : float(4), double(8)
		 *  - 문자 : char(2)
		 *  - 논리 : boolean(1)
		 *  
		 *  변수를 만들 때 타입을 사용한다
		 *  데이터를 다룰 때 일반적으로 변수라는 그릇에 담아서 사용한다*/
		
//		변수 : 하나의 데이터를 담을 수 있는 그릇( 자바는 선언형 언어라서 미리 사용시 무조석 선언하고 시작)
		int age; //변수선언 : 변수를 만드는 곳
		double pi; // 한 블럭안에서 변수의 이름은 중복 수 없다.
//		float pi;
//		doble pi;
		// 다른 블럭 안에서는 같은 이름을 사용할 수 있다.
		//int 국어, 영어, 수학;
		int kor, eng, math;
		//변수는 무조건 소문자 예외는 없음(변수에 한함)
		int scoreAvg; // 낙타표기법
		
		int score_total; // 뱀표기법
		
		age = 20; // 초기화 : 변수에 처음으로 값을 입력함
		// = (대입연산자) : 오른쪽의 갑을 왼쪽 변수에 저장
		
		int abc = 10; // 보통 선언과 동시에 초기화를 한다.
		long l = 40L; // 접미사 L을 붙여야 long 타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float 타입이 된다.
		char c = '한'; // 단따옴표 안에 한 글자만 넣어야한다.
		boolean v= true; // ture, false
		
		// 8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		
		byte _byte = 1;
		short _short = 2;
		int _int = 3;
		long _long = 5L;
		float _float = 3.14f;
		double _double = -1.4;
		char _char = '뿅';
		boolean _boolean = true;

		System.out.println(_char);

		String var1 = "A"; // 문자열을 ""안에 담는다
				
		// 형변환
		int small = 10;
		long big = 10L;
		// small= big; // 큰 그릇에 있는 숫자를 담을 수 없어요 big안에는 그걸 걱정하는
		small = (int)big;
		big = small; // 표현범위가 작은 쪽에서 큰 쪽으로 형변환은 생략이 가능하다.
		/* 명명규칙 
		 * - 영문자 , 대소문자, 한글, 숫자 특수문자(_ , &)를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.( int v123;)
		 * - 예약어는 사용할 수 없다. (int double; X) (int vINT;)
		 * */
		
		/* 상수
		 * 처음 담긴 값을 변경할 수 없는 그릇
		 * 리터럴에 의미를 부여하기 위해 사용한다.
		 *  */
		final int MAX_NUMBER; // 벼수명은 소문자, 상수명은 대문자로 사용 값변하지않음
		MAX_NUMBER = 10;
//		MAX_NUMBER = 20; //컴파일 에러 발생
		
		// 출력
		System.out.println("'줄바꿈'을 하지 않는다.\n ");
		System.out.println("\"줄바꿈\"을 하지\\않는다.");
		System.out.println("줄바꿈을\t\t한다");
		
		System.out.println("나이:" + age); //"나이:" 문자열 age는 숫자지만 합쳐지면 문자열
	    System.out.println("나이는" + age + "입니다.");
	    System.out.println(age);
	    System.out.printf("나이는 %d 입니다. \t _char: %s", age, _char);
	    System.out.println();
	    System.out.printf("나이는 %010d 입니다. \t _char : %s", age, _char);
	    System.out.println();
	    System.out.println(5 + 4 + "글짜"); // 앞에 더해지고 문자로 결합이고
	    System.out.println(5+4+"글짜"+10+1+2+3); // 무자에 각각 문자 문자 문자
		
		
		

		
		
		
		
		
		
	
		
	}

}
