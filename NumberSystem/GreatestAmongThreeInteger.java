package NumberSystem;
import java.util.Scanner;

public class GreatestAmongThreeInteger {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int a= sc.nextInt();
		
		System.out.println("Enter a Second number: ");
		int b= sc.nextInt();
		
		System.out.println("Enter a Third number: ");
		int c= sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a:Greater is : "+a);
			
		}else if(b>=a && b>=c) {
			System.out.println("b:Greater is : "+b);
		}
		else if(c>=a && c>=b) {
			System.out.println("c:Greater is : "+c);
		}
		sc.close();
		
	}
	


}
