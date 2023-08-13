package stringBasicProgram;

public class reversingAString {
	static String ReverseStr(String str) {
		String str2=" ";
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
		}
		return str2;
	}

	public static void main(String[] args) {
		
		String str="pwJava";
		
		String reverse=ReverseStr(str);
		System.out.println(reverse);
		

	}

}
