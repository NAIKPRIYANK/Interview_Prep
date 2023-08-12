package StringQuestions;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str=" K ing o f jav  a";
		//str.trim()--> It is used for removing Leading and trailing WhiteSpaces
//		\\s--> is one of the unicode value which represents Single Space
		
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
