package thread_runnable;

public class ThreadRunEx implements Runnable {
	  
	    @Override  
	    public void run() {  
	        System.out.println("Thread has ended");  
	    }  
	   
	    public static void main(String[] args) {  
	        ThreadRunEx tre = new ThreadRunEx();  
	        Thread t1= new Thread(tre);  
	        t1.start();  
	        System.out.println("Hi");  
	    }  
	
}
