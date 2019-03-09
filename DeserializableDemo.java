package filepros;

import java.io.*;
public class DeserializableDemo {

	public static void main(String[] args) {
		
		Employee19 e=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("abc.txt");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			e=(Employee19)in.readObject();
			in.close();
			fileIn.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
			System.out.println(i);
		}
			catch(ClassNotFoundException c)
			{
				System.out.println("Employee class not found");
				c.printStackTrace();
				
			}
		
		System.out.println("Deserialiazed Employee...");
		System.out.println("Name :"+e.name);
		System.out.println("Address :"+e.address);
		System.out.println("SSN :"+e.SSN);
		System.out.println("Number :"+e.number);
		}

	}


