package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {
	
	
	
	
	public static String getdataFromDataBase(String columnName) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String aqlURL="jdbc:mysql://localhost:3306/techfios2020";
		String userName= "root";
		String password= "root";
		String query = "select * from techfios2020";
				
		Connection con = DriverManager.getConnection(aqlURL, userName, password);
		
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next()) {
			
			
			return rs.getString(columnName);
		}
		
		return rs.getString(columnName);
		
	}
	
	
	

}
