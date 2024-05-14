package file;
import java.io.*;
public class copy_file1_file2 {
	public static void main(String[] args) {
		try {
			FileReader obj=new FileReader("D:\\file1.txt");
			FileWriter obj1=new FileWriter("D:\\file2.txt");
			int x;
			while((x=obj.read())!=-1)
			{
				System.out.println((char)x);
			}
			System.out.print(x);
			obj1.write(x);
			obj.close();
			obj1.close();
			System.out.println("File is saved.");
		}catch(Exception e)
		{
			System.out.println("Some exceptions may occur.");
		}
	}
}