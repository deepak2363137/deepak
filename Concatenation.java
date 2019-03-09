package abstractclassandinterface;

public class Concatenation {

	public static void main(String[] args) {

		int age=25;
		StringBuffer s=new StringBuffer("She is");
		StringBuffer s1=new StringBuffer("Hello to HP");
		System.out.println("string buffer="+s);
		System.out.println("s append="+s.append(25));
		System.out.println("s append="+s.append("year old"));
		System.out.println("entire string="+s.toString());
		System.out.println("length="+s.length());
		System.out.println("capacity="+s.capacity());
		System.out.println("s1="+s1);
		System.out.println("charAt="+s1.charAt(1));
		s1.setCharAt(1,'i');
		s1.setLength(5);
		System.out.println("s1="+s1);
		System.out.println("set insert="+s1.insert(5,"welcome"));
		System.out.println("---------------to delete="+s1.delete(3,6));
		System.out.println("to reverse="+s1.reverse());
		System.out.println(s1);
		
	}

}
