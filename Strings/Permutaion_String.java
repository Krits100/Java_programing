package Strings;
import java.util.*;
public class Permutaion_String {
	public static void main(String args[]) {
	String str1,str2;
	char[] str11;
	char[] str12;
	Scanner sc=new Scanner(System.in);
	str1=sc.nextLine();
	Scanner sc1=new Scanner(System.in);
	str2=sc1.nextLine();
	str11=str1.toCharArray();
	str12=str2.toCharArray();
	Arrays.sort(str11);
	Arrays.sort(str12);
	if(Arrays.equals(str11,str12))
	{
		System.out.println("One string is permutation of another string.");
	}
	else
	{
		System.out.println("One string is not permutation of another string.");
	}
}
}
