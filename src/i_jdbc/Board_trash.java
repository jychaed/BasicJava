package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.AbstractDocument.Content;

import e_oop.ScanUtil;


public class Board_trash {

	/*
	 * JAVA_BOARD 테이블을 만들고 JDBC을 사용해
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요. 
	 * 
	 * NUMBER(PK), TITLE ,CONTENT, WRITER, DATETIME
	 * 
	 * 실행 예)
	 * -------------------------------------------
	 * 번호      제목		작성자		작성일시
	 * -------------------------------------------
	 *  1     안녕하세요    홍길동     08-03 15:26
	 *  2     반갑습니다    이순신	   08-02 20:20
	 *  3     가입인사		아이유     08-03 13:31
	 * -------------------------------------------
	 * 1. 조회	2. 등록   3.삭제  4.수정   0.종료
	 * 원하는 메뉴 입력
	 * */
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; //:뒤에 ;주의
	static final String USER = "JY92";
	static final String PASSWORD = "java";
	static final SimpleDateFormat SDF = new SimpleDateFormat("MM-dd HH:mm");

	static Connection conn = null; 
	static ResultSet rs = null;
	static PreparedStatement ps = null; // 여기까지 잘 복붙
	
	static int input;
	static String sql;
	
	
	public static void main(String[] args) {
			

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "CREATE TABLE JAVA_BOARD( "
					+ "BOARD_NUMBER NUMBER NOT NULL,"
					+ "TITLE VARCHAR2(100),"
					+ "CONTENT VARCHAR2(100),"
					+ "WRITER VARCHAR2(100), "
					+ "DATETIME DATE, "
					+ "CONSTRAINT PK_B_NUMBER PRIMARY KEY(BOARD_NUMBER))";
			ps = conn.prepareStatement(sql);
		    ps.executeUpdate();
		    
			int result = ps.executeUpdate();
			
			if(result == 0) {
				System.out.println("테이블생성 실패");
			}else {
				System.out.println("테이블이 생성되었습니다!");
			}
			
			
			
			} catch (SQLException e) {
//				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch (Exception e) { }
				if(ps != null) try { ps.close(); } catch (Exception e) { }
				if(conn != null) try { conn.close(); } catch (Exception e) { }
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
					//showDetail();
					break;
				case 2:
					insertRow();
					break;
				case 3:
					//deleteRow();
					break;
				case 4:
					//updateRow();
					break;
				case 0: default:
					System.out.println("프로그램을 종료합니다..");
					break main;
				}
			}
		
	}


	private static void insertRow() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			sql = "INSERT INTO JAVA_BOARD "
					+ "(BOARD_NUMBER, CONTENT, TITLE, WRITER, DATETIME)"
					+ "VALUES (SEQ_NUMBER.NEXTVAL, ? , ? , ? , SYSDATE)";
			ps = conn.prepareStatement(sql);
			
			System.out.println("내용 입력 >>");
			String content = ScanUtil.nextLine();
			ps.setString(1, content);
			
			System.out.println("제목 입력 >>");
			ps.setString(2, ScanUtil.nextLine());
			System.out.println("작성자 입력 >>");
			ps.setString(3, ScanUtil.nextLine());
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + "개 등록완료 !");
			}else {
				System.out.println("등록 실패!");
			}
			

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch (Exception e) { }
			if(ps != null) try { ps.close(); } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}
	}


	private static void showList() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			sql = "SELECT * FROM JAVA_BOARD";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			System.out.println("-----------------------------------------------");
			System.out.printf("%s\t%6s\t%4s\t%8s", "번호", "제목", "작성자", "작성일시");
			System.out.println();
			
			while(rs.next()) {
				System.out.printf("%2d\t%6s\t%4s\t%14s", rs.getInt("BOARD_NUMBER")
						, rs.getString("TITLE"), rs.getString("WRITER")
						, SDF.format(rs.getDate("DATETIME")));
				System.out.println();
			}
					
			System.out.println("-----------------------------------------------");
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch (Exception e) { }
			if(ps != null) try { ps.close(); } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}
	}

}
