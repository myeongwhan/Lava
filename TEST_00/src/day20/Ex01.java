package day20;

/*
 	���� 1]
 		emp ���̺��� ��� �� ����̸��� 'SMITH'�� �����
 		�����ȣ, �̸�, �޿�, �μ���ȣ, �μ��̸�, �μ���ġ
 		�� ������ �����ּ���
 */
import java.util.*;
import java.sql.*;
import javax.swing.*;
public class Ex01 {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public Ex01() {
		dbInit();
		
		String sql = "SELECT empno, ename, sal, deptno, dname, loc FROM emp, dept WHERE ename = ?";
		
	}
	
	public void dbInit() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "SCOTT";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
