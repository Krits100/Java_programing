package file;
import java.io.*;
public class FileWriteDemo {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("D://out.txt");
			obj.write("I erite java");
			obj.close();
			System.out.println("File is saved.");
			}catch(Exception e)
		{
				e.printStackTrace();
		}
	}
}
