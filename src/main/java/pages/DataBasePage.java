package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasePage {
	Connection connection = null;
	 Statement statement= null;
	ResultSet resultSet= null;
	String columnValue;
	public String getData(String ColumnName) {
		
		// Setting properties for MySql
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl="jdbc:mysql://127.0.0.1:3306/july2021";
			String sqlUserName="root";
			String sqlPassword="root";
			String query="select * from users;";
			
			// Create connection to local database
			
			 connection = DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassword);
			 //empowering the connection referance variable to execute query
			 statement = connection.createStatement();
			 //Delivering the query
			 
			 resultSet=statement.executeQuery(query);
			 
			 while(resultSet.next()) {
				  columnValue = resultSet.getString(ColumnName);
				  return columnValue;
			 }
			 
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			if(connection !=null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
		
		return columnValue;
		
		
		
	}
	
}
