package abstractclassandinterface;

abstract class Abstclass11{
	int empno;
	String name;
	String address;
	
	public Abstclass11(int empno,String name,String address)
	{
		super();
		this.empno=empno;
		this.name=name;
		this.address=address;
		
	}
	
	abstract void details();
	
}

public class Abstexample2 extends Abstclass11 {

	int salary;
	public Abstexample2(int empno,String name,String address,int salary)
	{
		super(empno,name,address);
		this.salary=salary;
	}
	
	void details() {
		
		System.out.println(" empno :" +empno+ " name is :"+name+" address is :"+address+" salary is :"+salary);
		System.out.println(" i work for mphasis ");
		
	}
	public static void main(String[] args) {
		
		Abstexample2 exm = new Abstexample2(101,"rajan","delhi",35000);
		exm.details();

	}

}
