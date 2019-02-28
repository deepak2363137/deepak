package abstractclassandinterface;

public class Staticexample {

	static int a=5,b=8;
	
	static int sum(int a,int b) 
	{
		return a+b;
	}
	
	static
	{
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
	
		System.out.println("the sum is"+sum(6,7));
		System.out.println(a);

	}

}
