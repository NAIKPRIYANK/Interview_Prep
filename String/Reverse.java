package StringQuestions;

//1. How do you reverse a string in Java?
//There is no reverse() utility method in the String class. However, you can create a character array from the string and then iterate it from the end to the start. You can append the characters to a string builder and finally return the reversed string.
//
//The following example code shows one way to reverse a string:

public class Reverse {

	public static void main(String[] args) {
		String str="123";
		System.out.println(Rev(str));

	}
	public static String Rev(String in) {
		if(in==null) {
			throw new IllegalArgumentException("Input is not valid");
			
			
		}
		StringBuilder out = new StringBuilder();
		char [] ch = in.toCharArray();
		for(int i= ch.length-1;i>=0;i--) 
			out.append(ch[i]);
		return out.toString();
		
	}

}
