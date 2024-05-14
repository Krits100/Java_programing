package Strings;
import java.util.*;
public class Truncate_String {
	public static void main(String[] args) {
		String str,truncated_string;
		int length;
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		System.out.println("Enter the length after which you want to truncate : ");
		Scanner sc1=new Scanner(System.in);
		length=sc1.nextInt();
		
		truncated_string= str.substring(0,length) + 'y' ;//+str.substring(length);
		
		System.out.println("The truncated String is: " +truncated_string);
	}

}
