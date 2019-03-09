package pack26;
// prime number from 1 to 50
import java.util.Scanner;

public class Pro6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("prime no between 1 to 50");
		for(int i=0;i<50;i++) {
			
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				
				if(i%j==0)
				{
					count++;
					
				}
				
			}

			if(count==0) {
				System.out.println(i);
			}
	}

}

                                                                                                                                                               }