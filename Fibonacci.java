public class Fibonacci
{
	// arrays are 0-based, so F(1) is stored at position 0, etc
	private int[] precalculated = null;
	public int fib(int n)
	{
		if (precalculated == null)
		{
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1)
		{
			return precalculated[n-1];
		} else
		{
			int result = fib(n-1) + fib(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}
	private void initPrecalculatedArray(int size)
	{
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++)
		{
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}

	// ...additional code would go here...

	public long fibo (int n)
	{
		if ((n == 1) || (n == 2))
		{
		 return 1;
		} else
		{
		 long result = fib(n-1) + fib(n-2);
		 return result;
		}
	}

}