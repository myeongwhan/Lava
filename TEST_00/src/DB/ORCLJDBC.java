package DB;

/**
 * 이 클래스는 데이터베이스 작업을 위한 JDBC를 처리할 때, 필요한 공통적인 기능을 제공하기 위한 클래스
 * @author 	이명환
 * @since 	2020.04.03
 * @version v.1.0
 * @see		java.sql.*
 * 
 */
import java.sql.*;
public class ORCLJDBC {
	private Connection con = null;
	/*
	 	이 클래스를 new 시키는 순간
	 	기본적으로 가장 필요한 드라이버 로딩과 커넥션 얻는 작업을 동시에 실행할 것이다
	 */

	public ORCLJDBC() {
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 커넥션 얻어오는 함수
	public Connection getCon() {
		return getCon("hello", "hello");
	}
	
	public Connection getCon(String user, String password) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.con = con;
		return con;
	}
	
	// Statement 얻어오는 함수
	public Statement getSTMT() {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
											ResultSet.CONCUR_READ_ONLY
											);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	// PreparedStatement 얻어오는 함수
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
												ResultSet.CONCUR_READ_ONLY
												);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	// 필요없을 경우 대신 닫아주는 함수
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();
			} else if(o instanceof Statement) {
				((Statement) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
