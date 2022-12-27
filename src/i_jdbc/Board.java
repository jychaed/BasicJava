package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;


public class Board {
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; //:뒤에 ;주의
	static final String USER = "JY92";
	static final String PASSWORD = "java";
	static final SimpleDateFormat SDF = new SimpleDateFormat("MM-dd");

	static Connection conn = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;

	static int input;
	static String sql;
	
	static JDBCUtil jdbc = JDBCUtil.getInsteance(); // 0808 전역변수로 뺌!

	public static void main(String[] args) {
		
//		JDBCUtil jdbc = new JDBCUtil(); // 외부에서 기본생성자를 호출 할 수 없음(0808)
//		JDBCUtil jdbc = JDBCUtil.getInsteance(); //겟인스턴스는 뉴가 아니고 있는거 빌려줘! 0808
//		jdbc.method1(); //0808
		// 이것이 싱글톤임 한개만 만들겠다!!!!
 		
		
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD); 
			sql = "CREATE TABLE JAVA_BOARD ( "
					+ " BOARD_NUMBER NUMBER NOT NULL, "
					+ " TITLE VARCHAR2(100), "
					+ " CONTENT VARCHAR2(100), "
					+ " WRITER VARCHAR2(100), "
					+ " DATETIME DATE, "
					+ " CONSTRAINT PK_BOARD_NUMBER PRIMARY KEY(BOARD_NUMBER)) ";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
		}catch(SQLException e) {
			//	         e.printStackTrace();
		}finally {
			if(rs != null) try {  rs.close();  } catch (Exception e) { }
			if(ps != null) try {  ps.close();  } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}

		///



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
		sql = "UPDATE JAVA_BOARD SET ";
		System.out.print("수정 번호 입력 >>");
		int boardNumber = ScanUtil.nextInt();
		System.out.println("1. 제목   2. 내용   3. 작성자");
		System.out.print("번호입력 >>");
		switch(ScanUtil.nextInt()){
			case 1:
				sql += "TITLE =";
				break;
			case 2:
				sql += "CONTENT = ";
				break;
			case 3:
				sql += "WRITER = ";
				break;
			case 0:
			default:
				return; // 메서드를 끝낸다는 의미 브레이크에서 바꿈 
		}
		System.out.println("수정 내용 >>");
		sql += " '" + ScanUtil.nextLine() + "' "; //오라클 '' 표시해야해서 ""로 묶어준거!
		sql += " WHERE BOARD_NUMBER = " + boardNumber;
		// sql => "UPDATE JAVA_BOARD SET TITLE = '값값' WHERE BOARD_NUMBER = 1" << 이런 형태가 됨
		int result = jdbc.update(sql);
		if(result > 0) {
			System.out.println("수정 성공!");
		}else {
			System.out.println("수정 불가!");
		}
		
	}


	private static void deleteRow() {
		
		// 1. 직접 연결 방법
//		try {
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			sql = "SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER = ?";
//			ps = conn.prepareStatement(sql);
//
//			System.out.println("삭제할 번호 입력 >> ");
//			int boardNum = ScanUtil.nextInt();
//			ps.setInt(1, boardNum);
//
//			rs = ps.executeQuery();// rs 이자식은  출력된 결과물을 담는다! 
//			//-1부터시작해요 
//
//			boolean check = rs.next();
//
//			if(check) {
//				sql = "DELETE JAVA_BOARD WHERE BOARD_NUMBER = ?"; // sql구문을 만들고
//
//				ps = conn.prepareStatement(sql); // sql구문을 ps에 담고
//				ps.setInt(1, boardNum); // 나는 여기에서 시도를 하겠다! 셋인트에 넣음!
//
//				int result = ps.executeUpdate(); // 그업데이트가 잘되었는지 결과를 인트형으로 반환해서 리솔트에 넣음 
//				// update, delete, insert
//				// int result = ps.executeUpdate(); // 업데이트를 실행한다. 내값이 어케되건 db입장에선 업데이트임 바꼈쟈나
//
//				if(result <= 0) { // 너는 0보다 작거타 같으면 실패됨 왜냐 너 수정했잖아 그럼 1나와야지!
//					System.out.println("실패하였습니다");
//				}else { // 그래서 너 수정된 구문 있음
//					System.out.println(result + "개가 삭제되었습니다.");
//				} 
//
//			}else { // 값이 없다 => row가 조회되지 않았다.
//				System.out.println("잘못입력했습니다.");
//			}
//
//
//
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			if(rs != null) try {  rs.close();  } catch (Exception e) { }
//			if(ps != null) try {  ps.close();  } catch (Exception e) { }
//			if(conn != null) try { conn.close(); } catch (Exception e) { }
//		}
		
		
		// 2. JDBCUtil 을 이용한 방법
		System.out.println("삭제 번호 입력 >> ");
		sql = "SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER = " + ScanUtil.nextInt(); 
		// 입력받는 문자가 sql과 결합되요!
		// 결합되면 sql = "SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER = 1" < 이런모양이죠! 
		int result = jdbc.update(sql);
		if(result > 0) {
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("삭제 실패!");
		}
		
	}




	private static void showDetail() {
		// 1. 직접 연결 방법
//		try {
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			sql = "SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER = ?";
//			ps = conn.prepareStatement(sql);
//
//			System.out.println("번호 입력 >> ");
//			ps.setInt(1, ScanUtil.nextInt());
//
//			rs = ps.executeQuery();// rs 이자식은  출력된 결과물을 담는다! 
//			//-1부터시작해요 
//
//
//			// rs.next(); // rs를 다음줄로 넘어가라 포인터의 느낌 커서가 아직 1행 아님
//
//			boolean check = rs.next();
//			if(check) {//=> 값이 있다 => 1개의 row라도 존재한다
//				System.out.println("+++ 내용 :: "+ rs.getString("CONTENT"));
//			}else { // 값이 없다 => row가 조회되지 않았다.
//				System.out.println("잘못입력했습니다.");
//			}
//
//			//		       while(rs.next()) {
//			//		    	   
//			//		       }
//
//
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			if(rs != null) try {  rs.close();  } catch (Exception e) { }
//			if(ps != null) try {  ps.close();  } catch (Exception e) { }
//			if(conn != null) try { conn.close(); } catch (Exception e) { }
//		}
		
		// 2. JDBCUtil 을 이용한 방법
		sql = "SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER = ?";
		System.out.println("번호 입력 >> ");
		List<Object> param = new ArrayList<>();
		param.add(ScanUtil.nextInt());
		Map<String, Object> row = jdbc.selectOne(sql, param);
		//System.out.println(row);
		if(row == null) {
			System.out.println("잘못입력했습니다");
		}else {
			System.out.println("+++ 내용 :: " + row.get("CONTENT"));
			
		}
		
		
	}


	private static void insertRow() {
		
		// 1. jdbd 를 직접 이용한 방법
//		try {
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			sql = "INSERT INTO JAVA_BOARD "
//					+ " (BOARD_NUMBER, CONTENT, TITLE, WRITER, DATETIME) " 
//					+ " VALUES (SEQ_NUMBER.NEXTVAL, ?, ?, ?, SYSDATE)";
//			ps = conn.prepareStatement(sql);
//
//			System.out.print("내용 입력 >> ");
//			String content = ScanUtil.nextLine();
//			ps.setString(1, content);
//
//
//			System.out.print("제목 입력 >> ");
//			ps.setString(2, ScanUtil.nextLine());
//			System.out.print("작성자 입력 >> ");
//			ps.setString(3, ScanUtil.nextLine());
//
//			int result = ps.executeUpdate();
//
//			if(result > 0) {
//				System.out.println(result + "개 등록완료 !");
//			}else {
//				System.out.println("등록 실패!");
//			}
//
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			if(rs != null) try {  rs.close();  } catch (Exception e) { }
//			if(ps != null) try {  ps.close();  } catch (Exception e) { }
//			if(conn != null) try { conn.close(); } catch (Exception e) { }
//		}
		
		// 2. JDBCUtil을 이용하는 방법
		sql = "INSERT INTO JAVA_BOARD "
				+ " (BOARD_NUMBER, CONTENT, TITLE, WRITER, DATETIME) " 
				+ " VALUES (SEQ_NUMBER.NEXTVAL, ?, ?, ?, SYSDATE)"; // 이 ? 순서는 입력받는 순서 꼭 맞춰야함
		List<Object> param = new ArrayList<>();
		System.out.println("내용 입력 >>>");
		param.add(ScanUtil.nextLine());
		System.out.println("제목 입력 >>>");
		param.add(ScanUtil.nextLine());
		System.out.println("작성자 입력 >>>");
		param.add(ScanUtil.nextLine());
		int result = jdbc.update(sql, param);
		if(result > 0) {
			System.out.println("등록 되었습니다!");
		}else {
			System.out.println("등록 실패!");
		}
		
	}

	private static void showList() {
		
		// 1. jdbd 를 직접 이용한 방법
//		try {
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			sql = "SELECT * FROM JAVA_BOARD ORDER BY BOARD_NUMBER ASC";
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
		
//			System.out.println("-----------------------------------------------");
//			System.out.printf("%s\t%6s\t%4s\t%6s", "번호", "제목", "작성자", "작성일");
//			System.out.println();
//
//			while(rs.next()) {
//				System.out.printf("%2d\t%6s\t%4s\t%9s", rs.getInt("BOARD_NUMBER")
//						, rs.getString("TITLE"), rs.getString("WRITER")
//						, SDF.format(rs.getDate("DATETIME")));
//				System.out.println();
//			}
//
//			System.out.println("-----------------------------------------------");
//
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			if(rs != null) try {  rs.close();  } catch (Exception e) { }
//			if(ps != null) try {  ps.close();  } catch (Exception e) { }
//			if(conn != null) try { conn.close(); } catch (Exception e) { }
//		}
		
		// 2. JDBCUtil을 이용하는 방법
		sql = "SELECT * FROM JAVA_BOARD ORDER BY BOARD_NUMBER ASC";
		List<Map<String, Object>> list = jdbc.selectList(sql);

		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%6s\t%4s\t%6s", "번호", "제목", "작성자", "작성일");
		System.out.println();
		
		// 예외처리 for문 전에해야함
		if(list == null || list.size() == 0) { // 이거 if문의 순서가 틀리면 안됩니다!
			System.out.println("            게시글 없음");
		}else {
			// for(int i = 0; i< list.size(); i++){ list.get(i).get("{COLUMN_NAME}") // 인덱스값 사용할때 이거쓰고!
			for(Map<String, Object> item : list) { // item.get("{COLUMN_NAME}") //// 위랑 같은  // 걍 하나하나 뽑아 쓸때ㅑ는 향상된 for문
				System.out.printf("%2d\t%6s\t%4s\t%9s", Integer.parseInt(item.get("BOARD_NUMBER").toString()) // 데이터 number는 인티져보다 커요! 강제 문자열로 하고 강제로 인티저해줌
						,  item.get("TITLE"),  item.get("WRITER")
						, SDF.format( item.get("DATETIME")));
				System.out.println();
				
		     }

		}
		System.out.println("-----------------------------------------------");
	}

}
