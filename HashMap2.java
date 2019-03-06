package newone;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"amit");
		map.put(101,"vijay");
		map.put(102,"rahul");
		map.put(103,"gaurav");
		System.out.println("Initial list of elements :"+map);
		map.remove(100);
		System.out.println("Updated list of elements :"+map);
		map.remove(101);
		System.out.println("updated list of the elements"+map);
		map.remove(102,"rahul");
		System.out.println("updated list of the elements :"+map);
		

	}

}
