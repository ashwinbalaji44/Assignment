package try_catch;

public class TryCatch {
public static void main(String[] args) {
	System.out.println("Example of Try and Catch");
	try
	{
		int a=5/0;
	}

	catch(Exception e)
	{
		System.out.println("Error is: "+e);
	}
	System.out.println("Error is found...");
}
}
