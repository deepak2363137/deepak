package multithreadingpro;

class R implements Runnable
{
	  synchronized public void run()
	  {
		  try
		  {
			  for(int i=1;i<=10;i++)
			  {
				  System.out.println(i);
				  Thread.sleep(500);
			  }
			  
		  }
		  catch(Exception ae)
		  {
			  
		  }
	  }
}
public class B {

	public static void main(String[] args) {
		R r1=new R();
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);
		Thread t4=new Thread(r1);
		
		t2.start();
		t3.start();
		t4.start();
		
	}

}
