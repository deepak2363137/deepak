package collectionpros;

import java.util.*;
public class CollectExam {

	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("geet");
		ts.add("sunil");
		ts.add("amit");
		ts.add("sumeet");
		ts.add("anil");
		
		System.out.println(ts);
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("********************************");
		for(String str:ts) {
			System.out.println(str);
		}
		
		}}
