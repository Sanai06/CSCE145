//Written by Sanai Ferguson
import java.util.Scanner;

public class HorizontalTriangle {

	public static void main(String[] args) {
		//The user enters a number to build the triangle
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle: ");
		Scanner k = new Scanner(System.in);
		
		int num = k.nextInt();
		//The asterisks starts at 1 then it increases to the number the user puts in
		for (int i = 1; i <= num; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			//Prints out the asterisks
			System.out.println();
		}
		//Code to decrease the triangle once it reaches the limit of the number the user puts in
		for (int i = num - 1; i > 0; i--)
		{
			for (int j = 0 ; j < i; j++)
			{
				System.out.print("*");
			}
			//Prints out the asterisks
			System.out.println();
		}
		//System stops
		System.out.println("Done!");

}

}
