package Strings;
import java.util.*;
public class Valid_parenthisic {

	public static void main(String args[]) {
		
		String str="{((a+b)+(c+d))}";
		char[] ch=str.toCharArray();
		char x = 0,y=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
			{
				x=ch[i];
			}
			else if(ch[i]==')' || ch[i]=='}' || ch[i]==']')
			{
				y=ch[i];
			}
		}
			if(x==y)
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("not valid");
			}
	}
}
