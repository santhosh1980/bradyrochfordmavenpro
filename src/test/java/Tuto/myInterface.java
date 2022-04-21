package Tuto;

//interface
interface Animal{ 
	
	//interface method, does not have body
	public void sound(); 
	
	//interface method, does not have body
	public void sleep();
}

//pig implements animal interface
class pig implements Animal{
	
	@Override
	public void sound() {
		System.out.println("Wee Zee");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("Zzz");
		
	}
		
	
	
}
public class myInterface {
	
	
	
	public static void main(String[] args) {
		
		pig obj1 = new pig();
		obj1.sound();
		obj1.sleep();
		
	}
}
