package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import e_oop.ScanUtil;

public class JDBCTest {
	
	
	/*
	 * 1) MEMBER 테이블에 새로운 사용자를 추가해보자
	 *    (단, MEM_ID, MEM_PASS, MEM_NAME 만 입력)
	 * 2) INSERT가 빨리 끝나면 SELECT도 해보자
	 * 3) 여기까지왔다면 입력을 받아 회원가입해보자
	 * 
	 * */

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //:뒤에 ;주의
		String user = "JY92";
		String password = "java";
			
		Connection conn = null; 
		ResultSet rs = null;
		PreparedStatement ps = null; // 여기까지 잘 복붙
		
		try {// 맨처음에 연결해줘야지
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("아이디 입력 >>");
			String id = ScanUtil.nextLine();
			System.out.println("이름 입력 >>");
			String name = ScanUtil.nextLine();
			System.out.println("비밀번호 입력 >>");
			String pwd = ScanUtil.nextLine();
			
			
			// sql만들고
			String sql = "INSERT INTO MY_MEMBER(MEM_ID, MEM_PASS, MEM_NAME)"
					+ "VALUES( ? , ? , ? )" ; //내가 사용하고 싶은  sql문 작성
			ps = conn.prepareStatement(sql);
						
			ps.setString(1, id);
			ps.setString(2, pwd);
			ps.setString(3, name);
			
			int result = ps.executeUpdate(); // 0 또는 인트를 출력해요?
			
			if(result > 0) {
				System.out.println(result + "개 등록 완료!");
			}else {
				System.out.println("등록실패!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch (Exception e) { }
			if(ps != null) try { ps.close(); } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		
		}
		
		// 내가 하려는 행동한번에 연결 1번! 규칙 새로 연결!
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM MY_MEMBER";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // 셀렉트한 결과값을 원할때 사용할수 있는 쿼리! 
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for(int i = 1; i <= columnCount; i++){
				System.out.print(rsmd.getColumnName(i));
			}System.out.println();
			while(rs.next()) {//담을게 잇니?
				for(int i = 1; i <= columnCount; i++){
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch (Exception e) { }
			if(ps != null) try { ps.close(); } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		// ORA-00001: unique constraint (JY92.MY_MEMBER_PK) violated
		// 이거 에러는 이름 바꿔서 넣어주라는 거?
		}
		
	}

}
