import org.junit.*;
import static org.junit.Assert.*;
public class PersonTest
{
	@Test
	public void testsNormalName()
	{
		Person p = new Person();
		String input = "Dereck Robert";
		String output = p.getInitials(input);
		String expected = "Mr D";
		assertEquals(output, expected);
	}
}