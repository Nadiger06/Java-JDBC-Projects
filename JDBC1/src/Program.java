import java.sql.*;

public class Program {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test321","root","sarvesh06");  
			 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select  from emp");  
			while(rs.next())  
			System.out.println(rs.getString(1));  
			con.close(); 
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}