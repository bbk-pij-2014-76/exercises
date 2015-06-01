import java.io.*;

public class DirectoryList
{
	public static void main(String[] args)
	{
		String directoryName;
		File directory;
		String[] files;
		System.out.println(" Please enter the directory name ");
		directoryName = System.console().readLine();
		directory = new File(directoryName);
		try
		{

			if ( directory.isDirectory() == false ) {
				try
				{
					if (directory.exists() == false)
				}
				catch
				{
					System.out.println ("There is no such directory!");
				}
		catch
		{
			System.out.println ("That file is not a directory.");
		}

			String[] parts = line.split(" ");
			for(int i=0; i < parts.length; i++)
			{
			System.out.println(parts[i]);
			}
			}
			in.close();
		}

		else
		{
			files = directory.list();
			System.out.println ("Files in directory \"" + directory + "\":");
			for (int i = 0; i < files.length; i++)
			   System.out.println ("   " + files[i]);
		}
	}
}