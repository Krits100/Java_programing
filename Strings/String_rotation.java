package Strings;
import java.util.*;
public class String_rotation {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println("Enter the index you want to rotate: ");
		int n=sc.nextInt();
		String k=str.substring(0,n);
		String t=str.substring(n,str.length());
		t=t+k;
		System.out.println("After rotation the output is: "+t);
}
}

