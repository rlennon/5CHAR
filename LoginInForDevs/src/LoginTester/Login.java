package LoginTester;

public class Login 
{
	public boolean check;
	   private String username;
	   private String password;
	   private String user = "scarletOC";
	   private String userP = "MeanGirls2004"; /*i know nothing about scarlet but i 
	                                             assume she is into meangirls as much as i am*/
	                                             
	   private String admin = "admin";
	   private String adminP = "password";                                          
	   
	   
	   public void introduction()
	   {
	      System.out.println("Please enter your username: ");
	      check = false;
	   }
	   
	   
	   public void confirm()
	   {
	         if(username.equals(user) && password.equals(userP))
	         {
	            System.out.println("Welcome to the MF9K, Scarlet");
	            check = true;
	         }
	         else if(username.equals(admin) && password.equals(adminP))
	         {
	            System.out.println("Welcome admin why are you here go away");
	            check = true;
	         }  
	         else
	         {
	            System.out.println("WRONG USERNAME AND/OR PASSWORD!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	         }      
	   }
	   public String accDetails(String usrname)
	   {
	      username = usrname;
	      if(usrname.equals(user))
	      {
	         System.out.println("Please enter a password: ");
	         return usrname;

	      }
	      else
	      {
	         System.out.println("Please enter a password: ");   
	         return usrname;
	      }      
	   }  
	   
	   public String password(String pass)
	   {
	      password = pass;
	      if(pass.equals(userP))
	      {
	         return pass;

	      }
	      else
	      {
	         return pass;
	      }  
	   }

}
