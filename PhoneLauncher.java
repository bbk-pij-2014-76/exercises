public class PhoneLauncher
{
	public static void main(String[] args)
	{
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch()
	{
		// your code creating and using SmartPhone here...
		SmartPhone myPhone = new SmartPhone("iphone");
		myPhone.call ("02088988989");
		myPhone.call ("02088903489");
		myPhone.call ("02088908679");
		myPhone.call ("02088908970");
		myPhone.ringAlarm ("Jazz");
		myPhone.playGame ("Cricket");
		myPhone.browseWeb ("www.yahoo.com");
		myPhone.findPosition ();
		myPhone.getBrand();
	}
}