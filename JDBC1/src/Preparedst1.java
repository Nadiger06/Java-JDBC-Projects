import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Preparedst1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","sarvesh06"); 
			int eno,sl;
			String nm;
			PreparedStatement ps1;
//			while(true)
//			{
//			System.out.println("Enter New Empno:");
//			Scanner scan=new Scanner(System.in);
//			eno=Integer.parseInt(scan.nextLine());
//			System.out.println("Enter New Emp name:");
//			nm=scan.nextLine();
//			System.out.println("Enter salary:");
//			sl=Integer.parseInt(scan.nextLine());
//			String sql="select empno as nor from emp where empno=?";// 7788
//			ps1=con.prepareStatement(sql);
//			ps1.setInt(1,eno);
//			ResultSet rs=ps1.executeQuery();
//			boolean rf=false;		
//			while(rs.next())
//			{
//				rf=true;
//			}
//			if(rf==true)
//			{
//				System.out.println("Empno is already existing.Please enter new.");
//				continue;
//				}
//			else
//				break;			
//			}				
//			ps1=con.prepareStatement("insert into emp(empno,ename,sal) values(?,?,?)");
//			ps1.setInt(1, eno);
//			ps1.setString(2, nm);
//			ps1.setInt(3, sl);
//			//ps1=con.prepareStatement("insert into emp(empno,ename,sal,deptno) values(?,?,?,?)");
//			
//			int nor=ps1.executeUpdate();
			
			
			//System.out.println(nor + " Record Addedd Succ");
			System.out.println("Enter New Empno:");
			Scanner scan=new Scanner(System.in);
		    eno=Integer.parseInt(scan.nextLine());
			ps1=con.prepareStatement("delete from emp where  empno=?");
			
			ps1.setInt(1, eno);
			int i=ps1.executeUpdate();
			System.out.println(i + " Record deleted Succ");
			
			
		
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
