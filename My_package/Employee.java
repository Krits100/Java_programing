package My_package;
import java.util.*;
class Emp
{
	int emp_id,salary;
	String dept,name;
	Emp(int id, String d , String n ,int sal){
	emp_id=id;
	salary=sal;
	dept=d;
	name=n;
	System.out.println("Account initialized.");
	}
	void show_data()
	{
		System.out.println("Employee id is:"+emp_id);
		System.out.println("Employee salary is:"+salary);
		System.out.println("Employee dept is:"+dept);
		System.out.println("Employee name is:"+name);
    }
	int get_id()
	{
		return emp_id;
	}
}
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Emp obj[]=new Emp[10];
		int i=0;
		while(true) {
			System.out.println("1.Create id\n 2.show details\n 3.search\n 4.Exit");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1: 
			if(i<10)
				System.out.println("Enter Employee id :");
				int e=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee dept is:");
				String d=sc.nextLine();
				System.out.println("Enter Employee name is:");
				String n=sc.nextLine();
				System.out.println("Enter Employee salary :");
				int s=sc.nextInt();
			
				Emp ob=new Emp(e,d,n,s);
				obj[i++]=ob;
				break;
		case 2:
			System.out.println("Enter Employee id :");
			int id=sc.nextInt();
			int f=0;
			for(int j=0;j<=i;j++)
			{
				if(obj[j].get_id()==id)
				{
					f=1;
					obj[j].show_data();
					break;
				}
			}
			if(f==0)
			{
				System.out.println("id not found.");
			}
			
		case 3: 
			System.out.println("Enter Employee id :");
			int ide=sc.nextInt();
			int f1=0;
			for(int j=0;j<=i;j++)
			{
				if(obj[j].get_id()==ide)
				{
					f1=1;
					System.out.println("id found.");
					obj[j].show_data();
					break;
				}
			}
			if(f1==0)
			{
				System.out.println("id not found.");
			}
		case 4:
			System.exit(0);
		default: 
			System.out.println("enter a valid choice.");
		}
	}

}
}