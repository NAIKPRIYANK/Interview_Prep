package stringBasicProgram;

public class reverseMultiWordString {
	static String Multiword(String str) {
		String str2=" ";
		for(int i = str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
			
		}
		return str2;
	}
	

	public static void main(String[] args) {
		String str1= "Pwskill java";
		String mulWordR=Multiword(str1);
		System.out.println(mulWordR);
		

	}

}
