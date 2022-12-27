package e_oop;

import e_oop.student.StudentAccess;

public class AccessModifier {


		public String publicVar = "public : 접근제한이 없음";
		protected String protectedVar =
				"protected : 같은 패키지 + 상속받은 클래스에서 접근 가능";
		String defaultVar = "default: 같은 패키지 내에서 접근 가능";
		private String privateVar = "private : 클래스 내에서만 접근가능";
		//public  > protected > default > private
		
		public void publicMethod() {
			System.out.println(publicVar);
		}
		
		protected void protectedMethod() {
			System.out.println(protectedVar);
		}
		void defaultMethod() {
			System.out.println(defaultVar);
		}
		private void privateMethod() {
			System.out.println(privateVar);
		}
		
		public static void main(String[] args) {
			AccessModifier am = new AccessModifier();
			
			System.out.println(am.publicVar);
			am.publicMethod();
			
			System.out.println(am.protectedVar);
			am.protectedMethod();
			
			System.out.println(am.defaultVar);
			am.defaultMethod();
			
			System.out.println(am.privateVar);
			am.privateMethod();
			
		/*
		 * 접근제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 불힐요한 메소드(멤버)를 감추기 위해
		 * */
		
			
		StudentAccess sa1 = new StudentAccess();
		//같은 패키지 아니라 임포트 해야하ㅣㅁ
		sa1.setKor(90); //내가 90으로 설정? 메소드에 파라미터를 넣었다?
		
		System.out.println(sa1.getKor());
		sa1.setName("홍길동");
		System.out.println(sa1.getName());
		
		
		}

}

























