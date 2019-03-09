package pack26;

public class Pro8 {

	int empno;  // global variable
	String name,address;
	
	public Pro8(int empno,String name,String address) { // local variable
		
		this.empno=empno; // this is used when both global and local variable are same
		this.name=name;
		this.address=address;
		
	}
	
	public Pro8()
	{
		System.out.println("default constructor");
		
	}
	public String toString() {

		return "First[empno="+empno+"name="+name+"address="+address+"]";
		
	}
	
	int sum(int a,int b)
	{
		return a+b;
	}

	float sum(float a,float b) {
	
		return a+b;
		
	}
	double sum(double a,double b)
	{
		return a+b;
	}
	
}
