package a_variable;

import java.util.Scanner;

/*클래스블록*/
public class A_Variable {
	/* 메소드블록 */
	public static void main(String[] args) {
	
	//클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
	
	//주석: 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데에 사용한다.)

//	한줄 주석 : Ctrl + Shift c
//	한줄 주석
//	한줄 주석
//	한줄 주석

//	범위 주석 : Ctrl + Shift + / (해제 : \()*/
	/*범위주석
	 * 범위주석
	 * 범위주석
	 * 범위주석*/
	/*데이터의 종류
	 * - 정수 : 10, -10, 8657, -167487
	 * - 실수 : 3.14,-1.8
	 * - 문자 : 'a', '3','가'
	 * - 논리 : true, false
	 * 
	 * 프로그래밍 언어의 기준으로 데이터의 종류를 나눠 놓은 것 : 자료형 (data type)
	 * 
	 * 기본형 타입 (괄호 안에는 자료형의 크기 byte)
	 * - 정수 : byte(1), short(2), int(4), long(8)
	 * - 실수 : float(4), double(8)
	 * - 문자 : char(2)
	 * - 논리 : boolean(1)
	 * 
	 * 변수를 만들 때 타입을 사용한다.
	 * 데이터를 다룰 때 일반적으로 변수라는 그릇에 담아서 사용한다*/
	
	// 변수 : 하나의 데이터를 담을 수 있는 그릇(자바는 선언형 언어라서 미리사용시 무조건 선언하고 시작)
	int age; // 변수 선언 : 변수를 만드는 곳
	double pi; // 한 블럭 안에서 변수의 이름은 중복될 수 없다.
//	float pi;
//	double pi;
	// 다른 블럭 안에서는 같은 이름을 사용할 수 있다.
//	int 국어, 영어, 수학;
	int kor, eng, math;
	//변수는 무조건 소문자 예외는 변수에 한에서 없어요
	int scoreAvg; // 낙타표기법 < 이걸 많이 사용합니다
	
	int score_total; // 뱀표기법
	
	// = (대입연산자) : 오른쪽의 값을 왼쪽 변수에 저장
	age = 20; //초기화 : 변수에 처음으로 값을 입력함 //;은 내가 작성하는 문장의 한줄이 끝났다는 의미
//	age = "20"; //변수의 타입에 맞는 값을 저장해야한다.
	
	int abc = 10; //보통 선언과 동시에 초기화를 한다.
	long l = 40L; //접미사 L을 붙여야  long 타입이 된다.
	float f = 5.5f; //접미사 f를 붙여야 float 타입이 된다.
	char c = '한'; // 단따옴표 안에 한 글자만 넣어야한다.i
	boolean b = true; // true, false
	
	// 8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
	
	byte _byte = 10;
	short _chort = 20;
	int _int = 30;
	long _long = 40L;
	float _float = 3.14f;
	double _double = 3.14;
	char _char = 'A';// 한글자라는 걸 알려주기위해 단따옴표를 사용해서 선언한다 'a' 'A'
	boolean _boolean = true;
	int vA = 0, vB = 1, vC = 2;//여러 변수를 한번에 선언하고 초기화함 
	
	System.out.println(_char);
	
	String var1 = "A"; //문자열을 ""안에 담는다
	
	// 형변환
	int small = 10;
	long big = 10L;
	// small = big; //큰 그릇에 있는 숫자를 담을 수 없어요 big안에는 그걸 걱정하는 
	small = (int)big;
	big = small; // 표현범위가 작은 쪽에서 큰 쪽으로 형변환은 생략이 가능하다
	
	/* 명명규칙 
	 *  - 영문자 대소문자, 한글, 숫자, 특수문자(_ , $)를 사용할 수 있다.
	 *  - 숫자로 시작할 수 없다.(int v123;)
	 *  - 예약어는 사용할 수 없다. (int double; X) (int vInt;)
	 *  */
	
	/* 상수
	 * - 처음 담긴 값을 변경할 수 없는 그릇
	 * - 리터럴에 의미를 부여하기 위해 사용한다
	 *  */
	final int MAX_NUMBER; //변수명은 소문자, 상수명은 대문자로 사용(값이 변하지않음)
	MAX_NUMBER = 10;
//	MAX_NUMBER = 20; //컴파일 에러 발생
	
	// 출력
	System.out.print("'줄바꿈'을 하지 않는다.\n"); 
	System.out.print("\"줄바꿈\"을 하지 \\않는다.");
	System.out.println("줄바꿈을\t\t한다.");
	System.out.print("나이:" + age); // "나이:" 문자열 age 는 숫자지만 합쳐지면 문자열
	System.out.print("나이는" + age + "입니다.");
	System.out.println(age);
	System.out.printf("나이는 %d 입니다. \t _char: %s", age, _char); //출력 포멧을 지정한다.
	System.out.printf("나이는 %08d 입니다. \t _char: %s", age, _char);
	
	System.out.println();
	System.out.println(5 + 4 + "문자"); // 앞에 더해지고 문자로 결합이고
	System.out.println("문자" + 5 + 4); // 문자에 각각 문자문자문자
	
	//입력
//	Scanner sc = new Scanner(System.in);  //ctrl+space 하면 위에 import java.util.Scanner; 생겨남 이게 생기면 스캐너를 사용가능
////	System.out.print("아무거나 입력해주세요>>"); /ln없으니 줄바꿈이 없죠
//	String str = sc.nextLine(); //선언과 동시에 초기화 //입력 받겠다...!
//	System.out.println(str);
	//입력을 받게되면 사용자가 입력할 때 프로그램이 멈추게 된다.
	//내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.
	
//	
//	int nextInt = sc. nextInt();
//	double nextDouble = sc.nextDouble();
//	//이런 것 들이 있지만 버그로 인해 사용하지 않는다.
	//예를 들면 숫차가 아니고 문자다 하면 
	
//	System.out.print("int 입력>>");
//	String input = sc.nextLine();
//	int iInput = Integer.parseInt(input); //뒤에 있는 Int를 변환해준다!
//	
	
	// 자신의 이름과 나이를 입력받아 변수를 선언 및
	// 초기화하고 출력하시오.
	// 출력 예: 이름: 홍길동, 나이 : 20세
	
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("이름을 입력해 주세요>>");
//	String name = sc.nextLine();
//	System.out.print("나이를 입력해 주세요>>");
//	String age2 = sc.nextLine();
//	System.out.println("이름 :"+ name + ",나이 :" + age2 + "세");
//	
	
	
	
	
	
	
	// 자신의 이름과 나이를 입력받아 변수를 선업 및 초기화하고 출력하세요
	// 출력 예 : 이름: 홍길동 : 현재나이 :20세, 내년나이 : 21세
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("이름을 입력해 주세요>>");
//	String name = sc.nextLine();
//	System.out.print("나이를 입력해 주세요>>");
//	String age2 = sc.nextLine();
//	
////	int myAge = Integer.parseInt(age2);
////	int nextYear = myAge + 1;
//	
//	System.out.println("이름 :" + name + ", 현재나이 :" + age2 + "세" + ",내년나이 :" +nextYear + "세");
	
	Scanner sc = new Scanner(System.in);
	System.out.print("이름을 입력해 주세요>>");
	String myName = sc.nextLine();
	System.out.print("나이를 입력해 주세요>>");
	String myAge = sc.nextLine();
	int nextAge = Integer.parseInt(myAge) + 1 ;
	System.out.printf("이름 : %s, 나이 :%s, 내년나이 : %d", myName, myAge, nextAge);
	
	

	
	
	
	}	
}


