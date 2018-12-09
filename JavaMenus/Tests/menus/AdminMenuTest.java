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
public class AdminMenuTest extends AdminMenu 
{
	int i  = 6;

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
	 * Test method for {@link menus.AdminMenu#WelcomeMenu()}.
	 */
	@Test
	public void testWelcomeMenu() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link menus.AdminMenu#OptionText()}.
	 */
	@Test
	public void testOptionText() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link menus.AdminMenu#Options(int)}.
	 */
	@Test
	public void testOptions() 
	{
		Options(i);
		assertTrue(i >= 0 && i < 4);
	}

	/**
	 * Test method for {@link menus.AdminMenu#Option1()}.
	 */
	@Test
	public void testOption1() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link menus.AdminMenu#Option2()}.
	 */
	@Test
	public void testOption2() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link menus.AdminMenu#Option3()}.
	 */
	@Test
	public void testOption3() {
		fail("Not yet implemented"); // TODO
	}

}
