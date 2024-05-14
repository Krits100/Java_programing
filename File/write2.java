package file;
import java.io.*;
public class write2 {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("D://out.txt");
			obj.write("I have a ghost.");
			obj.close();
			System.out.println("file is saved.");
			}catch(Exception e)
		{
				e.printStackTrace();
		}
	}
	}
