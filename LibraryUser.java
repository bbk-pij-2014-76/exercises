public class LibraryUser implements User {


	final private String personName;
	private int personId;

	public String getPersonName()
	{
		return personName;
	}

	public void setPersonId(int personId)
	{
		this.personId = personId;
	}

	public String getPersonId()
	{
		return personId;
	}

}