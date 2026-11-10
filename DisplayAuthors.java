package Ch28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//pg 1189 fig 28.23
public class DisplayAuthors {

	private final static String url= "jdbc:mysql://localhost:3306/Authors";
	private final static String userName= "root";
	private final static String password= "";
	
	public static void main(String[] args) {
		Connection c= null;
		Statement s= null;
		ResultSet r =null;
		
		try {
			c= DriverManager.getConnection(url,userName,password);
			s= c.createStatement();
			r= s.executeQuery("Select * from Authors");
			ResultSetMetaData md= r.getMetaData();
			final int NO_COL= md.getColumnCount();
			System.out.println("Authors table of Books database\n");

			for(int i=1; i<=NO_COL;i++) {
				System.out.printf("%-8s\t",md.getColumnName(i));
				
			}System.out.println();
			
			while(r.next())
			{
				for(int i=1; i<=NO_COL;i++) {
					System.out.printf("%-8s\t",r.getObject(i));
					
				}System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	finally {
		try {
	
			c.close();
			s.close();
			r.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}

}
