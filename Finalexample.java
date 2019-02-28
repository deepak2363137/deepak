package abstractclassandinterface;

public class Finalexample {
	
	final int a=10;
	final void display() {
		
		System.out.println("this is final method");
		System.out.println("value of a is "+a);
	}

	public static void main(String[] args) {
		Finalexample ob=new Finalexample();
		ob.display();
	}
}
