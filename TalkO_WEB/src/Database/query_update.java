package Database;

import java.sql.*;

public class query_update extends query{	
	private int row;
	
	//public static void main(String[] args) {}
	
	public void create_table(String query){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL 접속에 성공하였습니다!\n");
			
			PreparedStatement sql = conn.prepareStatement(query);
			row = sql.executeUpdate();
			
			System.out.println(row + "개의 테이블이 생성 되었습니다.");
			
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
	
	public void insert_table(String query){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL 접속에 성공하였습니다!\n");
			
			PreparedStatement sql = conn.prepareStatement(query);
			row = sql.executeUpdate();
			
			System.out.println(row + "개의 데이터가 테이블에 추가 되었습니다.");
			
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
	
	public void delete_table(String query){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL 접속에 성공하였습니다!\n");
			
			PreparedStatement sql = conn.prepareStatement(query);
			row = sql.executeUpdate();
			System.out.println(row + "개의 데이터가 테이블에서 제거 되었습니다.");
			
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
