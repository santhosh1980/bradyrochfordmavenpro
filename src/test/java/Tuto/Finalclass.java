package Tuto;

public class Finalclass {
	
	//declaring final variable, reassigning any other value to age variable not possible
	
	final int age1 = 42;
	
	void display() {
		
		int age2 = 25;
		
		System.out.println("The age is:"+age1);
		
		System.out.println("The age is:"+age2);
		
		
	}
	
	public static void main(String[] args) {
		
		Finalclass ob1 = new Finalclass();
		
		ob1.display();
	}

}
