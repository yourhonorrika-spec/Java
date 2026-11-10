package Ch28;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcFrame {

	private static final String url="jdbc:mysql://localhost:3306/Authors";
	private static final String un="root";
	private static final String pw="";
	
	public static void main(String[] args) {
		try {
			JdbcRowSet rs= RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl(url);
			rs.setUsername(un);
			rs.setPassword(pw);
			rs.setCommand("Select * from Authors");
			rs.execute();
			
			ResultSetMetaData md= rs.getMetaData();
			final int NO_COL= md.getColumnCount();
			System.out.println("Authors table of Books database\n");
			for(int i=1; i<=NO_COL;i++) {
				System.out.printf("%-8s\t",md.getColumnName(i));
			}System.out.println();
			
			while(rs.next())
			{
				for(int i=1; i<=NO_COL;i++) {
					System.out.printf("%-8s\t",rs.getObject(i));
				}System.out.println();			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
