package multithreadingpro;

public class A  implements Runnable{

	public void run() {
		try
		{
			for(int i=0;i<10;i++) {
				System.out.println(i);
				Thread.sleep(500);
				
			}
		}
		
		catch(Exception ae) {
			
		}
	}
	public static void main(String[] args) {
		
		A obj1=new A();
		A obj2=new A();
		A obj3=new A();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
