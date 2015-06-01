public class Increaser implements Runnable {
	private Counter c;
	public Increaser(Counter counter)
	{
		this.c = counter;
	}
	public static void main(String args[])
	{
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++)
		{
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}
		public void run()
		{
			System.out.println("Starting at " + c.getCount());
			for (int i = 0; i < 1000; i++)
			{
				try {
					Thread.sleep(1); // sleep 1000ms = 1 second
				} catch (InterruptedException ex) {
				// Nothing to do in this case, just sleep less...
				}
				c.increase();
			}
			System.out.println("Stopping at " + c.getCount());
		}
}

