package Strings;
import java.util.*;
public class Stringbasic {
	
	public static void main(String[] args) {
		//String str="hello";  //basic declaration of a string
		//System.out.println(str);
		
		// user input
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		
		//print the length
		int length= str.length();
		System.out.println(length);
		
		//[ CharAt() and length() ================== length() string er length ber kore day simple. 
				//											 CharAt() use hy kono (eg: str="hello") index er value print korte. 
				//																	str.CharAt(3); mane eta l print korbe.

		char k=str.charAt(3);  // ans ashche t
		System.out.println(k);
		
		
// indexOf() ==== eg: str=" Raghav gara"  , ete character dile oi character ta je je indx guloy ache..shegulo day.. 
		//				str.indexOf('a');  then ans hbe 1.(as 3 te a ache..tai 1st occurace er index ta debe."
		
		int p=str.indexOf('a');   //ans ashche 6
		System.out.println(p);
		
		
//compareTo()==== duto strings same hole.. ans eta debe true. 
		
		String str1= sc.nextLine();
		System.out.println(str1);
		
		// compare= 
		System.out.println(str.compareTo(str1));
		
//str.contains()==== check kore if a portion is present in the string or not..eg: str.contains("alla"); then true bolbe nahole false
		
		System.out.println(str.contains("alla"));
		
		System.out.println(str.startsWith("al"));
		System.out.println(str.endsWith("ok"));
		
//concatination 
		String m="hello";
		String n= m + "world";
		System.out.println(n);
		
//substring 
		String s="abcd";
		System.out.println(s.substring(0,2));
			}

}
