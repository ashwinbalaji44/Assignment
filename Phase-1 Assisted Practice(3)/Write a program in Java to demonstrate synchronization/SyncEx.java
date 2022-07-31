package synchronization;

class Q
{
	synchronized public void getLine()      //thread control using synchronization               
	{
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(400);   
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Train extends Thread
{
	Q q;

	Train(Q q)
	{
		this.q = q;
	}

	@Override
	public void run()
	{
		q.getLine();
	}
}

public class SyncEx
{
	public static void main(String[] args) {
		Q q = new Q();

		Train train1 = new Train(q);
		Train train2 = new Train(q);
		
		train1.setName("Train 1");  //Name of first Thread
		train2.setName("Train 2"); //Name of second Thread
		train1.start();
		train2.start();
	}
}
