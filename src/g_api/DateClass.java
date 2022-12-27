package g_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import e_oop.Calculator;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		// date 객체를 보기편한 문자열로 변환 // 표현방법 무조건 기억하세요! 검색 고고
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today)); //MM은 분하고 헷갈리지 말라고!
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS");
		System.out.println(sdf2.format(today)); // HH24시간 hh12시간 //SSS 초 보다 작은 숫자
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf3.format(today));  //yy만하면 년도만! M하나면 숫자 1개만 월!
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd(w) HH:mm:ss a");
		System.out.println(sdf4.format(today));  
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss a");
		System.out.println(sdf5.format(today));  
		
		// Oracle : 2005/01/08
		// MySql : 2005-01-08
		
		// 문자열 -> 날짜 객체로 변환
		String str = "2000년 08월 01일";
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf6.parse(str);
			System.out.println(dateStr);
		} catch (ParseException e) { //변환에 예외가 발생할 수 있으니 처리해라!
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance(); //싱글톤 패턴
		// 캘린더 객체는 스태틱이라서 하나만 만들수 밖에 없어요!
		
		cal.setTime(today);
		System.out.println(cal.getTime());
		cal.set(2020, 6, 19);
		System.out.println(cal.getTime());
		
		// 날짜계산
		cal.add(Calendar.YEAR, 1);
		System.out.println(cal.getTime()); // 지정한 날짜에 1년을 더하겠다!
		System.out.println(sdf3.format(cal.getTime())); 
		cal.add(Calendar.MONTH, 2); //월
		cal.add(Calendar.DAY_OF_MONTH, -20); // 일
		cal.add(Calendar.HOUR, 4); // 시간
		cal.add(Calendar.MINUTE, 40); // 분
		cal.add(Calendar.SECOND, 400); // 초
		
		
		
	}

}
















