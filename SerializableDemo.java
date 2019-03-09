package filepros;
// converting variable to the object and converting to the seriallijable
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Employee19 implements Serializable{

	public String name;
	public String address;
	public transient int SSN;
	public  int number;
	
}
public class SerializableDemo  {

	public static void main(String[] args) {
		
		Employee19 e=new Employee19();
		e.name="sandip";
		e.address="jayanagar, 4th Block";
		e.SSN=11123;
		e.number=101;
		
		try
		{
			FileOutputStream fileOut=new FileOutputStream("abc.txt"); // file will be created and open in write
			ObjectOutputStream out=new ObjectOutputStream(fileOut); // write the object into the file
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in abc.txt");
			
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
