public class SmartPhone extends MobilPhone
{
	public SmartPhone ( String brand)
	{
		super (brand);
	}
	public void browseWeb(String webLink)
	{
	 	System.out.println ( " Browsing the web-page "+webLink);
	}
	public String findPosition()
	{
	 	return " GPS position is abc";
	}
	public String getBrand()
	{
		return brand;
	}
}