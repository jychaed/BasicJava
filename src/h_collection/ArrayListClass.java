package h_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListClass {//0802

	/*// 지겹도록 쓰게 될 것
	 * 
	 * boolean add(Object o) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
	 * void add(int i, Object o) : 지정된 위치에 객체를 추가한다.
	 * Object set(int i, Object o) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
	 * Object get(int i) : 지정된 위치의 객체를 반환한다.
	 * int size() : 저장된 객체의 수를 반환한다.
	 * boolean remove(int i) : 지정된 위치의 객체를 제거한다. 
	 * 
	 * */
	
	public static void main(String[] args) {
		List list = new ArrayList(); 
//		List<Object> list = new ArrayList<>(); 위랑 같은 말인데 생략됨 
		// ArrayList()(클래스)이게 기능이 많아서 List(인터페이스)를 담음
		// List : a(), b()
		// ArrayList : a(), b(), c() - 구현체니 List 포함
//		 ArrayList list = new List();
//		 list.c();
		// 기능이 작은 애로 만드는건 되긴 됨
 		
		list.add("abc");
		list.add(100);
		list.add(new Scanner(System.in)); 
		
		
		// 노란줄 제너릭을 정해주지않으면 무슨 형태인지 모를껄?
		// 제네릭을 지정하지 않으면 넣을 때는 편하나 꺼낼때 타입을 예측하기 어렵다
		// 따라서 제네릭의 사용이 권장된다.
		
		List<Integer> list2 = new ArrayList<Integer>(); 
		list2.add(10);
//		list2.add("abc"); //이건 안된다는 거지 위에 인티져로 받겠다 했으니
		System.out.println(list2.add(20)); //20이 인티저값이 잘들어갓다 true
		System.out.println(list2.add(20)); //20이 인티저값이 잘들어갓다 true
		System.out.println(list2);
		
		list2.add(1, 40); // 1번 인덱스부터 뒤로 밀고 값을 저장한다.
		System.out.println(list2);
		
//		list2.add(7, 50); // 순서대로만 저장할 수 있다.
		
		int before = list2.set(2, 50); // 2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		// list2 문자열인데 자동 언박싱 되어서  int형식으로 before에 저장
		System.out.println("before : " + before);
		System.out.println("after : " + list2.get(2)); // 배열 : list2[2]
		
		
		// 값을 제거할 때는 반드시 뒤에서부터 제거해야 한다.
		System.out.println(list2);
//		for(int i = 0; i < list2.size(); i++){
//			System.out.println(i + " : " + list2.get(i));
//			list2.remove(i); // 사이즈를 정해놓고 줄어드는게 아니라서!
//			// 거꾸로 for 문
//		}
		for(int i = list2.size()-1; i >= 0; i--) {
			System.out.println(i + " : " + list2.get(i));
			list2.remove(i);
		}
		
		
		// 예제 list3에 1부터 100까지 랜덤값을 10개 저장해주세요.
//		List<Integer> list3 = new ArrayList<Integer>(); //ArrayList 객체
//		Random rnd = new Random();
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		list3.add(rnd.nextInt(100) + 1);
//		System.out.println(list3);
		
//		위에 내가 푼거는 노가다인데 이걸 for문 해야겠지.. 어떻게 하냐고 ㅠ
		
		List<Integer> list3 = new ArrayList<>(); //<Integer> 앞에 이거 해서 <> 뒤는 생략 가능
		//방법 1.
//		list3.add(new Random().nextInt(100) + 1);
//		list3.add(new Random().nextInt(100) + 1);
//		list3.add(new Random().nextInt(100) + 1);
//
//		for(int i = 0; i < 7 ; i++) {
//			list3.add(new Random().nextInt(100) + 1);
//		}
		
		//방법 2.
		for(int i = 0; i < 10; i++) {
			list3.add(i, new Random().nextInt(100) + 1); // add를 잘 사용하는지 확인
		}
		System.out.println(list3);
		
		
		// 예제2) list3에 저장된 값의 합계와 평균을 구해주세요
		int sum = 0;
		double avg = 0.0;
		for(int item : list3) { // 갯수는 중요하지 않아요! 그래서 이걸로함
			sum += item;
		}
		avg = sum *1.0 / list3.size();
		System.out.println("sum : " + sum + ", avg : " + avg);
		
		
		// 예제3) list3에서 최솟값과 최댓값을 구해주세요.
		int min = list3.get(0); // 첫번째값이 가장 작다 가정
		int max = list3.get(0); // 첫번째 값이 가장 크다 가정
		for(int i = 0; i <list3.size(); i++ ) {
			if(list3.get(i) > min) {
				min = list3.get(i);
			}
			if(list3.get(i) > max) {
				max = list3.get(i);
			}
		}System.out.println("min : " + min + ", max : " + max);
		
		
		// 예제4) list3을 오름차순으로 정렬해주세요.
		// 정렬의 원리를 알아야해요... // 삽입정렬임 
		for(int i = 1;  i< list3.size(); i++) {
			int tmp = list3.get(i);
			int j = 0;
			for(j = i - 1 ; j >= 0 ; j--) {
				if(tmp < list3.get(i)){
					list3.set(j + 1, list3.get(i));				
			}else {
				break;
			}
		}
		list3.set(j + 1, tmp);	
	  }
	  System.out.println(list3);
	  
	  
	  // 2차원
	  List<List<Integer>> list4 = new ArrayList<>();
	  // 인티져를 갖는 리스트를 갖는 리스트!
	  
	  // 3차원
	  List<List<List<Integer>>> list5 = new ArrayList<>();
	  
	  
	  list3 = new ArrayList<>();
	  list3.add(1);
	  list3.add(2);
	  list3.add(3);
	  
	  list4.add(list3);	  
	  
	  List<Integer> list6 = new ArrayList<>();
	  list6.add(4);
	  list6.add(5);
	  list6.add(6);
	  
	  list4.add(list6);
	  
	  System.out.println(list4);
	  
	  // list = new ArrayList<Object>();
	  list.remove(2);
	  list.add("홍길동");
	  list.add(50); // 국어점수
	  list.add(60); // 영어점수

	  System.out.println(list);
	  
//	  String name = list.get(2); // 홍길동이 2번인덱스에 있는데 오류임
	  String name = (String)list.get(2); 
	  name.charAt(0);
	  System.out.println(name);
	  
	  UserList<Object> ul = new UserList<Object>();
	  ul.addAll(list);
	  System.out.println(ul);
	  
	  //------------------------------------
	  List<String> list10 = new ArrayList<>(); 
	  list10.add("채진영");
	  list10.add("송서영");
	  System.out.println(list10);
	  list10.add(1, "박민지");
	  System.out.println(list10);
	  list10.remove(1);
	  System.out.println(list10);
	  
	}

}
























