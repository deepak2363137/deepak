// Throw exception - it is used for user defined exception
package exceptionHandlingProgrames;
import java.util.*;
public class ExceptionalExample4 {

	public static void main(String[] args) throws Exception
	{
		
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a marks");
		int x=ob.nextInt();
		if(x>0)
			System.out.println("ok");
		else
			throw new Exception("Marks should be greater than zero");
		
		
		

	}

}
