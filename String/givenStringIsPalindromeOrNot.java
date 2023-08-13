package stringBasicProgram;
//  public class givenStringIsPalindromeOrNot{
//	  public static void main(String[] args) {
//		  String str="MadaM";
//		  String str2="";
//			for(int i=str.length() - 1;i >= 0; i--) {
//				str2+=str.charAt(i);
//				
//			}
//			if(str.equals(str2)) {
////				return str1+" is a palindrome";
//				System.out.println("Is a palindrome");
//				
//			}else {
////				return str1+" is a not a palindrome";
//				System.out.println("Not a palindromme");
//			}
//	}
//  }





import java.util.Scanner;

public class givenStringIsPalindromeOrNot {
//	static boolean isPalindrome(String str) {
	static String isPalindrome(String str) {
		
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
			
		}
		if(str.equals(str2)) {
			return str+" is a palindrome";
//			return true;
			
		}else {
			return str+" is a not a palindrome";
//			return false;
		}
		
	}


	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		System.out.println(isPalindrome(str));
	 }
}
		
//        String str = "level";
//        if (str.equals(str2)) {
//            System.out.println(str + " is a palindrome.");
//        } else {
//            System.out.println(str + " is not a palindrome.");
//        }
//    }
//}

//
//    public static boolean isPalindrome(String str) {
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        if (str.equals(reversed)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

