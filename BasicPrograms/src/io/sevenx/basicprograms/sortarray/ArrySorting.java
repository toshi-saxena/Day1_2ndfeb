package io.sevenx.basicprograms.sortarray;

import java.util.Arrays;

public class ArrySorting {
	public static void main(String[] args) {
		int [] arr = new int[] {2,6,9,1,0,3,4,6};
		
		
		/*Using Sort Method*/
		Arrays.sort(arr);
		System.out.println("With Inbuilt Function");
		
		for (int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		/*Without Inbuilt Method*/
		System.out.println("Sorting with for loops");
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}	
	

}
