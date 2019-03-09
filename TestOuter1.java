package exceptionHandlingProgrames;

public class TestOuter1 {

	static int data=30;
	static class inner
	{
		void msg()
		{
			System.out.println("the value of data is"+data);
		}
	}
	public static void main(String[] args) {
		TestOuter1.inner obj=new TestOuter1.inner();
		obj.msg();   
		
		
	}

}
