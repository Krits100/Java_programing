package Strings;

public class string_reverse {

	public static void main(String[] args) {
		String str="kritica";
		String result="";
		int length=str.length();
		System.out.println(length);
		for(int i=str.length()-1;i>=0;i--)
		{
			result= result+str.charAt(i);
		}
		System.out.println(result);
	}

}
