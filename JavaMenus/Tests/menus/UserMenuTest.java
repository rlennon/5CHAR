/**
 * 
 */
package menus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author MartinF
 *
 */
public class UserMenuTest extends UserMenu 
{
	int i = 4;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link menus.UserMenu#WelcomeMenu()}.
	 */
	@Test
	public void testWelcomeMenu() {
	}

	/**
	 * Test method for {@link menus.UserMenu#OptionText()}.
	 */
	@Test
	public void testOptionText() {
	}

	/**
	 * Test method for {@link menus.UserMenu#Options(int)}.
	 */
	@Test
	public void testOptions() 
	{
		assertTrue(i >= 0 && i < 4);
	}

	/**
	 * Test method for {@link menus.UserMenu#Option1()}.
	 */
	@Test
	public void testOption1() {
		 // TODO
	}

	/**
	 * Test method for {@link menus.UserMenu#Option2()}.
	 */
	@Test
	public void testOption2() {
	}

	/**
	 * Test method for {@link menus.UserMenu#Option3()}.
	 */
	@Test
	public void testOption3() {
	}

}
