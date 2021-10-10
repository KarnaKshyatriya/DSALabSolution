import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
	String check;

	BalancingBrackets()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sequence of Brackets");
		check=sc.nextLine();
		if(balancingBrackets(check))
					System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
		sc.close();
	}

	public boolean balancingBrackets(String str)
	{
		int len=str.length();
		Stack<Character> stk=new Stack<>();
		boolean counter=false;
		
		for(int i=0;i<len;i++)
		{
			char check=str.charAt(i);
			if(check=='('||check=='{'||check=='[')
			{
				stk.push(check);
			}

			if(stk.isEmpty())
				return false;

			
			char compare;

			switch(check) {
			case ')': compare=stk.pop();
			if(compare=='(')
				counter=true;
			break;
			case '}':compare=stk.pop();
			if(compare=='{')
				counter=true;
			break;
			case ']':compare=stk.pop();
			if(compare=='[')
				counter=true;
			break;
			//default: System.out.println("Error in logic");

			}

		}
		
		if(!stk.isEmpty())
			counter=false;
		
		return counter;
	}
	public static void main(String args[])
	{
		new BalancingBrackets();
	}
}
