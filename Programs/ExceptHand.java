package Programs;

public class ExceptHand {

	public static void main(String[] args) {
		
		int k = 10;
		int n = 0;
		int nums[] = new int[5];
		
		
		try {
			
			n = 20/k;
			System.out.println(nums[1]);
			System.out.println(nums[5]);
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Arihtmetic error..."); // exception handling
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array error..." + e);
		}
		
		catch(Exception e) {					//	multiple catch
			
			System.out.println("Ending...");
		}
		
		System.out.println(n);
		System.out.println("bye");
		
	
	
	}
	}
		
	
