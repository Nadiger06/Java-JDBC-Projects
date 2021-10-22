
public class MyClass {

	public static void main(String[] args) {
		int[] arr=new int[]{8,4,1,7,3,0,4,7};
		System.out.println("Orginal array");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted array");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			

	}

}
}
