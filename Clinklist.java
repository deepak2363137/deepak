package newone;

import java.util.LinkedList;

public class Clinklist {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();

		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(10);
		l2.add(40);
		
		l1.add(20);
		l1.add(80);
		l1.add(90);
		l1.add(50);
		
		System.out.println(l2);
		System.out.println(l1);
		l1.addFirst(100);
		System.out.println(l1);
		l1.add(200);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.addAll(l2);
		System.out.println(l1);
		
	}

}
