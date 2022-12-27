package b_operator;

public class B_ComparingOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 비교연산자 
		 * - > , < , >= , <= , == , !=
		 * - 문자열 비교 : equals()
		 * */ // !는 같지않다.
		
		// 비교연산자의 연산 결과는 boolean 이다.
		boolean b = 10 < 20;
		System.out.println("10 < 20 : " + b);
		b = 10 <= (20 - 15);
		System.out.println("10 <= (20 - 15)" + b);
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2;
		//문자열의 내용이 아닌 주소를 비교함
		System.out.println(b);
		
		//참조형 타입 String  //특징이 new 
		String s1 = "java"; // j,a,v,a 가 따라 노는데 주소들을 모아 놓은게 s1
		String s2 = "java"; // j,a,v,a 의 주소가 서로 같다는 의미 s1 = s2 메모리의 주소가 같다
		// 1==1 이런 비슷??
		System.out.println(s1 == s2);
		String s3 = new String("java");//새로운 주소에 저장할래 
		System.out.println(s1 == s3); // s1 s3의 주소가 다름 그래서  
		System.out.println(s1.equals(s3));// 스캐너 랜덤 스트링 참조형 타입은 이퀄스 사용 비교 가능
		
		System.out.println(true);
		System.out.println(!true);//이것의 결과가 참 거짓일때 붙이면 반대로 결과도출
		System.out.println(!(1 == 1));
		
		
		
	
		
		
		
		
		
	}

}
