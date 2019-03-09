
public class StringExample {

	public static void main(String[] args) {

		String a="apple";     // not create new memory block
  		String b="apple";
	                             // it will refer String constant pool compare hash code
		String c=new String("apple");
		
		if(a==b)
			System.out.println("true");
		else
			System.out.println("false");
		if(a==c)
			System.out.println("true");
		else
			System.out.println("false");
		if(a.contentEquals(c))
			System.out.println("true");
		else
			System.out.println("false");
		

		
	}

}
