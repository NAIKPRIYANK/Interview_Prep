package LogicalProgram;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no=sc.nextInt();
		int temp=no;
		int reverse=0,reminder;
		for(int i = 1;no!=0;no/=10) {
			reminder=no%10;
			reverse=(10*reverse)+reminder;
		}
		if(temp==reverse) {
			System.out.println("The NUmber is Pallindrome");
		}
		else {
			System.out.println("Number is not a Pallindrome");
		}
		
		

	}

}
