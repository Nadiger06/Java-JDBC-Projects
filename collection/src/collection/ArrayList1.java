package collection;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(123);
		arr.add("java");
		arr.add(45.56f);
		arr.add(new Integer(456));

	}

}
class Employee
{
	int empno;
	String ename;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}