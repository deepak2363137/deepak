package abstractclassandinterface;

abstract class Abstclass{
	
	abstract void displaydetails();
	void address()
	{
		System.out.println("bangalore");
	}
	
}

public class Abstexample extends Abstclass{
	
	@Override
	void displaydetails()
	{
		System.out.println("my name is deepak");
	}
	
	public static void main(String[] args)
	{
		Abstexample ob=new Abstexample();
		ob.displaydetails();
		ob.address();
	}
}
