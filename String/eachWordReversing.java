package stringBasicProgram;

public class eachWordReversing {
	static String eachWordR(String Str) {
		String str1=" ";
		String arr[]=Str.split(" ");
		for (String elem:arr) {
			for(int i=elem.length()-1;i>=0;i--) {
				str1=str1+elem.charAt(i);
				
				}
			str1=str1+" ";
		}
		return str1;
	}

	public static void main(String[] args) {
		String str0="Pwskill Java";
		System.out.println("The Reversing Of each word is: "+eachWordR(str0));
		

	}

}
