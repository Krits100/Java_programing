package file;
import java.io.*;

public class buff_read_01 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Welcome "+name);
        System.out.println("Enter your age");
        int age=Integer.parseInt(br.readLine());
        System.out.println("You are "+age+" years old");
        
	}

}