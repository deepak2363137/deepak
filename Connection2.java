package connection;
import java.util.*;
import java.sql.*;

public class Connection2 {

	public static void main(String[] args) throws Exception{

		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		/*PreparedStatement st=con.prepareStatement("insert into mphasisemp values(?,?,?)");
		System.out.println("enter empno,name And address");
		int empno=sc.nextInt();
		String name=sc.next();
		String address=sc.next();
		st.setInt(1,empno);
		st.setString(2,name);
		st.setString(3,address);
		
		st.execute();
		System.out.println("row created");
		
		*/
		/*PreparedStatement st=con.prepareStatement("update mphasisemp set name=? where empno=?");
		System.out.println("enter name and empno");
		String name=sc.next();
		int empno=sc.nextInt();
		st.setString(1, name);
		st.setInt(2,empno);
		int x=st.executeUpdate();
		if(x>=1)
			System.out.println("row updated");
		else
			System.out.println("sorry");*/
		
		PreparedStatement st=con.prepareStatement("delete from mphasisemp where empno=?");
		System.out.println("enter the empno to delete");
		int empno =sc.nextInt();
		st.setInt(1,empno);
		int x=st.executeUpdate();
		if(x>=1)
			System.out.println("row deleted");
		else
			System.out.println("no row deleted");
	}

}
