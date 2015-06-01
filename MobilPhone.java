public class MobilPhone extends OldPhone
{
	private String lastNumbers[] = new String[10];
	public MobilPhone (String brand)
	{
		super(brand);
		for (int i=0; i<10; i++)
			lastNumbers[i]="";
	}
	public void ringAlarm(String alarm)
	{
		System.out.println (" Alarm "+alarm);
	}
	public void playGame(String game)
	{
		System.out.println (" Game "+game);
	}
	public void printLastNumbers()
	{
		for (int i=0; i<10; i++)
		{
			if (!lastNumbers.equals(""))
				System.out.println (lastNumbers[i]);
		}
	}
}