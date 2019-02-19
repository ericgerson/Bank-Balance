import java.util.Scanner;

public class BankBalance
{
	public static void main(String[] args)
	{
		//variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Initial bank balance >> ");
		balance = keyboard.nextDouble();
		keyboard.nextLine(); //keyboard buffer to handle the pressing of the enter key
		
		
		//start the do...while loop!
		do
		{
			balance = balance + (balance *  INT_RATE);
			System.out.println("After year "+ year + " at " + INT_RATE + " interest rate, your balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balance at the end of another year");
			System.out.print("Enter 1 for yes or any other number for no >> ");
			response = keyboard.nextInt();
		} while(response == 1);
		
		System.out.println("Have a great day!");
	}
}


