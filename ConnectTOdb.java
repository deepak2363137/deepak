package connection;


import java.sql.*;

public class ConnectTOdb{

	public static void main(String[] args) throws Exception {

		
		Class.forName("oracle.jdbc.driver.OracleDriver");    // loading the driver into the memory


		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		Statement st=con.createStatement();
		
		/*st.execute("Create table Mphasisemp(empno number,name varchar2(30),address varchar2(30))");
		
		System.out.println("table created");*/

	st.execute("insert into Mphasisemp values(101,'sandip','bangalore')");
		System.out.println("row inserted");
		
		st.execute("update Mphasisemp values(102,'sandip,'bangalore')");
		System.out.println("row inserted");
		st.execute("update Mphasisemp set name='kiran' where empno=102");
		System.out.println("row updated");
		st.execute("delete from Mphasisemp where empno=101");
		System.out.println("row deleted");
		ResultSet rs=st.executeQuery("select * from Mphasisemp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		
	}

}
