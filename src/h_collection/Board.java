package h_collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import e_oop.ScanUtil;

public class Board { // 웹개발의 기본은 CRUD!


	/*
	 * List 와 Map을 사용해 게시판 테이블을 만들고
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요. 
	 * 
	 * 번호(PK), 제목, 내용, 작성자, 작성일시
	 * 
	 * 실행 예)
	 * -------------------------------------------
	 * 번호      제목		작성자		작성일시
	 * -------------------------------------------
	 *  1     안녕하세요    홍길동     08-03 15:26
	 *  2     반갑습니다    이순신	   08-02 20:20
	 *  3     가입인사		아이유     08-03 13:31
	 * -------------------------------------------
	 * 1. 조회	2. 등록	3.삭제	4.종료
	 * 원하는 메뉴 입력
	 * */
	
	static int input;
	static List<Map<String, Object>> boardList = new ArrayList<>();
	static SimpleDateFormat sdf;
	static int SEQ_NUMBER; // 초기값 0이니까
	
	
	
	public static void main(String[] args) {
		
		Map<String, Object> user = new HashMap<String, Object>();
		//번호(PK), 제목, 내용, 작성자, 작성일시
		//NUMBER  TITLE  CONTENT  WRITER  DATETIME
		
		sdf = new SimpleDateFormat("MM-dd HH:mm");
		user.put("NUMBER", ++SEQ_NUMBER); //NUMBER 컬럼명
		user.put("TITLE", "안녕하세요");
		user.put("CONTENT", "안녕안녕");
		user.put("WRITER", "홍길동");
		user.put("PWD", "1234");
		try {
			user.put("DATETIME", new SimpleDateFormat("MM-dd hh:mm").parse("08-01 15:26")); // date객체
		} catch (ParseException e) {
			e.printStackTrace();
		}
		boardList.add(user);
		
		user = new HashMap<>(); // 값을 저장할 새로운 유저값!
		user.put("NUMBER", ++SEQ_NUMBER);
		user.put("TITLE", "반갑습니다");
		user.put("CONTENT", "반갑습니다");
		user.put("WRITER", "이순신");
		user.put("PWD", "1234");
		try {
			user.put("DATETIME", sdf.parse("08-02 20:20"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		boardList.add(user);
		
		user = new HashMap<>(); 
		user.put("NUMBER", ++SEQ_NUMBER);
		user.put("TITLE", "가입인사");
		user.put("CONTENT", "안녕안녕");
		user.put("WRITER", "아이유");
		user.put("PWD", "1234");
		try {
			user.put("DATETIME", sdf.parse("08-03 13:31"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		boardList.add(user);
		
		main:
			while(true) {
				System.out.println("================= 자유 게시판 =================");
				showList();
				System.out.println("1.조회 2.등록 3.삭제 4.수정 0.종료");
				System.out.print("메뉴 선택 >> ");
				input = ScanUtil.nextInt();
				switch(input) {
				case 1:
					showDetail();
					break;
				case 2:
					insertRow();
					break;
				case 3:
					deleteRow();
					break;
				case 4:
					updateRow();
					break;
				case 0: default:
					System.out.println("프로그램을 종료합니다..");
					break main;
				}
			}
			
		}

		private static void updateRow() {
			System.out.print("번호 입력 >> ");
			input = ScanUtil.nextInt();
			boolean check = false;
			
			Map<String, Object> row = null;
			for(int i = 0; i < boardList.size(); i++) {
				if(Integer.parseInt(boardList.get(i).get("NUMBER").toString()) == input) {
					check =true;
					row = boardList.get(i);
					break; 
				}
			}
			
			if(!check) {
				System.out.println("잘못 입력 하였습니다.");
			}
			
			// 없는 번호일 때 상황
			// 상황 1 : check == false;
			// 상황 2 : row == null;
			if(row != null) {
				System.out.println("1. 제목수정 2. 내용수정 3. 작성자수정");
				input = ScanUtil.nextInt();
				switch(input) {
				case 1:
					System.out.println("현재 제목 : " + row.get("TLTLE"));
					System.out.print("수정 입력 >> ");
					String title = ScanUtil.nextLine();
					row.put("TITLE", title);
					break;
				case 2:
					System.out.println("현재 내용 : " + row.get("CONTENT"));
					System.out.print("수정 입력 >> ");
					String content = ScanUtil.nextLine();
					row.put("CONTENT", content);
					break;
				case 3:
					System.out.println("현재 작성자 : " + row.get("WRITER"));
					System.out.print("수정 입력 >> ");
					String writer = ScanUtil.nextLine();
					row.put("WRITER", writer);
					break;
				}
				System.out.println("수정완료!");
			}
			
	}

		private static void deleteRow() {
			System.out.print("번호 입력 >> ");
			input = ScanUtil.nextInt();
			boolean check = false;
			for(int i = 0; i < boardList.size(); i++) {
				if(Integer.parseInt(boardList.get(i).get("NUMBER").toString()) == input) {
					check = true;
					
					for(int j= 1; j <= 3; j++) {
						System.out.println("삭제 비밀번호 >> ");
						String pwd = ScanUtil.nextLine();
						if(boardList.get(i).get("PWD").toString().equals(pwd)){
							//boardList.get(i).get("PWD") < 여기까지 오브젝트고
							//toString() 에서 문자열이 되었고
							//equals 는 오른쪽과 비교를 한다는 의미
							boardList.remove(i);
							System.out.println("삭제되었습니다.");
							break;
						}else {
							System.out.println("비밀번호가 틀렸습니다.(" + j + "/3)");
						}
					}
					
					break; // for문 끝냄
				}
			}
			if(!check) {
				System.out.println("잘못 입력 하였습니다.");
			}
	    }

//		private static void deleteRow() {
//			System.out.print("삭제 게시물 번호 >> ");
//			input = ScanUtil.nextInt();
//			for(int i = 0; i < boardList.size(); i++) {
//				Map<String, Object> row = boardList.get(i);
//				if(Integer.parseInt(row.get("NUMBER").toString()) == input) {
//					boardList.remove(i);
//					System.out.println(row.get("NUMBER") + "번 게시물을 삭제했습니다.");
//					break;
//				}
//			}	
//	    }

		private static void insertRow() { //20220804 수업
		Map<String, Object> row = new HashMap<>()	;
			
		 System.out.println("제목 입력 >> ");
		 String title = ScanUtil.nextLine();
		 System.out.println("내용 입력 >>");
		 String content = ScanUtil.nextLine();
		 System.out.println("작성자 입력 >> ");
		 String writer = ScanUtil.nextLine();
		 System.out.println("비밀번호 입력 >> ");
		 String pwd = ScanUtil.nextLine();
		 
		 row.put("TITLE", title);
		 row.put("CONTENT", content);
		 row.put("WRITER", writer);
		 row.put("PWD", pwd);
		 
		 Map<String, Object> lastRow = boardList.get(boardList.size()-1);
	      /* 보드사이즈-1은 보드리스트의 마지막 인덱스번호.
	       * 마지막인덱스번호로 만든 객체(lastRow)는 넘버를  가지고 있고,
	       * 글작성을 할때마다 새 객체의 넘버는 마지막인덱스 객체의 넘버에 +1을 해준값이라는 뜻.*/
		 int number = Integer.parseInt(lastRow.get("NUMBER").toString()) + 1; 
		 // ㄴ SQL : SELECT MAX(NUMBER)+1 FROM BOARD
		 // INSERT INTO BOARD (TITLE, CONTENT, WRITER, NUMBER, DATETIME)
		 //      VALUES ('{title}','{content}','{writer}','{SELECT MAX(NUMBER)+1 FROM BOARD}','{SYSDATE}',
		 // (TITLE, CONTENT, WRITER, NUMBER, DATETIME) 대상컬럼명 항상 적으세요!
		 // 왜냐면 순서가 바뀌고 내용도 추가되고 그러니까 꼭!
		 
		 // 시퀀스
		 // 감소되지않는 증가되는 함수 같은 것...
		 // SEQ_NUMBER.NEXTVAL
//		 row.put("NUMBER", number); // MAX를 이용하는 방법
		 row.put("NUMBER", ++SEQ_NUMBER); // 시퀀스를 이용하는 방법
		 row.put("DATETIME", new Date()); // 글을 작성할 시간을 데이트 객체로 넣어줌
		 
		 boardList.add(row);// 보드리스트에 등록이 된다...!
		 
		 System.out.println("등록이 완료되었습니다.");
		 
//		 row.put("NUMBER", boardList.get(boardList.size() - 1).get("NUMBER")+1);
		 
	}

		private static void showDetail() {
			System.out.print("게시물 번호 입력 >> ");
			input = ScanUtil.nextInt();
			boolean check = false;
			for(int i = 0; i < boardList.size(); i++) {
				Map<String, Object> row = boardList.get(i);
				if(Integer.parseInt(row.get("NUMBER").toString()) == input) {
					check = true;
					System.out.println();
					System.out.println("**** 내용 : " + row.get("CONTENT"));
					System.out.println();
					break;
				}
			}
			
			if(!check) {
				System.out.println();
				System.out.println("**** 해당하는 게시물이 없습니다.");
				System.out.println();
			}
		}

		private static void showList() {
			System.out.println("-----------------------------------------------");
			System.out.printf("%s\t%6s\t%4s\t%8s", "번호", "제목", "작성자", "작성일시");
			System.out.println();
			System.out.println("-----------------------------------------------");
			for(int i = 0; i < boardList.size(); i++) {
				Map<String, Object> item = boardList.get(i);
				System.out.printf("%2d\t%6s\t%4s\t%14s", item.get("NUMBER"), item.get("TITLE")
						, item.get("WRITER"), sdf.format((Date)(item.get("DATETIME"))));
				System.out.println();
			}
			System.out.println("-----------------------------------------------");
		}

	}
