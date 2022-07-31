package keyword_exception;


public class ThrowsKey {
	void Display() throws Exception
	{
		int a=5/0;
		System.out.println("value of a: "+a);
	}	
	public static void main(String[] args) {
	
		ThrowsKey TK = new ThrowsKey();
		
		try 
		{
			TK.Display();
		}
		
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		
		System.out.println("End of Program");
	}
}
