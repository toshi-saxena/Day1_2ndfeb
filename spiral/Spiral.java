package io.sevenx.basicprograms.spiral;

public class Spiral {
	public static void main(String[] args) {
		System.out.println("Spiral Pattern");
		System.out.println("***************************************");
		int n=6;
		int [] [] arr=new int [n][n];
		int current=1;
		int firstColoumn=0,lastColoumn=n-1,firstRow=0,lastRow=n-1;
		while(current<=(n*n)) 
		{
			for(int j= firstColoumn;j<=lastColoumn;j++)
			{
				arr[firstRow][j]=current++;
			}
			for(int j=firstRow+1;j<=lastRow;j++) 
			{
				arr[j][lastColoumn]=current++;
			}
			for (int j=lastColoumn-1;j>=firstColoumn;j--)
			{
				arr[lastRow][j]=current++;
			}
			for(int j=lastRow-1;j>=firstRow+1;j--) {
				arr[j][firstColoumn]=current++; 
			}
			
			firstColoumn++; firstRow++; lastColoumn--; lastRow--;
		}
		
		for(current=0;current<n;current++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[current][j]+" ");
				
			}
			System.out.println();
			}
		System.out.println("******************************************");
	}

}
