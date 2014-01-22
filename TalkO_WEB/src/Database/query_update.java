package Database;

import java.sql.*;

public class query_update extends query{	
	private int row;
	
	//public static void main(String[] args) {}
	
	public void create_table(String query){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL ���ӿ� �����Ͽ����ϴ�!\n");
			
			PreparedStatement sql = conn.prepareStatement(query);
			row = sql.executeUpdate();
			
			System.out.println(row + "���� ���̺��� ���� �Ǿ����ϴ�.");
			
		} catch (SQLException e) {
			System.out.println("���� ���� : " + e);
		} catch (Exception ex) {
			System.out.println("���� �߻� : " + ex);
		} finally {
			if (conn != null) {
				try{
					conn.close();
					System.out.println("MySQL ���� ����!");
				} catch (SQLException e) {
					System.out.println("���� �߻� : " + e);
				}
			}
		}
	}
	
	public void insert_table(String query){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL ���ӿ� �����Ͽ����ϴ�!\n");
			
			PreparedStatement sql = conn.prepareStatement(query);
			row = sql.executeUpdate();
			
			System.out.println(row + "���� �����Ͱ� ���̺� �߰� �Ǿ����ϴ�.");
			
		} catch (SQLException e) {
			System.out.println("���� ���� : " + e);
		} catch (Exception ex) {
			System.out.println("���� �߻� : " + ex);
		} finally {
			if (conn != null) {
				try{
					conn.close();
					System.out.println("MySQL ���� ����!");
				} catch (SQLException e) {
					System.out.println("���� �߻� : " + e);
				}
			}
		}
	}
	
	public void delete_table(String query){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Driver, User, Pass);
			System.out.print("MySQL ���ӿ� �����Ͽ����ϴ�!\n");
			
			PreparedStatement sql = conn.prepareStatement(query);
			row = sql.executeUpdate();
			System.out.println(row + "���� �����Ͱ� ���̺��� ���� �Ǿ����ϴ�.");
			
		} catch (SQLException e) {
			System.out.println("���� ���� : " + e);
		} catch (Exception ex) {
			System.out.println("���� �߻� : " + ex);
		} finally {
			if (conn != null) {
				try{
					conn.close();
					System.out.println("MySQL ���� ����!");
				} catch (SQLException e) {
					System.out.println("���� �߻� : " + e);
				}
			}
		}
	}
}
