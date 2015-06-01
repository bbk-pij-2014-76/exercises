import java.io.*;

public class listFiles
{
	public static void main(String[] args)
	{
		File directory = new File(args[0]);

			String[] files = directory.list();
			for(int i=0; i < files.length; i++)
			{
				System.out.println(files[i]);
			}

	}
}