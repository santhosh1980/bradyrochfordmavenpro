package Tuto;

class vehicle{
	
	protected String brand1="Ford";
	
	private String brand2 = "Maruthi";
	
	public void pub() {
		// TODO Auto-generated method stub
		System.out.println("Parent class");
		System.out.println(brand2);
	}
	
}

class mycar extends vehicle{
	
	public String model1="Era";
	
	
	
}

public class myInherita {
	
public static void main(String[] args) {
		
		mycar obj1 = new mycar();
		
		System.out.println(obj1.brand1);
		obj1.pub();
		System.out.println(obj1.model1);
	}
	
}
	
	
	

