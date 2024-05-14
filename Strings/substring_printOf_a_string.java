package Strings;
import java.util.*;
public class substring_printOf_a_string {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//String str= sc.nextLine();
		String str="abcd";
		for(int i=0;i<=3;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				System.out.print( str.substring(i,j)+" ");

			}
		}
		
	}

}
