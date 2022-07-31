package diamond_problem;

interface Interface1{
	 default void display() {
		System.out.println("Implementation of 1st Interface");
	}
}
interface Interface2{
	 default void display() {
		System.out.println("Implementation of 2nd Interface");
	}
}

public class Diamond implements Interface1, Interface2 {
	
	public void display()
	{
		Interface1.super.display();
		Interface2.super.display();
	}
public static void main(String[] args) {
	Diamond d =new Diamond();
	d.display();
}
}
