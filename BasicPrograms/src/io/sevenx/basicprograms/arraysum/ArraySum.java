package io.sevenx.basicprograms.arraysum;

public class ArraySum {
	public static void main(String[] args) {
		int arr[]= {1,2,5,4,7,8,9,66};
		int sum=0;
		System.out.println("Array sum");
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			int temp=sum;
			System.out.println(sum + "+"+arr[i]);
		}
		System.out.println("Sum of all array is: "+sum);
	}

}
