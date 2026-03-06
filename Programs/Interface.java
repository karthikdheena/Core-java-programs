package Programs;

interface A{
	
	int age = 12;
	String name = "karthik";
	
	void show();
	void config();
}						// interface 

class B implements A{
	
	public void show() {
		
		System.out.println("hello");
	}
	
	public void config() {
		
		System.out.println("Bye");
	}
}
public class Interface {

	public static void main(String[] args) {
		
		A obj = new B();
		
		obj.show();
		obj.config();
		
		System.out.println(A.age + " : " + A.name);		// variables inside interface are default final or static
	}

}
