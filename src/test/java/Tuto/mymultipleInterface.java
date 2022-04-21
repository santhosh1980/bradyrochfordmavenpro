package Tuto;

//firstinterface
interface firstinterface{ 
	
	//interface method, does not have body
	public void firstmethod(); 
	
}

//secondinterface
interface secondinterface{ 
	
	//interface method, does not have body
	public void secondmethod(); 
	
}

//demomultiinterface implements both firstinterface and secondinterface
class demomultiinterface implements firstinterface, secondinterface{
	
	@Override
	public void firstmethod() {
		System.out.println("first method");
		
	}
	
	@Override
	public void secondmethod() {
		System.out.println("second method");
		
	}
	
			
	
	
}

public class mymultipleInterface {
	
	
	
	public static void main(String[] args) {
		
		demomultiinterface obj1 = new demomultiinterface();
		obj1.firstmethod();
		obj1.secondmethod();
		
	}
}
