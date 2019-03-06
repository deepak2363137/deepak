package newone;
import java.util.*;
 class Empl1 implements Comparable<Empl1>
{

	int id;
	String name,address;
	int salary;
	public Empl1(int id,String name,String address,int salary) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
		
	}
	
	@Override
	public int compareTo(Empl1 st) {
		if(id==st.id)
			return 0;
		else if(id>st.id)
			return 1;
		else
			return -1;
	
		
	}
	
}

public class Employee4
{
	public static void main(String[] rags) {
		
		ArrayList<Empl1> al=new ArrayList<Empl1>();
		Empl1 b1=new Empl1(101,"suman","bangalore",8000);
		Empl1 b2=new Empl1(102,"john","Delhi",7000);
		Empl1 b3=new Empl1(103,"suman","chennai",9000);
		
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		Collections.sort(al);
		for(Empl1 st:al) {
			System.out.println(st.id+" "+st.name+" "+st.address);
			
			
		}
		
		
		
	}
	
}