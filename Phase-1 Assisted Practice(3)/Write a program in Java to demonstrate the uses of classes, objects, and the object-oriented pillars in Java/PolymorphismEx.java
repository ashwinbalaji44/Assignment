package oops;

class PolymorphismEx2{
	void arg() {System.out.println("No args");}
	void arg(int a, int b) {System.out.println("2 args of int");}
	void arg(double a, double b) {System.out.println("2 args of double");}
}

public class PolymorphismEx {
	public static void main(String[] args) {
		PolymorphismEx2 PE =new PolymorphismEx2();
		PE.arg(5,10.0);
		
	}

}
