package collectionpros;

public class First {

	int empno;
	String name,address;
	public First(int empno,String name,String address)
	{
		this.empno=empno;
		this.name=name;
		this.address=address;
		
	}
	
	public String toString()
	{
		return "[ "+ " empno:- "+ empno +", name:- "+ name +", address:- "+ address + "]";
	}
}
