package io.sevenx.basicprograms.fibonacci;

public class FibonacciMain {
	public static void main(String[] args){
		int n1=0;
		int n2=1,n3;
		int count=0;
		int num=10;
		System.out.print(n1+" "+n2);
		while( count < num  ) {
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
			count=count+1;
		}
		
				
		
	}

}
