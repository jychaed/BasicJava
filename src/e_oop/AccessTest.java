package e_oop;

public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
//		System.out.println(am.privateVar);
//		am.privateMethod();
	}

}
