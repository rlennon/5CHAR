package LoginTester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		@SuppressWarnings("resource")

		Scanner keyboardIn = new Scanner(System.in);
		System.out.println("Hello User");//

		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";
		String sql = "SELECT * FROM user_account WHERE user_name = ? and password = ?";

		System.out.println("Please enter your username: ");
		String usernameIn = keyboardIn.nextLine();

		System.out.println("Please enter your password: ");
		String passwordIn = keyboardIn.nextLine();

		Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // loading the driver
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		PreparedStatement pst = con.prepareStatement(sql);

		pst.execute("USE test");

		pst.setString(1, usernameIn);
		pst.setString(2, passwordIn);

		// Get people with user name and password
		ResultSet res = pst.executeQuery();

		if (res.next()) {
			System.out.println(usernameIn + " has logged in with password " + passwordIn); // + " " +
																							// res.getString("lname"));
		}

		// free resources
		con.close();
		// stt.close();
		res.close();
	}

}
