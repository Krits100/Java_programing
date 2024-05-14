package My_package;
import java.util.*;

class reverse
{
	String str;
	void get_theString()
	{
		System.out.println("Enter a string1: ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
	}
	
	void Reverse_string()
	{
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse of the string " +str+ "is: "+rev);
	}
}
public class String_reverse {

	public static void main(String[] args) {
		reverse obj=new reverse();
		obj.get_theString();
		obj.Reverse_string();
	}

}
