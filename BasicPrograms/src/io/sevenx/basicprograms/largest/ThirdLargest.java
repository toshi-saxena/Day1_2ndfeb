package io.sevenx.basicprograms.largest;

public class ThirdLargest {
	public static void main(String[] args) {
		int arr[]= {1,24,45,56,78,98};   
		int temp;
		int total=arr.length;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		System.out.print("The third largest among all the elemnet in the array is: "+arr[total-3]);
	}

}
