package newone;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linlist_listiterator {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(40);
		l1.add(20);
		l1.add(80);
		l1.add(90);
		l1.add(50);
	
		ListIterator ii=l1.listIterator();
		System.out.println("forward direction");
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
		System.out.println("backward direction");
		
		while(ii.hasPrevious())
		{
			System.out.println(ii.previous());
		}
		
	}

}
