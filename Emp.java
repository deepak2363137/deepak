package newone;
import java.util.*;
class Employee{
	int id;
	String name,address;
	int salary;
	
	 Employee(int id,String name,String address,int salary) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
		
	}
}



public class Emp {

	public static void main(String[] args) {
	
		Map<Integer,Employee> map=new LinkedHashMap<Integer,Employee>();
		Employee b1=new Employee(101,"sandip","bangalore",8000);
		Employee b2=new Employee(102,"aman","Delhi",7000);
		Employee b3=new Employee(101,"kamal","mumbai",5000);
		
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		
		for(Map.Entry<Integer,Employee> en:map.entrySet())
       {
	
    	   	int key=en.getKey();
    	   	Employee b=en.getValue();
    	   	System.out.println(key+"Details");
    	   	System.out.println(b.id+" "+b.name+" "+b.address+" "+b.salary);
		
		
		

	    }
			}
}