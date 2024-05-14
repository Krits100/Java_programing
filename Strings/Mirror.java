package Strings;
import java.util.*;
public class Mirror {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse is: "+rev);
		System.out.println(str.concat(rev));
		
		/*if(str==rev)
		{
			System.out.println("REV is mirror of String str.");
		}
		else
		{
			System.out.println("REV is not mirror of String str.");
		}*/
	}

}
