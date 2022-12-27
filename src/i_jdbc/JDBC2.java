package i_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {

		// 0. 데이터베이스 접속 정보 입력
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //jdbc:oracle:thin: << 이건 약속! / @localhost 내컴퓨터가 주인이다!
		String user = "JY92";
		String password = "java";
			
		Connection conn = null; // conn자체가 연결!
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * "
					+ " FROM CART "
					+ " WHERE CART_MEMBER= ? "; // 뭐가 들어갈지 모르겠어요 우선 완성하고 나중에 채워요 스트링 포맷같은 놈
			ps = conn.prepareStatement(sql);
			ps.setString(1, "a001"); // setString 이기에 자동으로 ''로 감싸짐
			// 1번째에 a001을 넣어주겠다
			// ps.setString(prameterIndex, x);
			// 단, prameterIndex는 1부터 시작
			//  ?  이거는 '' 를 넣어주면 오류남
			// ps.setInt(prameterIndex, x); 
			// ps.setObject(prameterIndex, x); 
			                                      // ps.setDate(prameterIndex, new Date()); 
			
			// ps.setDate(1, new Date(new java.util.Date().getTime())); // 이건 오라클식 현재시간!
			// 편지 쓰기만함!
			// 이제 부쳐야지~
			
			rs = ps.executeQuery();// 앗 카트컬럼 몰라요
			
			ResultSetMetaData rsmd = rs.getMetaData(); 
			//메타데이터 : 데이터에 대한 데이터
			
			int columnCount = rsmd.getColumnCount(); // 로우갯수아니고 컬럼갯수!
				
			for(int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while(rs.next()) {
				for(int i = 1; i <= columnCount; i++) {
					//Object o = rs.getObject(i); // 뭘로 받을지 모르니깡 // index로 받기
					Object o = rs.getObject(rsmd.getColumnName(i)); //ColumnName으로 받기 
					//getColumnName < 컬럼명 별칭아님 ! 주의해라 0808 추가
					System.out.print(o + "\t");
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch (Exception e) { }
			if(ps != null) try { ps.close(); } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		
		}
		
				
		
	}

}


























