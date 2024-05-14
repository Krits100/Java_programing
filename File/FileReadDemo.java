package file;
import java.io.*;
public class FileReadDemo {
	public static void main(String[] args) {
		try
		{
			FileReader obj=new FileReader("D:\\testout.txt");
			int x;
			while((x=obj.read())!=-1)
			{
				System.out.println((char)x);
			}
			obj.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
