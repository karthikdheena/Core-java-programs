package Programs;

public class ExcepThrow {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		try {
			
			j = 18/i;
			
			if(j==0) {
				
				throw new ArithmeticException("Not valid");
			}
			
		}
		
		catch(ArithmeticException e) {
			
			j = 18/1;
			System.out.println("ArithmeticError");
			
		}
		catch(Exception e) {
			
			System.out.println("Enter valid digit");
		}
		
		System.out.println(j);
		System.out.println("Thank you");
		

	}

}
