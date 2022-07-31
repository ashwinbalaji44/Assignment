package keyword_exception;

class ExceptionIn extends Exception 
{ 
    public ExceptionIn(String str) 
    { 
        super(str); 
    } 
} 

public class CustomExcep {

	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new ExceptionIn("OUT"); 
	        } 
	        catch (ExceptionIn EI) 
	        { 
	            System.out.println("IN"); 
	            System.out.println(EI.getMessage()); 
	        } 
	    } 
	}


