package collectionpros;
import java.util.*;
public class CollectExam3 {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>();
		Integer a=new Integer(10);
		hs.add(a);
		Float b=new Float(10.35);
		hs.add(b);
		String name=new String("inayat");
		hs.add(name);
		First obj=new First(101,"sandip","bangalore");
		hs.add(obj);
		First obj1=new First(102,"raman","delhi");
		hs.add(obj1);
		System.out.println(hs);
		
		
		
	}
	
}
