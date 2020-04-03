package DB;

/**
 * �� Ŭ������ �����ͺ��̽� �۾��� ���� JDBC�� ó���� ��, �ʿ��� �������� ����� �����ϱ� ���� Ŭ����
 * @author 	�̸�ȯ
 * @since 	2020.04.03
 * @version v.1.0
 * @see		java.sql.*
 * 
 */
import java.sql.*;
public class ORCLJDBC {
	private Connection con = null;
	/*
	 	�� Ŭ������ new ��Ű�� ����
	 	�⺻������ ���� �ʿ��� ����̹� �ε��� Ŀ�ؼ� ��� �۾��� ���ÿ� ������ ���̴�
	 */

	public ORCLJDBC() {
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Ŀ�ؼ� ������ �Լ�
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
	
	// Statement ������ �Լ�
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
	
	// PreparedStatement ������ �Լ�
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
	
	// �ʿ���� ��� ��� �ݾ��ִ� �Լ�
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