package exceptionHandlingProgrames;

import java.util.Scanner;

public class ExceptionalExample2 {

	public static void main(String[] args) {
		
		try {
			Scanner ob=new Scanner(System.in);
			System.out.println("enter 2 no");
			int a=ob.nextInt();
			int b=ob.nextInt();
			int c=a/b;
			System.out.println("the result is"+c);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("the error is"+ae);
			
		}
		catch(Exception ab)
		{
			System.out.println("the other error is"+ab);
		}

		finally 
		{
			System.out.println("connection closing");
		}
		
		}
	}


