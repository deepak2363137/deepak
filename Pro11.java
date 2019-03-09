package pack26;

import java.util.Scanner;

public class Pro11 extends Pro10{

	int phy,chem,bio,tot;
	Pro11(int rollno,String name,String address,int phy,int chem,int bio ){
		
		super(rollno,name,address);
		this.phy=phy;
		this.chem=chem;
		this.bio=bio;
	}
/*	void input()
	{
		//super.Pro10();
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the phy , chem ,bio marks");		
		phy=ob.nextInt();
		chem=ob.nextInt();
		bio=ob.nextInt();
		
	}*/
	
	void display()
	{
		super.display();
		tot=phy+chem+bio;
		System.out.println(" phy "+ phy +" chem "+ chem +" bio "+ bio +" tot "+ tot);
		
	}
	
	public static void main(String[] args)
	{
		Pro11 ab=new Pro11(101,"sandip","delhi",7,8,9);
		//ab.input();
		ab.display();
		
		
	} 
}
