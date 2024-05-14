package Strings;
import java.util.*;
public class Word_freq_counter {

	public static void main(String[] args) {
		String str="";
		int count=0,t;
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String s;
		System.out.println("Enter string to count");
		s=sc.next();
		t=str.indexOf(s);
		while(t>=0)
		{
			count++;
			t=str.indexOf(s, t+1);
		}
		
		System.out.println("No of occurance"+count);
		
		/*for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				System.out.println(str);
				str="";
			}
			else
			{
				str=str+str.charAt(i);
			}
		}
		System.out.println("The words are: "+str);
		
		t=str.indexOf(str);
		while(t>0)
		{
			count++;
			t=str.indexOf(t+1);
		}
		//return (count);*/
	}
	
}
