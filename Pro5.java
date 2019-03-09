package pack26;

import java.util.Scanner;

public class Pro5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("table of the number is");
		int j;
		for(int i=0;i<=10;i++) {
			j=n*i;
			System.out.println(j);
			
		}

	}

}
