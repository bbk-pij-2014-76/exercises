public class Person
{
	public String firstName;
	public String middleName;
	public String getInitials ( String str)
	{
		char c = str.charAt(0);
		String s ="Mr " + c;
		return s;
	}
}