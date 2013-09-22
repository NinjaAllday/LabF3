
import java.util.Scanner;
public class LabF3 
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		String pick;
		String breakfest;
		
		System.out.println("If User Is Hungry"); 
		System.out.println("Get In Line");
		System.out.println("Buy Lunch");
		System.out.println("Are You Thirsty?");
		
		System.out.println("Y for yes, N for no");
		pick = input.next();
		if (pick.equals("Y"))
		{
			System.out.println("Did You Eat Breakfest?");
			System.out.println("Y for yes, N for no");
			breakfest = input.next();
				if (breakfest.equals("Y"))
				{
					System.out.println("Buy Diet Coke");
				}
				else
				{
					System.out.println("Buy Coke");
				}
		}
		else
		{
			System.out.println("Get Water");
		}
		
			
		
		System.out.println("Eat Lunch");
		System.out.println("Return Tray");
		System.out.println("Leave");
	}

}

