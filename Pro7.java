package pack26;

import java.util.Scanner;

public class Pro7 {

	int empno;
	String name;
	String address;
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter empno,name,address");
		empno=in.nextInt();
		name=in.next();
		address=in.next();
		
	}
	
	void display()
	{
		System.out.println("the empno "+empno+"name is "+name+"address is "+address);
	}
	
	public static void main(String[] args) {
		

		Pro7 pr=new Pro7();
		pr.input();
		pr.display();

		System.out.println("variable name 1"+pr.name);
		
	}

}
