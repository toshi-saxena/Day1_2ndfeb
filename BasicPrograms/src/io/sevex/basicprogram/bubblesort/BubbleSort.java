package io.sevex.basicprogram.bubblesort;

public class BubbleSort {
	public static void main(String[] args) {
		
	
	int arr[]= {45,556,87,9874,2,456,3};
	int n,temp;
	System.out.println("Without Sorting:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		
	}
	System.out.println();
	System.out.println("After Sorting");
	 n=arr.length;
	 for(int i=0;i<n;i++) {
		 for(int j=1;j<n-i;j++) {
			 if(arr[j-1]>arr[j]) {
				 temp=arr[j-1];
				 arr[j-1]=arr[j];
				 arr[j]=temp;
			 }
		 }
	 }
	 
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
		 
	 }
	
	
	
	
	
	
	}

}
