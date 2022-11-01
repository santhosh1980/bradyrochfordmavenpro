package Tuto;

public class myStaticReturn {
	
	static int addmethod(int dig1, int dig2) {
		return(dig1+dig2);
	}
	static int diffmethod(int dig1, int dig2) {
		return(dig1-dig2);
	}
	static int mulmethod(int dig1, int dig2) {
		return(dig1*dig2);
	}
	public static void main(String[] args) {
		System.out.println(addmethod(4,2));
		System.out.println(diffmethod(4,2));
		System.out.println(mulmethod(4,2));
	}
}
