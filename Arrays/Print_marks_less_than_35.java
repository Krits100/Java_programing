package Arrays;
import java.util.*;
public class Print_marks_less_than_35 {
	int[] arr=new int[10];  
	int i,n;
	public void Initialize()
	{
		//int[] arr=new int[] {2,3}; //process 1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of students: ");
		n=sc.nextInt();
		//user input
		System.out.println("Enter the marks each student got: ");
		for(i=0;i<=n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<=n;i++)// for printing
		{
			System.out.println("Element at index" + i + "is :" +arr[i]);
		}
	}	
		//main question part
	public void Check()
	{
		for(i=0;i<=n;i++)
		{
		if(arr[i]<35)
		{
			System.out.println("student with roll no" + i + "Fails in the exam");
		}
		else
		{
			System.out.println("student with roll no" + i + "Pass in the exam");
		}
		}
	}	
	
	public static void main(String[] args) {
		Print_marks_less_than_35 obj=new Print_marks_less_than_35();
		obj.Initialize();
		obj.Check();
	}

}
