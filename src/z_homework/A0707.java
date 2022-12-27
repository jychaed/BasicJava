package z_homework;

import java.util.Scanner;

public class A0707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력된 정수가 홍수인지 짝수인자를 출력하는 프로그램을 
		// if문으로 작성해보자.
		
		// 입력된 정수 < 정수가 필요하겠구나
//		int num; //정수를 담은 정수
//		Scanner sc = new Scanner(System.in); // 입력된 이니까
//		// 한번에 임포트하기 ctrl + shift + o
//		System.out.println("정수를 입력해주세요. >>"); //내가 숫자를 입력해줘야하니까 필요해
//		num = Integer.parseInt(sc.nextLine());  // 내가 스캔한 숫자가 문자니까 숫자로 읽어와야해
//		if(num % 2 == 0 ) { //나누기 2가 0이냐?
//			System.out.println("입력하신 숫자는 짝수입니다.");
//		}else {
//			System.out.println("입력하신 숫자는 홀수입니다.");
//		}

		
		
		
		

		/*
		 * 두 정수를 입력받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 만들어 보자. 
		 * 임의의 두 정수는 어떤 수를 0으로 나누는 것은 수학적으로 
		 * 성립하지 않으므로 0을 입력하지 않는다고 가정하고 프로그램을 작성 하자 */
		
//		int num1, num2; //두 정수 나오자마자 해야해 //현재 변수를 정하긴했는데 존재하지 않아요 초기화를 안했어
//		Scanner scanner = new Scanner(System.in); //입력받아 어떻게 시스템한테
//		
//		System.out.println("정수를 입력해주세요. (1) >>");
//		num1 = Integer.parseInt(scanner.nextLine());
//		
//		System.out.println("정수를 입력해주세요. (2) >>");
//		num2 = Integer.parseInt(scanner.nextLine());//숫자입력 받아요
//		
//		int num3 = 0 , num4 = 0; //몫과 나머지를 변수로 설정 선언과 초기화를 하는 연습하기
//		
//		// 큰수와 작은수를 비교하는 if문을 만들어요
//		if(num1 > num2) {
//			System.out.println(num1 +"을" + num2 + "로");
//			num3 = num1 / num2;
//			num4 = num1 % num2;
//			
//		}else if(num2 > num1) {
//			System.out.println(num2 +"을" + num1 + "로");			
//			num3 = num2 / num1;
//			num4 = num2 % num1;
//			
//		}else {
//			System.out.println("같은 두 수를");
//			num3 = 1;
//			num4 = 0;
//			
//		}
//		System.out.println("나눈 몫은" + num3 + "이며, 나머지는 " + num4 + "입니다." ); 
//		// if문 밖에서는 num1,2 누가큰지 몰라서 변수 지정해준거
		
		
		
		
		
		
		
		
		
		
		// 메트로폴리스(거대도시)는 다음과 같은 2가지 조건 중 하나를 만족하여야 한다고 가정한다. 
		// 어떤 도시가 메트로폴리스인지를 알아보는 프로그램을 작성하여 보자.
		// 1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다. 
		// 2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다.		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("수도 입니까?(수도:1, 수도아님:0)"); int tneh = sc.nextInt();
		 * 
		 * System.out.print("총 인구는? (단위:만) "); int dlsrn = sc.nextInt();
		 * 
		 * System.out.print("연소득이 1억 이상인 인구는? (단위:만)"); int dusthemr = sc.nextInt();
		 * 
		 * System.out.print ((tneh == 1 && dlsrn >= 100) || (dusthemr >= 50) ?
		 * "이 도시는 메트로폴리스 입니다" : "이 도시는 메트로폴리스가 아닙니다");
		 */
		
//		int num1 = 0 , num2 = 0 , num3 = 0 ;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("수도 입니까?(수도:1, 수도아님:0)"); 
//		num1 = Integer.parseInt(sc.nextLine());
//				
//		System.out.print("총 인구는? (단위:만) "); 
//		num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("연소득이 1억 이상인 인구는? (단위:만)"); 
//		num3 = Integer.parseInt(sc.nextLine());
//		
//		if (num1 == 1 && num2 > 100 || num3 > 50 ) {
//			System.out.println("이도시는 메트로폴리스 입니다.");
////		}else if(num3 > 50) {
////			System.out.println("그냥 도시.")
//		}else {
//			
//		}
// 		

		
		
		// 입력 연도가 윤년인지 아닌지 확인하는 프로그램을 작성해보자. 윤년의 조건은 다음과 같다고 가정한다.
		//윤년은 4의 배수이어야 하고, 100의 배수는 아니어야 한다. 또한 400의 배수는 무조건 윤년이 된다.
		int year = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도를 입력하세요");
		year = Integer.parseInt(scanner.nextLine());
		boolean flag = false;
		// 조건 2개를 무조건 충족해야하니 &&으로 연결해주고 또는이니 ||으로 처리
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			flag = true;
		}
		System.out.println(flag ? "윤년입니다." : "평년입니다.");
		
		
		
		
	}

}
