import java.util.*;
public class Kaprekar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int N=n*n;
		int tn=n;
		int c=0;
		while(tn!=0){
			tn=tn/10;
			c++;
			
			
		}
		int q=(int)(N/Math.pow(10,c));
		int r=(int)(N%Math.pow(10,c));
		if(q+r==n)
			System.out.println("Its kaprekar");
		else
			System.out.println("Not kaprekar");
			
				
				
				
				
				
				
				
				
				
	}				
				

}
