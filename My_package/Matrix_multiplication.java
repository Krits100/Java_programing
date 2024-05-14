package My_package;
import java.util.*;
public class Matrix_multiplication {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int x[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.println("Enter the values of 1st matrix: ");  //matrix 1
			x[i][j]=sc.nextInt();
		}
	}
	
	int y[][]=new int[3][3];
	for(int j=0;j<3;j++)
	{
		for(int k=0;k<3;k++)
		{
			System.out.println("Enter the values of 2nd matrix: ");   //matrix 2
			y[j][k]=sc.nextInt();
		}
	}
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print( +x[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int j=0;j<3;j++)
	{
		for(int k=0;k<3;k++)
		{
			System.out.print(+y[j][k]+" ");
		}
		System.out.println();
	}
	
	int z[][]=new int[3][3]; // 3rd matrix where multi values will be stroed.
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			z[i][j]= x[i][j] * y[j][k];
		}	
		System.out.print(+z[i][j]+" ");	
	}
	System.out.println();
}
}
	
