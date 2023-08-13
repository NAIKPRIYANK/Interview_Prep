package stringBasicProgram;

public class reversingWordFromString {
	static String wordReverse(String str) {
		String str2=" ";
		String sr[]=str.split(" ");
		
		for(int i=sr.length-1;i>=0;i--) {
			str2=str2+sr[i]+" ";
		}
		return str2;
	}

	public static void main(String[] args) {
		String str1="Pw Java";
		String WordReverse=wordReverse(str1);
		System.out.println("Word Reverse String is:  " +WordReverse);
		
		
		

	}

}
