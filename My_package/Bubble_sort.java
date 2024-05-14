package My_package;
import java.util.*;
public class Bubble_sort {
	
	public class bubble{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i,j;
		System.out.println("Enter the values in the array: ");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<5;i++)
		{
			System.out.println("The array elements are:" +arr[i]);
		}
		
		for(i=0;i<5;i++)
		{
		int min=arr[i];
		
		if(arr[i+1]>arr[i])
		{
			min=arr[i];
		}
		else
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		}
		
	}

	public static void main(String[] args) {
		bubble.obj=new bubble();
		obj.bubble();
		
}
}
