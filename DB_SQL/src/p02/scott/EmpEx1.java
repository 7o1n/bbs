package p02.scott;
// SCOTT DB에 있는 EMP테이블 데이터를 자바에서 출력하기
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmpEx1 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			conn = DriverManager.getConnection(url, "scott", "scott");
			stmt = conn.createStatement();
			String query = "select * from emp";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String mgr = rs.getString(4);
				String hiredate = rs.getString(5);
				String sal = rs.getString(6);
				String comm = rs.getString(7);
				String deptno = rs.getString(8);
				System.out.println(empno+" : "+ename+" : "+job+" : "+mgr+" : "
									+hiredate+" : "+sal+" : "+comm+" : "+deptno);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없음:: 해당 클래스를 찾을수 없습니다.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
        System.out.println("정상종료");
        try {
			conn.close();
		} catch (SQLException e) {
			
		}
	}

}
