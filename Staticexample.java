package abstractclassandinterface;

public class Staticexample {

	static int a=5,b=8; // global variable or class variable
	static int c; // we cannot access a non-static  variable inside a static method
	
	static int sum(int a,int b) 
	{
		int c=a+b;
		return c;
	}
	
	static
	{
		System.out.println("static block");
	}
	
	static void increment()
	{
		System.out.println(a++);
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(2,3));
		System.out.println("the sum is"+sum(6,7));
		increment();
		increment();
		increment();
		increment();
		
		System.out.println(a);

	}

}
