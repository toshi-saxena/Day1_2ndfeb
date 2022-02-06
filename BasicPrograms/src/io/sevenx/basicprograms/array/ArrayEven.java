package io.sevenx.basicprograms.array;

public class ArrayEven {
	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,4,5,6,7};
		for (int i=1;i<arr.length;i=i+2) {
			System.out.println(arr[i]+" Element at Even position");
			
		}
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+" Element at Odd position");
			}
			
		}
	}

}
