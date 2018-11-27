import java.util.Scanner;

public class Login {

public static void main(String[] args) {

    String Username;
    String Password;
    String Spaceship;
    String Plane;

    Username = "Scarlett_Overkill";
    Password = "password";
    Spaceship = "Minion_Spaceship";
    Plane = "Minion_Plane";
   

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("Access Granted! Welcome Scarlett Overkill! It's time to put your evil plan into action and invade Minion Island.");
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password! Access Denied!");
    }
    
    Scanner input3 = new Scanner(System.in);
    System.out.println("Enter desired mode of transport to Minion Island : ");
    String transport = input3.next();

    if (transport.equals(Plane)) {

        System.out.println("Excellent choice! Let's decide on what weapons to bring!");
    }

    else if (transport.equals(Spaceship)) {
        System.out.println("Let's get ready for 3,2,1... LIFTOFF!!!!!!!!!");
    } 
    
    


}


   
    

}