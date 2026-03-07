package Programs;

interface A1 {
	
	int add(int i , int j);
	
	
}
public class LambExp {

	public static void main(String[] args) {   // lambda expressions 
		
		A1 obj = (i , j) -> i+j;
		
		int Result = obj.add(10, 20);
		
		System.out.println(Result);
		
	}
	
}
