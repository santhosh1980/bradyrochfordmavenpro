package Tuto;

public class myConstructor {
	
	int modelyear;
	
	String modelname;
	
	public myConstructor(int year, String name){
		
		modelyear=year;
		
		 modelname = name;
		
		
	}
	
	public static void main(String[] args) {
		
		myConstructor obj1 = new myConstructor(2000, "william");
		System.out.println(obj1.modelyear);
		System.out.println(obj1.modelname);
	}
}
