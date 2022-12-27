package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import e_oop.ScanUtil;




public class BoardMinji {
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; //jdbc:oracle:thin: thin을 붙이는 이유는 오라클에 있는걸 사용할때 쓰는 약속이예요
	static final String USER = "PMJ94";
	static final String PASSWORD = "java";
	static final SimpleDateFormat SDF = new SimpleDateFormat("MM-dd");
	
	static Connection conn = null;  // 연결이 NULL값
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static int input;
	static String sql;

 
	/*
	 * JAVA_BOARD테이블을 만들고 JDBC를 사용해
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
	 * 
	 * NUMBER(PK), TITLE, CONTENT, WRITER, DATETIME
	 * 
	 * 실행 예)
	 * --------------------------------------------
	 * 번호		제목		작성자		작성일시
	 * --------------------------------------------
	 * 1	 안녕하세요		홍길동		08-01 15:26
	 * 2 	 반갑습니다		이순신		08-02 20:20
	 * 3	 가입인사		아이유		08-03 13:31
	 * --------------------------------------------
	 * 1.조회  2.등록  3.삭제 4.수정 0.종료
	 * 원하는 메뉴 입력 >>
	 * */

	public static void main(String[] args) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			sql =  "CREATE TABLE JAVA_BOARD( "
					+ "B_NUMBER NUMBER NOT NULL,"
					+ "TITLE VARCHAR2(100),"
					+ "CONTENT VARCHAR2(100),"
					+ "WRITER VARCHAR2(100), "
					+ "DATETIME DATE, "
					+ "CONSTRAINT PK_B_NUMBER PRIMARY KEY(B_NUMBER))";
			ps = conn.prepareStatement(sql);
			int result = ps.executeUpdate();
			
		}catch (SQLException e) {
//			e.printStackTrace();   --이거 주석달면 빨간 오류글씨 안떠용
		}finally {
			// 5. ResultSet, Statement, Connection 닫기
			if(rs != null) 	try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(conn != null) try { conn.close(); } catch (Exception e) {}
			
		}
		
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
		
		
	}

	private static void deleteRow() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			sql = "SELECT * FROM JAVA_BOARD WHERE B_NUMBER = ?";
			ps = conn.prepareStatement(sql);
			
			System.out.print("삭제할 번호를 입력 >> ");
			int boardNum = ScanUtil.nextInt();
			ps.setInt(1, boardNum);
			
			rs = ps.executeQuery();
			
			boolean check = rs.next();
			if(!check) {
			   System.out.println("잘못된 입력입니다.");	
			}else {
				
				sql = "DELETE JAVA_BOARD WHERE B_NUMBER = ?";
				
				ps = conn.prepareStatement(sql);
				ps.setInt(1, boardNum);
				
				int result = ps.executeUpdate();
				if(result <= 0) {
					System.out.println("실패하였습니다");
				}else {
					System.out.println(result + "개가 삭제되었습니다.");
				} 
			}
	
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) 	try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
			
	}

	private static void showDetail() {
		try {
//			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//		
//			sql = "SELECT * FROM JAVA_BOARD WHERE ";
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
//			
//			System.out.println("게시물 번호 입력 >> ");
//			input = ScanUtil.nextInt();
//			
//			while(rs.next()) {
//			if(rs.getInt("B_NUMBER") == input) {
//				System.out.println(rs.getString("CONTENT"));
//			}else {
//				System.out.println("잘못입력");
//			}
//			}
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			sql = "SELECT * FROM JAVA_BOARD WHERE B_NUMBER = ?"; // 한개만 나오니까 ORDER는 할 필요 없어요
			ps = conn.prepareStatement(sql);
			
			System.out.print("번호 입력 >> ");
			ps.setInt(1, ScanUtil.nextInt()); //물음표가 하나잖아요. 첫번째 물음표에다가 값을 넣겠다는 거예요
				
			// 삭제할때는 rs = ps.executeUpdate();
			rs = ps.executeQuery(); //얘는 결과값을 보여주는 애예요
			// rs는 아직 row로 오지 않았어요. 인덱스 1 위에 있어요.
				
			//rs.next(); //다음줄로 넘어가서 row1로 가라. 여기서 row는 rownum할때 row예요
				
			boolean check = rs.next();
			if(check) { // 값이 없다 => 1개의 row라도 존재한다
				System.out.println("+++ 내용 :: " + rs.getString("CONTENT"));
			}else { //값이 없다 => row가 조회되지 않았다.
				System.out.println("잘못입력했습니다.");
			}
				
//				while(rs.next()) {
//					
//				}
			
				
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(rs != null) 	try { rs.close(); } catch (Exception e) {}
				if(ps != null) try { ps.close();} catch (Exception e) {}
				if(conn != null) try { conn.close(); } catch (Exception e) {}
			}
			
	}
		
	

	private static void insertRow() {
		
		//SEQ_NUMBER 오라클에서 
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			sql = "INSERT INTO JAVA_BOARD "
					+ " (B_NUMBER, CONTENT, TITLE, WRITER, DATETIME) " 
					+ " VALUES (SEQ_NUMBER.NEXTVAL, ?, ?, ?, SYSDATE) ";
			ps = conn.prepareStatement(sql);
			System.out.print("내용 입력 >> ");
			String content = ScanUtil.nextLine();  //따로 변수를 받는 경우는 따로 변수를 사용하고 싶을 때
			ps.setString(1, content);
			
			System.out.print("제목 입력 >> ");
			ps.setString(2, ScanUtil.nextLine());
			
			System.out.print("작성자 입력 >> ");
			ps.setString(3, ScanUtil.nextLine());
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + "개 등록 완료!");
			}else {
				System.out.println("등록 실패!");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) 	try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
			
		
	}

	private static void showList() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			sql = "SELECT * FROM JAVA_BOARD ORDER BY B_NUMBER ASC";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		
			System.out.println("-----------------------------------------------");
			System.out.printf("%s\t%6s\t%4s\t%8s", "번호", "제목", "작성자", "작성일");
			System.out.println();
			
			while(rs.next()) {
					System.out.printf("%2d\t%6s\t%4s\t%14s", rs.getInt("B_NUMBER"), rs.getString("TITLE")
							, rs.getString("WRITER"), SDF.format(rs.getDate("DATETIME")));
					System.out.println();
				}
				System.out.println("-----------------------------------------------");
						
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 5. ResultSet, Statement, Connection 닫기
			if(rs != null) 	try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
			
		}
		

}
