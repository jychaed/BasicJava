package h_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapClass { // 크기는 있는데 순서대로 가져올수 없음/인덱스 x?
	
	/*
	 * Map : key => value // 특정주소(key)로 가면 얘(value)가 산다
	 * 
	 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
	 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
	 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
	 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
	 * 
	 * */
	
	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>();
		//String 보통 이걸 많이 쓰고 이름! 컬럼
		//Map이 더 크니까 HashMap 을 담을 수 있다고...?
		//<String, Object> 제네릭이 2개가 들어감 키와 짝을 지어줘야하니까
		
		map.put("b", "홍길동");
		map.put("a", 10);
		map.put("c", new Date());
		System.out.println(map); //{a=10, b=홍길동, c=Wed Aug 03 14:15:41 KST 2022}
		// [] : 배열이나 List : 순서가 있음
		// {} : Map : 순서가 없음
		
		map.put("b", "이순신"); // 값을 덮어쓴다.
		System.out.println(map);//{a=10, b=이순신, c=Wed Aug 03 14:18:40 KST 2022}
		// 한장소에 2명은 없어요
		
		// "c", new Date() 이런게 요소?
		
		map.remove("a");
		System.out.println(map);//{b=이순신, c=Wed Aug 03 14:19:52 KST 2022}
		
		Object value = map.get("b");
		System.out.println(value); //이순신
		
		//일반적인 for문으로 반복할 수 없다.
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i)); //null
		}
		
		// Set
		// 1. 중복없음, 2. 순서없음 // 맵이 가진 키를 가져와서 목록으로 만듦 =keySet
		Set<String> keySet = map.keySet(); // map에 목차를 만들어줌
		// List-Set-Map 이런 느낌
		// b와 c를 Set으로 만들어줘요 목록화 목차를 만듦
		
		for(String key1 : keySet) { //그 목차에서 하나씩 꺼내는 걸 실행해서
			System.out.println(key1 + " : " + map.get(key1));
		} //for(String key1 : keySet) < 여기서 key1은 그냥 변수이름임
		
		/// ctrl + shift + x 는 대문자// ctrl + shift + y는 소문자
		
		
		// 회원테이블
		Map<String, String> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "1234");
		user.put("name", "홍길동");
		user.put("phone", "010-0000-0000");
		Set<String> keys = user.keySet(); 
		
		for(String key : keys) { 
			System.out.println(key + " : " + user.get(key));
		} 
		
		// 회원 1명의 데이터가 담긴 HashMap을 하나더 만들어주세요.
		Map<String, String> user1 = new HashMap<>();
		user1.put("id", "jychae");
		user1.put("password", "1234");
		user1.put("name", "채진영");
		user1.put("phone", "010-5617-1102");

		// 유저 목록을 만들고 싶다.
		List<Map<String, String>> userList = new ArrayList<>();
		userList.add(user);
		userList.add(user1);
		userList.add(user1);
		userList.add(user1);
		userList.add(user1);
		System.out.println(userList);
		userList.get(0).get("name"); //==> 홍길동
		
		//실제 DB연동시 사용방법
		//List<Map<String, String>>.get(index).get(key)
		
		
		
		System.out.println("");		
		
		
		Map<String, List<Map<String, String>>> classMap = new HashMap<>();
		classMap.put("404", userList);
		System.out.println(classMap);
	}

}


















