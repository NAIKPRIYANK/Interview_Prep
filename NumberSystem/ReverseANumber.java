package NumberSystem;

import java.util.Scanner;

public class ReverseANumber

{

	public static void main(String[] args)

	{

		//scanner declaration

		Scanner sc = new Scanner(System.in);

		//input 

		System.out.print("Enter a number : ");

		int number = sc.nextInt();

		System.out.print("Reverse of "+number+" is ");



		String s = "";

		while(number != 0)

		{

			int pick_last = number % 10;

			//use function to convert pick_last from integer to string

			s = s + Integer.toString(pick_last);

			number = number / 10;

		}

		//display the reversed number

		System.out.print(s);

		//closing scanner class(not compulsory, but good practice)

		sc.close();

	}

}