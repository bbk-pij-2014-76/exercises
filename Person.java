public class Person
{
	public String name;
	public Person next;
	public Person prev;

	public Person(String str)
	{
		this.name = str;
		next = null;
		prev = null;
	}

	public void add(Person newPerson)
	{
		if ( next == null ) {
			next = newPerson;
			prev = newPerson;
		} else {
			prev = newPerson;
		}
	}

	public Person remove()
	{
		if ( prev != null )
		{
			 Person removePerson = next;
			 return removePerson;
		} else
		{
			return null;
		}

	}

}