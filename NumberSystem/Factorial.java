package LogicalProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i =num;i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
