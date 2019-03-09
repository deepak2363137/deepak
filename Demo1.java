package abstractclassandinterface;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1="Mphasis and global Soft";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,10));
		System.out.println(s1.startsWith("Mp"));
		System.out.println(s1.endsWith("ft"));
		System.out.println(s1.replace("soft","Software"));
		String ss="Mphasis and Global sof , mumbai";
		System.out.println(ss);
		System.out.println("the length of string="+ss.length());
		System.out.println(ss.replace("mumbai","bangalore"));
		char name[]=s1.toCharArray(); //concert string to char array
		int leng=name.length;
		System.out.println("length of array="+leng);
		for(int i=0;i<leng;i++) {
			System.out.println(name[i]);
			
		}}

		
		

	}


