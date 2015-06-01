/**
 * Created by Ali on 24/01/2015.
 */
public class Comparator
{
	public static void main (String [] args )
	{
		Comparator myComparator = new Comparator();
		myComparator.launch();
	}
	public void launch()
	{
		System.out.println ( getMax (2.95, 3.45));
		System.out.println ( getMax ("69", "96"));
	}
	public int getMax(int n, int m)
	{
		 return( (int)getMax((double)n , (double)m) );
	}
	public double getMax(double d1, double d2)
	{
		if (d1 > d2)
		{
			return d1;
		} else
		{
			return d2;
		}
	}
	public String getMax(String number1, String number2)
	{
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		return Integer.toString( getMax( (int)n1, (int)n2 ));
	}
 }

