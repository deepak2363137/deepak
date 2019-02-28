package abstractclassandinterface;


interface studentdetails
{
	int a=10;      // static and final so we have to assign the value of a
	void display();
	
}

interface result
{
	void result();
	
}
public class InterfaceExample implements studentdetails,result {

	public void display() {
		
		System.out.println("this is sandip");
		System.out.println("the value of a is"+a);
	}
	public void result() {
		
		System.out.println("first division");
		
	}
	public static void main(String[] args) {
		
		InterfaceExample in=new InterfaceExample();
		in.display();
		in.result();
		
		

	}

}
