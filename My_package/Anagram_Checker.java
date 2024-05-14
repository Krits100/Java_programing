package My_package;
import java.util.*;
class Anagram{
	String str1,str2;
	int i,j;
	char s1;
	char s2;
	char[] str11;
	char[] str12;
	void get_theString1()
	{
		System.out.println("Enter a string1: ");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str11=str1.toCharArray();
	}
	void get_thestring2()
	{
		System.out.println("Enter a string2: ");
		Scanner sc1=new Scanner(System.in);
		str2=sc1.nextLine();
		str12=str2.toCharArray();
	}
	
	void Anagram_Check() {
		if(str1.length()!=str2.length())
		{
			System.out.println("Two strings are not anagram anyway.");
		}
			Arrays.sort(str11);
			Arrays.sort(str12);
			if(Arrays.equals(str11,str12))
			{
				System.out.println("Two strings are Anagram to each other.");
			}
			else
			{
				System.out.println("Two strings are not Anagram to each other.");
			}
		}
	}

public class Anagram_Checker {
	public static void main(String[] args) {
		Anagram obj=new Anagram();
		obj.get_theString1();
		obj.get_thestring2();
		obj.Anagram_Check();
	}
}
