package menus;
import java.util.Scanner;

public class userTester 
{
	
	public static void main(String [] args)
	{
		Scanner keyboardIn = new Scanner(System.in);
		UserMenu UM = new UserMenu();
		
		int i;
				
		UM.WelcomeMenu();
		UM.OptionText();

		do
		{
			i = keyboardIn.nextInt();
			
			UM.Options(i);
		}while(i != 0);
	}
}
