package menus;

public class UserMenu 
{
	public void WelcomeMenu()
	{
		System.out.println("Hello user.");
	}
	public void OptionText()
	{
		System.out.println("please choose an option\n 1: Option1\n 2: Option2\n 3: Option3\n 0: Log Out");
	}
	public void Options(int choice)
	{
		switch(choice)
		{
			case 1:	Option1();
			break;
			case 2: Option2();
			break;
			case 3: Option3();
			break;
			case 0: System.out.print("logged out");
		}
		if(choice != 0)
			OptionText();
	}
	
	public void Option1()
	{
		System.out.println("Select Minions");
	}
	public void Option2()
	{
		System.out.println("Choose ships");
	}
	public void Option3()
	{
		System.out.println("bring rockets");
	}
	
}
