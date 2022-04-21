package Tuto;

class myanimal{
	
	public void animalsound() {
		// TODO Auto-generated method stub
		System.out.println("Animal making sound");
		
	}
	
}

class cow extends myanimal{
	
	public void animalsound() {
		// TODO Auto-generated method stub
		System.out.println("Cow making sound");
		
	}
	
	
}

class dog extends myanimal{
	
	public void animalsound() {
		// TODO Auto-generated method stub
		System.out.println("dog making sound");
		
	}
	
	
}

public class myPolymor {
	
public static void main(String[] args) {
		
		myanimal obj1 = new myanimal();
		cow obj2 = new cow();
		dog obj3 = new dog();
		
		obj1.animalsound();
		obj2.animalsound();
		obj3.animalsound();
		
	}
	
}
	
	
	

