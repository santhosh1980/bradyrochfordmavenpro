package Tuto;

abstract class Bank{
	abstract float getInterestRate();
}

class SBI extends Bank{
	float getInterestRate() {
		return 7.15f;
	}
}

class ICICI extends Bank{
	float getInterestRate() {
		return 8.15f;
	}
}

public class myOtherAbstract {
	
	public static void main(String[] args) {
		
		Bank s = new SBI();
		System.out.println(s.getInterestRate());
		
		Bank i = new ICICI();
		System.out.println(i.getInterestRate());
	}

}
