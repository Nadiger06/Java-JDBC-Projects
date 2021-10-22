import java.awt.List;
import java.util.*;
public class ArrayList1 
{
	static Scanner scan=new Scanner(System.in);
	static Employee e1;
	static ArrayList<Employee> arr =new ArrayList<Employee>();
	public static void main(String args[])
	{
	
		while(true)
		{
			
			System.out.println("SELECT\n");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Salary by Employee Number");
			System.out.println("3.Display employee details for the given Employee Number");
			System.out.println("4.Display All");
			System.out.println("0.Exit");
			System.out.println();
		
			System.out.println("Enter your choice:");
			int ch= Integer.parseInt(scan.nextLine());
			switch(ch)
			{
				case 1: addEmployee();
							break;
							
				case 2: updateSalbyEmpno();
							break; 
							
				case 3: showByEmpno();
							break;
							
				case 4: showAll();
							break;
							
				case 0:
				default:
						System.exit(0);
							break;
			}
		}

	}
	public static void addEmployee() 
	{	
		System.out.println("\nEnter empno:");
		int en=Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter name");
		String nm=scan.nextLine();
		
		System.out.println("Enter Department");
		String dpt=scan.nextLine();
		
		System.out.println("Enter salary");
		float sal=Float.parseFloat(scan.nextLine());
		
		e1=new Employee(en,nm,dpt,sal); 
		
		boolean flag=false;
		for(Employee i:arr)
		{
			if(i.empno()==en)
			{
				flag=true;
				break;
			}
		}

		if(flag==false)
		{
			Employee e1=new Employee(en,nm,dpt,sal);
			arr.add(e1);
			System.out.println("\nAdded successfully\n");
			
		}
		else
		System.out.println("\nDuplicate empno.Not allowed\n");
	

	}
		

	public static void updateSalbyEmpno() 
	{
		System.out.println("\nEnter the employee number to update the salary:\n");
		int en=Integer.parseInt(scan.nextLine());
		boolean flag=false;
		
		for(Employee i:arr)
		{
			if(i.empno()==en)
			{
				flag=true;
				System.out.println("\nEnter the new salary amount\n");
				int esal=Integer.parseInt(scan.nextLine());
				i.sal(esal);
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Sucessfully updated the Salary for the employee"+en);
		}
		else
		{
			System.out.println("Employee number not exist");
		}
		
	}

	public static void showByEmpno()
	{
		System.out.println("Enter the Employee number");
		int en=Integer.parseInt(scan.nextLine());
		int flag=0;
		for(Employee i:arr)
		{
			if(i.empno()==en)
			{
				System.out.println("");
			    System.out.println(i.empno()+"\t"+i.ename()+"\t"+i.dept()+"\tRs."+i.sal());
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println(" Employee number Invalid");
		}
	}

	public static void showAll()
	{
		for(Employee i:arr)
		{ 
			System.out.println("");
		    System.out.println(i.empno()+"\t"+i.ename()+"\t"+i.dept()+"\tRs."+i.sal());  
		}  
		
	}
}

