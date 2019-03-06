package newone;

import java.util.Stack;

public class CL_stack {

	public static void main(String[] args) {
		
		Stack ss=new Stack();
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		ss.push(50);
		ss.push(60);
		ss.push(70);
		ss.push(0);
		System.out.println(ss);
		System.out.println(ss.pop());
		System.out.println(ss);
		System.out.println(ss.peek());
		System.out.println(ss);
		System.out.println(ss.search(20));
		System.out.println(ss.search(200));


		


		
		
	}

}
