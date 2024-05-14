package Strings;

import java.util.Scanner;

public class counting_space_digits_specialchars {

	public static void main(String[] args) {
		int space=0;
		int digits=0;
		int specialchar=0;
		String str;
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char ch;
		for(int i=0;i<str.length()-1;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				space++;
			}
			else if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
			{
				digits++;
			}
			else
			{
				specialchar++;
			}
		}
		System.out.println("The number of spaces are: "+space);
		System.out.println("The number of digits are: "+digits);
		System.out.println("The number os special characters are: "+specialchar);
	}

}
