//Written by Sanai Ferguson
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		//Introduces the name of the program
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("");
		Scanner k = new Scanner(System.in);
		
		//Enters the length and width of the matrix
		System.out.println("Please enter the length and width of the first matrix");
		int length = k.nextInt();
		int width = k.nextInt();
		//Creates the matrix
		int[][] matrix1 = new int[length][width];
		int[][] matrix2 = new int[length][width];
		int[][] SumMatrix = new int[length][width];
		
		//Enters the values of the 1st matrix
		System.out.println("Enter the  value at index 0");
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < width; j++)
			{
				System.out.print(j);
				matrix1[i][j] = k.nextInt();
			}
		}
		//Enters the values of the 2nd matrix
		System.out.println("Please enter the length and width of the second matrix");
		int length1 = k.nextInt();
		int width1 = k.nextInt();
		
		System.out.println("Enter the value at index 0");
		for(int i = 0; i < length1;i++)
		{
			for(int j = 0; j < width1; j++)
			{
				System.out.print(j);
				matrix2[i][j] = k.nextInt();
			}
		}
		//Adds the matrices
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < width; j++)
			{
				SumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(SumMatrix[i][j] + " ");
			}
		}
		
		
		
		
		

	}

}
