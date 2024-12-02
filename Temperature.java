//Written by Sanai Ferguson
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		//Introduces the title of the program
		System.out.println("Welcome to the below average temperature tester program.");
		
		//Makes the numbers into decimals
		double[] temperatures = new double[10];
		double total = 0;
		
		//Type in a temperature for the days leading up to 10
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Please enter the temperature for Day " + (i + 1) + "");
			temperatures[i] = k.nextDouble();
			total += temperatures[i];
		}
		//Calculates the average of all 10 temperatures from each day
		double average = total / 10;
		System.out.println("The average temperature was: " + average);
		
		//Shows which days are below the average temperature
		System.out.println("The days that were below average were: ");
		int countBelowAverage = 0;
		
		//Prints out the days less then 10
		for(int i = 0; i < 10; i++)
		{	//Shows the temperatures that are below average
			if (temperatures[i] < average)
			{
				System.out.println("Day " +  (i + 1)  + temperatures[i]);
				countBelowAverage++;
			}
		}
				
	}

}
