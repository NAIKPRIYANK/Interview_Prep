package StringQuestions;

public class RemoveSpeciChara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="$%King&^Of$%Java";
		
		//Approach 1 (replaceAll() method)
		String PlainString=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(PlainString);
		

	}

}
