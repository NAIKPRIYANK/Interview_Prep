package StringQuestions;

public class DuplicateChara {

	public static void main(String[] args) {
		String str="Programming";
		
		//Approach -1
		
		StringBuilder sb1= new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
		//Approach -2
		
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			if(idx==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		
		//Approach -3
		char[] arr = str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i =0;i<arr.length;i++) {
			boolean repeted= false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeted=true;
					break;
				}
			}
			if(!repeted) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);
		
		
		

	}

}
