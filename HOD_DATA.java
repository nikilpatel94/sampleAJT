import java.sql.*;
import java.util.Scanner;
import java.lang.*;
class HOD_DATA
{
	public static void main(String args[])
	{
		try
		{
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection con=DriverManager.getConnection("jdbc:odbc:HOD_DATA");
			Statement s =con.createStatement();
			Scanner ip=new Scanner(System.in);
			String query=ip.nextLine();
			s.execute(query);
			ResultSet rs=s.getResultSet();
			while(rs.next())
			{
				System.out.println("ID:"+rs.getString(1));
				System.out.println("ENAME:"+rs.getString(2));
				System.out.println("SALARY:"+rs.getString(3));
			}
			s.close();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}