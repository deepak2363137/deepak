package pack26;
import java.util.*;

public class Pro10 {

	int rollno;
	String name;
	String address;
	
	Pro10(int rollno,String name,String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	/*void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollno, name, address");
		rollno=sc.nextInt();
		name=sc.next();
		address=sc.next();
		
		
		
	}
	*/
	void display()
	{
		System.out.println("rollno "+ rollno +" name "+ name +" address "+ address );
	}
	
}
