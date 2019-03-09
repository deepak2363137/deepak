package exceptionHandlingProgrames;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		try {
			int x[]=new int[5];
			Scanner ob=new Scanner(System.in);
			System.out.println("enter 5 nos");
			for(int i=0;i<5;i++)
				x[i]=ob.nextInt();
			System.out.println("5 nos are");
			for(int i=0;i<=5;i++)
				System.out.println(x[i]);
		
		try {
			
			Scanner cd=new Scanner(System.in);
			System.out.println("enter 2 nos");
			int a=cd.nextInt();
			int b=cd.nextInt();
			int c=a/b;
			System.out.println("the result is"+c);
		}
		catch(ArithmeticException ae) {


			
			System.out.println("the error is"+ae);
		
	}
		}
		catch(Exception ab) {

			
			
			System.out.println("the error is"+ab);
	}

}
}