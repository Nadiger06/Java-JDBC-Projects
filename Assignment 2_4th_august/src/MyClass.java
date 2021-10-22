import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		int count=2;
		int k=5;
		for(int i=1;i<=5;i++){
			int t=i;
			System.out.print(t+" ");
			for(int j=k;j>1;j--){
				t=t*count;
				System.out.print(t+" ");
				

		}
		System.out.println();
		count=count+1;
		k=k-1;
	}
	}

}
