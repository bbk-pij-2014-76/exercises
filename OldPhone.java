public class OldPhone implements Phone
{
	public String brand = null;
	public OldPhone(String brand) {
	this.brand = brand;
	}
	public String getBrand() {
	return brand;
	}
// ... there is no setter for brand
	public void call(String number)
	{
		System.out.println ("Calling "+number+" ....");
	}
}