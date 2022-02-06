package io.sevenx.basicprograms.rotation;

public class LeftRotaion {
	public static void main(String[] args) {
		int n=1;
		int [] arr= new int [] {7,1,2,3,4,5,6};
		
		System.out.println("Original array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i =0;i<n;i++) {
			int first=0,j;
			first=arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
				
			}
			arr[j]=first;
				
			}
		System.out.println();
		System.out.println("Array After rotation");
		
		for( int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		
		}
		
	}

}
