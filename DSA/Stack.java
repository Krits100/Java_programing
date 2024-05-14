package DSA;
import java.util.*;
public class Stack {
	private int size,top;
	private int stack[];
	
	public void Initialise(int s)
	{
		size=s;
		stack=new int[size];
		top=-1;
	}
	
	public void push()
	{
		if(stack[top]==stack[size])
			System.out.println("stack overflow");
		else
		{
			top=top++;
		}		
	}
	
	public void pop()
	{
		if(stack[top]==(-1))
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			top--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack stk=new Stack();
		int ch,var;
		while(true)
		{
			System.out.println("1.Push\n 2.Pop\n 3.Exit\n Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter number to be pushed: ");
					var=sc.nextInt();
					stk.push();
					break;
			case 2: System.out.println("Enter number to be poped: ");
					var=sc.nextInt();
					stk.pop();
					break;
			case 3: System.exit(0);
			default: System.out.println("Enter a valid input ");
			
			}		
		}
	}

}
