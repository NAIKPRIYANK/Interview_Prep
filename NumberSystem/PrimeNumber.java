package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int temp=0;
		int num=sc.nextInt();
		
		for(int i=2;i<num;i++){
			if(num%i==0) {
				temp=temp+1;
			}
			
		}
		if(temp>0) {
			System.out.println("Number is not a prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}

	}

}
