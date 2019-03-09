package pack26;

public class Pro9 {

	public static void main(String[] args) {
		
		Pro8 ob= new Pro8();
		Pro8 ob1=new Pro8(101,"sandip","bangalore");
		Pro8 ob2=new Pro8(102,"chinmaya","bangalore");
		Pro8 ob3=new Pro8(103,"puspa","bangalore");
		
		System.out.println(ob.sum(4, 5));
		System.out.println(ob.sum(4.3, 5.3));
		System.out.println(ob.sum(43.3f,5.45f));
		System.out.println(ob3);
		

	}

}
