package pack26;

public class Main {

	public static void main(String[] args) {
	
		Marks mk=new Marks();
		mk.setPhy(65);
		mk.setChem(78);
		mk.setBio(98);
		
		Student s1=new Student();
		s1.setAddress("delhi");
		s1.setMark(mk);
		s1.setName("jatin");
		s1.setRollno(54);
		System.out.println(s1.getAddress()+" "+s1.getName()+" "+s1.getMark(mk)+" "+s1.getRollno());

	}

}
