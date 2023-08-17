package NumberSystem;

//appraoch 1
//public class Fibonacci {
//	
//	public static int Fibona(int no) {
//		if(no<=1) 
//			return no;
//		
//		return Fibona(no-1) + Fibona(no-2);
//		
//		
//	}
//
//	public static void main(String[] args) {
//		int sl=10;
//		System.out.println("A fibonacci sequence of "+ sl+" numbers: ");
//		
//		for(int i =0;i<sl;i++) {
//			System.out.print(Fibona(i)+ " ");
//		}
//
//	}
//
//}




//Approch 2

//public class Fibonacci {
//
//	public static void printFibonacciSequence(int count) {
//		int a = 0;
//		int b = 1;
//		int c = 1;
//
//		for (int i = 1; i <= count; i++) {
//			System.out.print(a + ", ");
//
//            a = b;
//			b = c;
//			c = a + b;
//		}
//	}
//
//	public static void main(String[] args) {
//    	printFibonacciSequence(10);
//	}
//
//}


//Approach 3
 public class Fibonacci{
	 public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i =0 ; i<10;i++) {
			if(i<=1) {
				arr[i]=i;
				
			}
			else if(i>1) {
				int x=arr[i-1]+arr[i-2];
				arr[i]=x;
				
			}
			System.out.print(arr[i]+" ");
		}
	}
 }
