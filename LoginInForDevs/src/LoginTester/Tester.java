package LoginTester;

import java.util.Scanner;

public class Tester 
{
	   public static void main(String [] args)
	   {
	         
	         @SuppressWarnings("resource")

			Scanner keyboardIn = new Scanner(System.in);
	         Login lg = new Login();
	         System.out.println("Hello User");
	         do
	         {
	            lg.introduction();
	            lg.accDetails(keyboardIn.nextLine());
	            lg.password(keyboardIn.nextLine());
	            lg.confirm();
	         }while(lg.check !=true);	         
	   }
}
