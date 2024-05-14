package Arrays;
import java.util.*;
public class Remove_duplicate {
	public static void main(String[] args) {
				int n,i,count=0;
				int[] arr=new int[10];
				System.out.println("Enter total number of elements: ");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				for(i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}   //array elements input
				
				for(i=0;i<=n;i++)
				{
						if(arr[i]==arr[i+1])
						{
							arr[i+1]=arr[i+1]+1;
							arr[i]=arr[i+1];
							System.out.println(+arr[i]);
						}
						

						else
						{
							System.out.println("No duplicate element present.");
						}
									}
				
	}

}
