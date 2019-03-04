package collectionpros;
import java.util.*;
public class CollectExam2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> ts=new LinkedHashSet<String>();
		ts.add("geet");
		ts.add("aman");
		ts.add("raman");
		ts.add("vani");
		ts.add("gagan");
		System.out.println(ts);
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	
		System.out.println("*****************************************");
		for(String str:ts) {
			System.out.println(ts);
		}
		

	}

}
