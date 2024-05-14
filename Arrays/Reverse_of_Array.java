package Arrays;
import java.util.*;
public class Reverse_of_Array {
int i,n;
int[] arr=new int[10];
	public void Array()
	{
	System.out.println("Enter total number of elements: ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=0;i<=n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.print("The number of elements are:" +arr[i]);
	}

	public void reverse()
	{
	for(i=n;i>=0;i--)
	{
		System.out.print(+arr[i]);
	}
	}

	public static void main(String[] args) {
	Reverse_of_Array ob=new Reverse_of_Array();
	ob.Array();
	ob.reverse();
}
}