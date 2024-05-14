package My_package;
import java.util.*;
class Mystring
{
	String str;
	
	void get_string()
	{
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
	}
	
	void findTheCharacters()  //extract all characters from the string
	{
		System.out.println("You have given a string and that string contains these characters: ");
		for(int i=0;i<str.length();i++)
		{
			System.out.println("str.charAt(i)");  // charAt(i)  returns the character present in the ith location everytime until it ends the string
		}
	}
	
	/*void Palindrom_check()          //without reversing the string 
	{
		int i,j;
		int flag=0;
		for(i=0,j=str.length()-1; i<=str.length()/2;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("The string is not palindrom.");
		}
		else
		{
			System.out.println("The string is palindrom.");
		}
	}*/
	
	void Palindrom_check_withReverse()
	{
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse of the string " +str+ "is: "+rev);
		if(str.compareTo(rev)==0)
		{
			System.out.println("The string is palindrom.");
		}
		else
		{
			System.out.println("The string is not palindrom.");
		}
	}

void extract_words()
{
	str+=" ";
	String temp="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ') // jotokhon space na pabo..totokhon char gulo temp e add hobe and word hbe..space pawa mne akta word sesh
		{
			temp=str.charAt(i)+temp;
		}
		else
		{
			System.out.println(temp);
			temp="";
		}
	}
}

public class Extract_CharactersFromString {

	public static void main(String[] args) {
		Mystring ob=new Mystring();
		ob.get_string();
		ob.Palindrom_check_withReverse();
		ob.extract_words();
	}
}
}
