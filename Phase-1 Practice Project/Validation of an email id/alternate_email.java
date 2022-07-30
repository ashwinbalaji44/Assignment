package validation_email;
import java.util.regex.*;    
import java.util.*;    
public class alternate_email {

	    public static void main(String args[]){  
	    
	    	/*
	       invalid emails in list  
	        "@yahoo.com"
   			"ashwinb#domain.com"  
	        */
	    	
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        
	        Pattern pattern = Pattern.compile(regex);  
	        
	    	System.out.println("Enter email ID: ");
			Scanner sc =new Scanner(System.in);
			String e = sc.next();
	       
	        Matcher matcher = pattern.matcher(e);  
	        System.out.println(e +" : "+ matcher.matches()+"\n");  
	         
	    }  
	}  

