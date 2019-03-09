package pack26;

import java.util.Scanner;

// greatest of three numbers
public class Pro4 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b)
			System.out.println("a is greatest");
		else if(b>c)
		System.out.println("b is greatest");
		 else 
			 System.out.println("c is greatest");
		
	}

}
