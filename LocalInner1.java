package exceptionHandlingProgrames;

public class LocalInner1 {

	private int data=30; // instance variable
	
	void display() {
		System.out.println("this is outer class");
		
		class Local
		{
			void msg()
			{
				System.out.println("inside class method"+data);
			}
		}
			Local ob=new Local();
			ob.msg();
			
		}
		           
	
	public static void main(String[] args) {
		
		LocalInner1 obj=new LocalInner1();
		obj.display();
		
		
	}

}
