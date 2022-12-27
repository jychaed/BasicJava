package z_homework;

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distance = 40e12;
		double time = distance / 300000;
		time = time / 60;
		time = time / 60;
		time = time / 24;
		time = time / 365;
		
		System.out.println("빛의 속도로 프록시마 센타우리" + "별까지가는데 걸리는 시간은 " + time + "광년이다.");
		
		
//		System.out.println("빛의 속도로 프록시마 센타우리" + "별까지 가는데 걸리는 시간은" 
//		+ time + "광년 이다."));
////		
		
//		double distance = 40e12;
//		double speed = 300000;
//		double yearspeed = speed*60*60*24*365;
//		
//		double time = (distance/yearspeed);
		
//		System.out.println("빛의 속도로 프록시마 센타우리" +  "별까지 가는데 걸리는 시간은" + time + "광년 이다."));
	}

}
