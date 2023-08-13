package LogicalProgram;
import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	
	for(int i=num;num!=0;num/=10) {
		int rem=num%10;
		int fact=1;
		
		
		for(int j=rem;j>0;j--) {
			fact=fact*j;
			
			
		}
		sum=sum+fact;
		
		
		
	}
	if(sum==temp) {
		System.out.println(temp+" is a strong number ");
	}else {
		System.out.println(temp+" is a not a strong number");
	}
	
	}
	
}
