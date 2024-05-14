package Strings;
import java.util.*;
public class Interleaving_string {
	public static void main(String[] args) {
		String str1,str2,str3;
		char[] s1;
		char[] s2;
		char[] s3;
		int s1_length,s2_length;
		int s3_length;
		
		System.out.println("Enter 1st string: ");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		s1=str1.toCharArray();
		s1_length=s1.length;
		
		System.out.println("Enter 2nd string: ");
		Scanner sc1=new Scanner(System.in);
		str2=sc1.nextLine();
		s2=str2.toCharArray();
		s2_length=s2.length;
		
		System.out.println("Enter 3rd string: ");
		Scanner sc2=new Scanner(System.in);
		str3=sc2.nextLine();
		s3=str3.toCharArray();
		s3_length=s3.length;
		if(s3_length==(s1_length+s2_length))
				{
					System.out.println("String 3 is interleaving of String 1 and String 2.");
				}
		else
		{
			System.out.println("String 3 is not interleaving of String 1 and String 2.");
		}
	}

}
