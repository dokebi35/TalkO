package Database;

import java.sql.*;

public class query_execute extends query{
	private ResultSet rs;
	//public static void main(String[] args) {}
	
	public void select_table(String query, int args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String[] array = new String[args];
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL 접속에 성공하였습니다!\n");
			
			PreparedStatement sql = conn.prepareStatement(query);
			rs = sql.executeQuery();
			
			while(rs.next()){
				for(int i=0; i<args; i++){
					array[i] = rs.getString(i+1);
					array[i] = rs.getString(i+1);
					array[i] = rs.getString(i+1);
					array[i] = rs.getString(i+1);
				}
			}
			
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
