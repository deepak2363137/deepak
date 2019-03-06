package newone;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(100,"Amit");
		map.put(101,"Vijay");
		map.put(102,"Rahul");

		System.out.println("keys: keyset() use"+map.keySet());
		                                                                                                                                                                                                                                                                                                                                
		System.out.println("values & value() use:"+map.values());
		System.out.println("keys-Value pairs & entryset() buse :"+map.entrySet());
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
