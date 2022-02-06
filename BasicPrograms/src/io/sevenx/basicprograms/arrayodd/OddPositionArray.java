package io.sevenx.basicprograms.arrayodd;

public class OddPositionArray {
	public static void main(String[] args) {
		int arr[]= {1,2,5,4,8,9};
		System.out.println("Elemnts at odd position");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
