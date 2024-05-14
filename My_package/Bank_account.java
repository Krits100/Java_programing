package My_package;

import java.util.*;

class Bank
{
	int acc_no,balance;
	String name;
	Bank(int ac, int bal, String n)
	{
		acc_no=ac;
		balance=bal;
		name=n;
		System.out.println("Account initialised.");
	}
	
	void deposite()
	{
		System.out.println("Enter account number: ");
		Scanner sc=new Scanner(System.in);
		int acc=sc.nextInt();
		System.out.println("Enter amount you want to deposite: ");
		int money=sc.nextInt();
		//balance update
		balance+=money;
		System.out.println("Now your account balance is: "+balance);
	}
	
	void withdraw()
	{
		System.out.println("Enter account number: ");
		Scanner sc=new Scanner(System.in);
		int acc=sc.nextInt();
		System.out.println("Enter amount you want to withdraw: ");
		int taka=sc.nextInt();
		//update after withdraw
		balance-=taka;
		System.out.println("Now your account balance is: "+balance);
	}
	
	void show_details() 
	{
		System.out.println("Account number is: "+acc_no);
		System.out.println("Name of the employee is: "+name);
		System.out.println("Current balance present:"+balance);
	}
}

public class Bank_account {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank obj[]=new Bank[10];
		while(true) {
			System.out.println("1.Create account\n 2.show details\n 3.search\n 4.Exit");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter account number: ");
			Scanner sc1=new Scanner(System.in);
			int a=sc1.nextInt();
			Bank ob=new Bank(e,d,n,s);
			obj[i++]=ob;
			break;
		}
	}

}
}
