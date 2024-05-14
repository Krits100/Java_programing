package Strings;

public class String_compression {

	public static void main(String[] args) {
		String str="aabbbcccc";
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			char[] res= str.toCharArray();
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			i++;
		if(count==1)
		{
			
		}
		else
		{
			System.out.print(str.charAt(i));
			System.out.print(count);
		}
		
	}

}
}
