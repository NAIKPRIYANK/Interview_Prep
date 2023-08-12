package StringQuestions;
class Logic{
	public static void Reverse(String str) {
		//Approach 1
//		char[] ch=str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}
		
		//Approach 2
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
		
		//Approach 3
//		StringBuffer sb= new StringBuffer(str);
//		System.out.println(sb.reverse());
		
		//Approch 4
		StringBuilder sbl= new StringBuilder(str);
		System.out.println(sbl.reverse());
		
		
		
	}
}

public class reverseString {

	public static void main(String[] args) {
		String str ="Hello";
//		Logic l=new Logic();
		Logic.Reverse(str);
		

	}

}
