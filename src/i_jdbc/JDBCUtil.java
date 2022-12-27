package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	/*
	 * JDBC를 좀더 쉽고 편하게 사용하기 위한 Utility 클래스 // 트라이캐치! 없어져! ㅎㅎ안해도됨
	 * 
	 * Map<String, Object> selectOne(String sql) //Map<컬럼명, 밸류> >> 결국 row 한줄임
 	 * Map<String, Object> selectOne(String sql,List<Object> param)
	 * List<Map<String, Object>> selectList(String sql) //  row를 여러개 받는 리스트를 반환
	 * List<Map<String, Object>> selectList(String sql, List<Object> param) // 여러줄의 row // 작성자를 조회할때?
	 * int update(String sql) --> db가 업데이트 되는 것!/ 조건없이 모두다 딜리트 업데이트 인서트!
	 * int update(String sql, List(Object> param) // ? 가 들어간 거는 파라미터...? 있어야한다고?
	 * 
	 * */
	
	// 싱글톤 패턴을 이용해 객체를 하나만 사용하도록 할꺼야
	// 객체를 남용하면 메모리에 문제가 생겨

	// 싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	
	//  인스턴스를 보관할 변수
	private static JDBCUtil instance = null; // 명시적으로 null 선언
	// JDBCUtil 객체를 만들 수 없게(인스턴스화 할 수 없게) private으로 제한함 // 객체를 사용하지 않아도 사용할수있도록 static!
	private JDBCUtil() {}  // JDBCUtil 안에 생성자는 유일무이 하나 나눠서 씀???
	public static JDBCUtil getInsteance() { // 스태틱! 붙여야 객체 ㄴㄴ여도 사용가능
		if(instance == null) instance = new JDBCUtil(); // 나를 가지고 만든 객체같은 인스턴스! 널일때만 생성하므로 1개만 만들어짐
		return instance; //JDBCUtil 사용할 수 있게끔 // new JDBCUtil아님!
	}// 위의 모양 자체를 기억해야해요!!!!! 프라이잇 저 5줄 기억해!!!!!! 싱글톤하려면! 기본양식 필수!
	
	
	
	
//	public void method1() {
//		System.out.println("method1");
//	}
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; //:뒤에 ;주의
	private String user = "jy0816";
	private String password = "java";

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	
	//List<Map<String, Object>> selectList(String sql, List<Object> param) // 여러줄의 row // 작성자를 조회할때?
	List<Map<String, Object>> selectList(String sql, List<Object> param){
		// sql => "SELECT * FROM MEMBER WHERE MEM_ADD1 LIKE '%'||?||'%'"
		// sql => "SELECT * FROM JAVA_BOARD WHERE WRITER=?"
		// sql => "SELECT * FORM JAVA_BOARD WHERE BOARD_NUM > ?"
		List<Map<String, Object>> result = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			ps = conn.prepareStatement(sql);// prepareStatement 만들어지고
			
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i+1, param.get(i)); // i+1오라클은 1부터니까 +1, 리스트는 배열 0부터 시작이고!///
			}
			
			rs = ps.executeQuery(); // 실행하기전에 채워주고
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			while(rs.next()) { // 내다음 결과값이 있니? 하나라도 있다면
				if(result == null) result = new ArrayList<>();
				Map<String, Object> row = new HashMap<>();
				for(int i = 1; i <= columnCount; i++) {
					String key = rsmd.getColumnLabel(i); // 컬럼이름은 메타데이터가 가지고 잇고 // 컬럼라벨은 별칭이고 별칭없으면 컬럼명 가져옴
					Object value = rs.getObject(i); 
					row.put(key, value);
				}
				result.add(row);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {  rs.close();  } catch (Exception e) { }
			if(ps != null) try {  ps.close();  } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}
		return result;
	}
	
	
	//List<Map<String, Object>> selectList(String sql) //  row를 여러개 받는 리스트를 반환
	List<Map<String, Object>> selectList(String sql){
		// sql => "SELECT * FROM MEMBER"
		// sql => "SELECT * FROM JAVA_BOARD"
		// sql => "SELECT * FORM JAVA_BOARD WHERE BOARD_NUM > 10"
		List<Map<String, Object>> result = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			while(rs.next()) { // 내다음 결과값이 있니? 하나라도 있다면
				if(result == null) result = new ArrayList<>();
				Map<String, Object> row = new HashMap<>();
				for(int i = 1; i <= columnCount; i++) {
					String key = rsmd.getColumnLabel(i); // 컬럼이름은 메타데이터가 가지고 잇고
					Object value = rs.getObject(i);
					row.put(key, value);
				}
				result.add(row);
			}
					
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {  rs.close();  } catch (Exception e) { }
			if(ps != null) try {  ps.close();  } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}
		return result;
    }
	
	
	//int update(String sql, List(Object> param) // ? 가 들어간 거는 파라미터...? 있어야한다고?
	public int update(String sql, List<Object> param){

		// sql => "DELETE FROM JAVA_BOARD WHERE BOARD_NUMBER "
		// sql => "UPDATE JAVA_BOARD SET TITLE ='하하' WHERE BOARD_NUMBER=1"//
		// sql => "INSERT MEMBER (MEM_ID, MEM_PASS, MEM_NAME) VALUES (?, ?, ?)"

		int result = 0;
		try {
			conn = DriverManager.getConnection(url, user, password);
			ps = conn.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i+1, param.get(i));
			}
			result = ps.executeUpdate();
			
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		if(rs != null) try {  rs.close();  } catch (Exception e) { }
		if(ps != null) try {  ps.close();  } catch (Exception e) { }
		if(conn != null) try { conn.close(); } catch (Exception e) { }
	}
	return result;
}

	
	//int update(String sql) --> db가 업데이트 되는 것!/ 조건없이 모두다 딜리트 업데이트 인서트!
	public int update(String sql){
		// sql => "DELETE FROM JAVA_BOARD"
		// sql => "UPDATE JAVA_BOARD SET TITLE ='하하'"
		// sql => "UPDATE JAVA_BOARD SET TITLE ='하하' WHERE BOARD_NUMBER=1"// ? 없는 SQL
		// sql => "INSERT MEMBER (MEM_ID, MEM_PASS, MEM_NAME) VALUES ('admin', '1234','홍길동')"
		int result = 0;
		try {
			conn = DriverManager.getConnection(url, user, password);
			ps = conn.prepareStatement(sql);
			result = ps.executeUpdate();
		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {  rs.close();  } catch (Exception e) { }
			if(ps != null) try {  ps.close();  } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}
		return result;
    }
	
	
	//Map<String, Object> selectOne(String sql,List<Object> param)
	public Map<String, Object> selectOne(String sql, List<Object> param){ // 이 쿼리를 날렸을때 한줄만 필요 리스트 말고
		// sql => "SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER=?" // 파라미터 받을 때 ? 들어가요 // sql ? 면 파람이 있어야함!
		// param => [1]
		//
		// sql => "SELECT * FROM JAVA_BOARD WHERE WRITER=? AND TITLE =?" // 파라미터 받을 때 ? 들어가요
		// param => ["홍길동", "안녕"]  순서 꼭 맞춰서 써줘야함 작성이랑 제목! 순서! // sql ? 면 파람이 있어야함! 순서 중요!
		Map<String, Object> row = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password); //url, user, password이걸 받아왔고 getConnection 연결했고 conn에 넣을꺼야
			ps = conn.prepareStatement(sql); //prepareStatement 나는이제 sql문을 준비했다잉 쓸꺼다 ㄱㄱ ps에 넣어~
			for(int i = 0; i< param.size(); i++) {// for문 왜쓰지? select 한 결과의 로우가 여러개면 해당하는 row를 찾아야해서??? >> 확인할것 20220809
				ps.setObject(i+ 1 , param.get(i)); //i+ 1 < ? 가 시작이라서 ? // param.get(i) ?에 0번째 값을 넣어라 //ps라는 준비된 편지지에 set넣는다 적는다
			}
			rs = ps.executeQuery(); // ? 가 다 채워지면 executeQuery 하고 그 결과물은 rs(resultset)에 담겠다
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			while(rs.next()) { // 조회된거 1개니까 1바퀴 돌고 진행되지 않아요!(셀렉 잘못하면 맨 마지막만 뜸
				//rs.next() 값이 있는지 확인 불리언 타입?????????
				row = new HashMap<>(); // 하나라도 있으면  뉴해쉬맵이 되는데 없으면 널이 됨!
				for(int i = 1; i<= columnCount; i++) {
					String key = rsmd.getColumnLabel(i); // 키는 컬럼명 메타데이터에서 가져와요
					// getColumnName vs getColumnLabel
					// getColumnName : 원본컬럼명을 가져옴
					// getColumnLabel : as로 선어된 별명을 가져옴, 없으면 원본컬럼명
					Object value = rs.getObject(i); // 값
					row.put(key, value); //getColumnLabel 컬럼명 가져오고 getColumnLabel 값 가져오고
				}
					// 이런 결과! {DATETIME=2022-08-05 16:36:53.0, WRITER=홍길동, TITLE=안녕하세요, CONTENT=안녕안녕, BOARD_NUMBER=1}
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {  rs.close();  } catch (Exception e) { }
			if(ps != null) try {  ps.close();  } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}
		
		return row;
		
	}
	
	
	//Map<String, Object> selectOne(String sql) //Map<컬럼명, 밸류> >> 결국 row 한줄임
	public Map<String, Object> selectOne(String sql){ // 이 쿼리를 날렸을때 한줄만 필요 리스트 말고
		// sql => "SELECT * FROM JAVA_BOARD 
		//          WHERE BOARD_NUMBER=(SELECT MAX(BOARD_NUMBER) FROM JAVA_BOARD)" // 파라미터 ? 안해도 됨!
		// sql => "SELECT * FROM MEMBER MEM_ID='a001' AND MEM_PASS='123'" // 아이디 비번 느낌?
		
		Map<String, Object> row = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			while(rs.next()) { // 조회된거 1개니까 1바퀴 돌고 진행되지 않아요!(셀렉 잘못하면 맨 마지막만 뜸
				row = new HashMap<>();
				for(int i = 1; i<= columnCount; i++) {
					String key = rsmd.getColumnLabel(i); // 키는 컬럼명 메타데이터에서 가져와요
					// getColumnName vs getColumnLabel
					// getColumnName : 원본컬럼명을 가져옴
					// getColumnLabel : as로 선어된 별명을 가져옴, 없으면 원본컬럼명
					Object value = rs.getObject(i); // 값
					row.put(key, value); //getColumnLabel 컬럼명 가져오고 getColumnLabel 값 가져오고
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {  rs.close();  } catch (Exception e) { }
			if(ps != null) try {  ps.close();  } catch (Exception e) { }
			if(conn != null) try { conn.close(); } catch (Exception e) { }
		}
		
		return row;
		
	}
	
	
}






