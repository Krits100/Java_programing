package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Comparison_string {

	public static void main(String[] args) {
		String str1;
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		char[] res=str1.toCharArray();
		String str2;
		System.out.println("Enter a string: ");
		Scanner sc1=new Scanner(System.in);
		str2=sc.nextLine();
		char[] result=str2.toCharArray();
		boolean isEqual=Arrays.equals(res, result);
		if(isEqual)
		{
			System.out.println("Two stings are equal.");
		}
		else
		{
			System.out.println("Two stings are not equal.");
		}
	}
}
