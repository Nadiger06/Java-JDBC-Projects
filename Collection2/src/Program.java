import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String [] args)
	{
		Account a1=new Account(1001,"savings",2000);
		Account a2=new Account(1002,"savings",3000);
		Account a3=new Account(1003,"savings",4000);
		Account a4=new Account(1005,"savings",7000);
		Account a5=new Account(1006,"savings",9000);
	
		Customer c1=new Customer("9108345644","Bengaluru",560037,"abc");
		Customer c2=new Customer("9108345643","chennai",560036,"ab");
		Customer c3=new Customer("9108345645","Andra",560033,"ac");
		Customer c4=new Customer("9108345646","Delhi",560034,"abcd");
		
		Map<Account, Customer>mapAccCust=new HashMap<>();
		
		mapAccCust.put(a1, c3);
		mapAccCust.put(a5, c4);
		mapAccCust.put(a4, c1);
		mapAccCust.put(a2, c2);
		mapAccCust.put(a3, c4);
//		for(int i=0;i<3;i++){
//			
//		
//		
//		System.out.println("enter acc to be searched");
//		Scanner sc=new Scanner(System.in);
//		int accno=Integer.parseInt(sc.nextLine());
//		
//		
//		Account searchAcc=new Account(accno,null,0);
//		
//		
//		Customer cust=mapAccCust.get(searchAcc);
//		if(cust!=null){
//			System.out.println(cust.toString());
//		}
//		else{
//			System.err.println("Not found");
//		}
//		}
		System.out.println("---------------------------------");
		
		for(Map.Entry<Account,Customer>entry:mapAccCust.entrySet()){
			Account key=entry.getKey();
			Customer value=entry.getValue();
			
			System.out.println("Account:->"+key.toString());
			System.out.println("Customer:->"+value.toString());
			System.out.println("*****************");
			
			}
			
			
		
//		Map<Integer,Customer> map=new HashMap<>();
//		
//		map.put(1001, c1);
//		map.put(1002, c2);
//		map.put(1003, c3);
//		map.put(1005, c4);
//		map.put(1006, c4);
		
//		Customer c=map.get(1006);
//		if(c!=null)
//			System.out.println(c.toString());
//		else
//			System.out.println("Not exist");
	}
	
	}
