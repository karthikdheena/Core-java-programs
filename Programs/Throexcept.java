package Programs;

public class Throexcept {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		try {
			
			 j = 18/i;
			 if(j == 0) {
				 
				 throw new ArithmeticException();
			 }
		}
		
		catch(ArithmeticException e) {
			
			j = 18/1;
			System.out.println("Wrong.."+e);
			
			
		}
		
		System.out.println(j);
		System.out.println("thanks");

	}

}
