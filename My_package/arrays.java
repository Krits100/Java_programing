package My_package;
import java.util.*;
public class arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter vthe size pf the array:");
		int z=sc.nextInt();
		int arr[]= new int[z];
		int max=arr[0];
		int min=arr[0];
		System.out.println("enter values:");
		for(int i=0;i<z;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.println("the given array is:");
			for( int i=0;i<z;i++)
			{
				System.out.println(+arr[i]);	
			}
			
			
			
	for(int i=1;i<z;i++)
	{
	
		if(max<arr[i])
		{
			max=arr[i];
		}
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
	
	System.out.println("the max is:" +max);
	System.out.println("the min is:" +min);	
			
}
}
