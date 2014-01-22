package Database;

import java.sql.*;

public class query {
	protected Connection conn = null;
	protected String Driver = "jdbc:mysql://localhost:3306/TalkO?useUnicode=true&characterEncoding=euckr";
	protected String User = "root";
	protected String Pass = "apmsetup";		
	protected ResultSet rs;
	protected int row;
	//public static void main(String[] args) {}
	
	public void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL 접속에 성공하였습니다!\n");
		} catch (SQLException e) {
			System.out.println("접속 실패 : " + e);
		} catch (Exception ex) {
			System.out.println("예외 발생 : " + ex);
		} finally {
			if (conn != null) {
				try{
					conn.close();
					System.out.println("MySQL 연결 중지!");
				} catch (SQLException e) {
					System.out.println("예외 발생 : " + e);
				}
			}
		}
	}
}
