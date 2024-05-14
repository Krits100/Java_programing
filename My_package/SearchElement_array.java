package My_package;
import java.util.Scanner;

public class SearchElement_array {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array: ");
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		int arr[]=new int[z]; //array initiallization
		
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
			
		System.out.println("Enter the element to be searched within the array:");
		Scanner sc1=new Scanner(System.in);
		int search=sc1.nextInt();
		for( int i=0;i<=z;i++)
		{
			if(search==arr[i])
			{
				System.out.println("The element is present within the array.");
			}
			else
			{
				System.out.println("The element is not present within the array.");
			}
		}
	}

}
