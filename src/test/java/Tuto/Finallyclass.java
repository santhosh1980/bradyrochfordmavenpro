package Tuto;

public class Finallyclass {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("Inside try block");
			
					
			int data = 25/0;
			
			System.out.println("The result is:" + data);
			
		} 
		//divide by zero exception handled
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception handled");
			
			System.out.println(e.getMessage());
		}
		//Finally block executes regardless of exception
		finally {
			
			System.out.println("Finally block always executed");
			
		}
		
		System.out.println("Rest of the code");
	}

}
