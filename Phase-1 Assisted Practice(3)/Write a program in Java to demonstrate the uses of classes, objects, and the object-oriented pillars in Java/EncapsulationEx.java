package oops;
class Student{  
 
	private String name;  
	public String getName(){  
	return name;  
	}   
	public void setName(String name){  
	this.name=name;  
	}  
	}  
class EncapsulationEx{  
public static void main(String[] args){   
Student s=new Student();   //creating instance of the encapsulated class  
s.setName("vijay");  
System.out.println(s.getName());  
}  
}  
