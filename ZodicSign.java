/*
 * Written by Sanai Ferguson
 */
import java.util.Scanner;
public class ZodicSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The user enters their birthday followed by entering the month and day with number
		System.out.println("What is your zodiac sign?");
		System.out.println("Enter your birthday -- Month followed by Day as numbers");
		Scanner keyboard = new Scanner(System.in);
		
		
		
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		
		//Whole numbers for month 1-12
		if(month >= 1 && month <= 12) 
		{
			if(day<=31);
		}
		
		//When a person types in a number for the month that's less than 0, it prints out Invalid Month
		if(month <=0 || month > 12)
		{
			System.out.println("Invalid Month!");
		}
		//When a person types in a day that's less than 0, it will print out Invalid Day
		else if(day <0 || day >31)
		{
			System.out.println("Invalid Day!");
		}
		
		if(month == 1 && day >= 20 || month==2 && day <=18)
		{
			System.out.println("You are a Aquarius!");
		}
		else if(month == 2 && day>= 19 || month==3 && day<=20)
		{
			System.out.println("You are a Pisces!");
		}
		else if(month==3 && day >= 21 || month==4 && day<=19)
		{
			System.out.println("You are a Aries!");
		}
		else if(month==4 && day >= 20 || month==5 && day<=20)
		{
			System.out.println("You are a Taurus!");
		}
		else if(month==5 && day >= 21 || month==6 && day <=20)
		{
			System.out.println("You are a Gemini!");
		}
		else if(month==6 && day >= 21 || month==7 && day <=22)
		{
			System.out.println("You are a Cancer!");
		}
		else if (month==7 && day >=23 || month==8 && day <=22)
		{
			System.out.println("You are a Leo!");
		}
		else if(month==8 && day >=23 || month==9 && day<=22)
		{
			System.out.println("You are a Virgo!");
		}
		//This will show that if the day is greater than 30, it would print out Invalid Day
		else if(day > 30)
		{
			System.out.println("Invalid Day!");
		}
		else if(month==9 && day >=23 || month==10 && day<=22)
		{
			System.out.println("You are a Libra!");
		}
		else if(month==10 && day >=23 || month==11 && day <=21)
		{
			System.out.println("You are a Scorpio!");
		}
		else if(month==11 && day >=22 || month==12 && day <=21)
		{
			System.out.println("You are a Sagittarius!");
		}
		else if(day <0)
		{
			System.out.println("Invalid Day");
		}
		else if(month== 12 && day >= 22 || month==1 && day <=19)
		{
			System.out.println("You are a Capricorn!");
		}
	}
}	