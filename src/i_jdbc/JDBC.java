package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	/*
	 * JDBC (Java Database Connectivity) // 자바와 데이터베이스를 연결해주는 놈
	 * - 자바와 데이터 베이스를 연결해주는 라이브러리
	 * - ojdbc : 오라클 JDBC
	 * 
	 * JDBC 작성 단계
	 * 1. Connection 생성
	 * 2. Statement 생성 (쿼리 query 생성)
	 * 3. Statement 실행 (Query 실행)
	 * 4. ResultSet에서 결과 추출 (select 경우)
	 * 5. ResultSet, Statement, Connection 닫기
	 * 
	 * 
	 * */
	// 자바베이직-오른쪽- 프로펄티-자바빌드패스 - 라이브러리 - 애드 액터널 자르? - 오라클 ojdbc6연결해야함
	
	public static void main(String[] args) {
		// 0. 데이터베이스 접속 정보 입력
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "jy081101";
		String password = "java";
		
		Connection conn = null; // conn자체가 연결!
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		
		try {
			// 1. Connection 생성
			// DricerManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			conn = DriverManager.getConnection(url, user, password); // sql오류가 나면 이걸 쓰는거
			// getConnection 에서 드라이버 자동 로드
			
			// 2. Statement 생성 (쿼리 query 생성)
			String sql = "SELECT * FROM MEMBER"; //내가 사용하고 싶은  sql문 작성
			// 나중에 ; 써서 오류나니까!!!주의
			//"SELECT * FROM MEMBER;"; << 이런식으로 멤버뒤에!!! 조심해!!!
			ps = conn.prepareStatement(sql); // conn(연결이 가지고 있은) prepareStatement 편지를 꺼내서 그안에 sql적음 그래서 ps는 적힌 편지지
			
			// 3. Statement 실행 (Query 실행)
			// select
			rs = ps.executeQuery(); // rows, 일회성(휘발성) //ps편지지를 executeQuery보낸다 결과가 rs에 저장 // 얘는 읽기 검색만 해오니까
			
			// update, delete, insert
			// int result = ps.executeUpdate(); // 업데이트를 실행한다. 내값이 어케되건 db입장에선 업데이트임 바꼈쟈나 // 얘는 쓰	기!
			// int result < 업데이트의 실행결과가 참이면 양수를 반환
			//  row count  영향을 받은 행! 여러개아니고 하나씩 한다고 생각해서 결과값은  0 또는 1이라 생각하자 
			
			
			//4. ResultSet에서 결과 추출 (select 경우)
			// 최초 rs의 index는 -1입니다. (현재상태)
			while(rs.next()) { // rs.next() 다음번째 로우가 있는지 검증해줌
				// rs -> row
//				String memId = rs.getString("MEM_ID"); // 컴럼명을 이용하는 방식 // rs하나의 이것을 getString해서 "MEM_ID"을 저장합니다. 
				String memId = rs.getString(1); // 컬럼 순서를 이용하는 방식
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID : " + memId + " , MEM_PASS : " + memPass);
				// int a = rs.getInt("{COLUMN_NAME}");
				// Date d = rs.getDate("{COLUMN_NAME}");
				// Object o = rs.getObject("{COLUMN_NAME}");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. ResultSet, Statement, Connection 닫기 
			// conn 끊기면 다끊기져....
			// 그럼 오류가 발생할 수 있으니까 역순으로 끊어줘
			if(rs != null) {
				try { 
					rs.close(); // 사용한거 반납햐
				} catch (Exception e) { // 걍 프로그램 종료만 막는겨
				}
			}
			if(ps != null) {
				try { 
					ps.close(); // 사용한거 반납햐
				} catch (Exception e) { // 걍 프로그램 종료만 막는겨
				}
			}
			if(conn != null) try { conn.close(); } catch (Exception e) { }
			
			// 위아래 둘다 가능함
		}
		
	}
	
}















