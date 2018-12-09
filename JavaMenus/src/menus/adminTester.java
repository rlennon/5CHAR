package menus;
import java.util.Scanner;

public class adminTester 
{
	
	public static void main(String [] args)
	{
		Scanner keyboardIn = new Scanner(System.in);
		AdminMenu AM = new AdminMenu();
		
		int i;
				
		AM.WelcomeMenu();
	
		AM.OptionText();

		do
		{
			i = keyboardIn.nextInt();
			
			AM.Options(i);
		}while(i != 0);
	}
}
