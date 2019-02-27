package pack26;

public class Employee {

	public static void main(String[] args) {

		EmpAddr ed=new EmpAddr();
		ed.setStreetno(201);
		ed.setColony("btm");
		ed.setCity("delhi");
		ed.setState("karnatka");
	
		
		EmployeeBean bn=new EmployeeBean();
		bn.setName("inayat");
		bn.setEmpno(121);
		bn.setSalary(35000);
		bn.setEmpdr(ed);
		
		System.out.println(bn.getName()+" "+bn.getEmpno()+" "+bn.getSalary()+" "+bn.getEmpdr());
		
		
		
	}

}
