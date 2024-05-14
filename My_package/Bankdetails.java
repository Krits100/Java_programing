package My_package;
import java.util.*;

class bank
{
	int balance=100;
	int nom,nom1;
	bank(){
		System.out.println("Enter your acc number: ");
		Scanner sc=new Scanner(System.in);
		int acc_no=sc.nextInt();
		System.out.println("Welcome user " +acc_no);
	}
	public void balanceCheck()
	{
		System.out.println("Your current balance is: " +balance);
	}
	
	public void creditamount()
	{
		System.out.println("Enter the amount to be credited: ");
		Scanner sc=new Scanner(System.in);
		int credit=sc.nextInt();
		nom=balance+credit;
		System.out.println("Your balence after credit :: "+nom);
		balance=nom;
	}
	
	public void debitamount()
	{
		System.out.println("Enter the amount to be debited: ");
		Scanner sc=new Scanner(System.in);
		int debit=sc.nextInt();
		nom1=balance-debit;
		System.out.println("After debit now the curent amount is:: "+nom1);
		balance=nom1;
	}
	public void update()
	{
		//int update=balance;
	}

}
public class Bankdetails {

	public static void main(String[] args) {
			bank obj=new bank();
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("1.Check bank balence\n 2.Credit amount\n 3.Debit amount\n  Enter your choice::");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1: 
						obj.balanceCheck();
						obj.update();
						break;
				case 2: 
						obj.creditamount();
						break;
				case 3: 
						obj.debitamount();
						break;
				case 4: 
					    System.exit(0);
				default: 
						System.out.println("Enter correct input, thanks .");
				}
			}

	}

}
