package stringBasicProgram;
import java.util.Scanner;


public class LowerToUpperNUpperToLow {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your String");
		String str=sc.nextLine();
		System.out.println("Your String in lowercase/Uppercase");
		for( int i = 0;i<str.length();i++) {
			int ch=str.charAt(i);
			if(ch>64&& ch<91) {
				ch=ch+32;
				System.out.print((char)ch);
				
			}
			else if(ch>95&&ch<123) {
				ch=ch-32;
				System.out.print((char)ch);
				
			}
			if(ch==32) {
				System.out.print(" ");
			}
		}
		System.out.println();
		

	}

}
