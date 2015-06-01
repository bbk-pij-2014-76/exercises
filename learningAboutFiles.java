import java.io.*;

public class learningAboutFiles
{
	public static void main(String[] args)
	{
		File file = new File("myFile.txt");

		try
		{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				// ... do things with the data here
				System.out.println(line);
				String[] parts = line.split(" ");
				for(int i=0; i < parts.length; i++)
				{
					System.out.println(parts[i]);
				}
			}
			in.close();
		}

		catch (FileNotFoundException ex)
		{
			System.out.println("File " + file + " does not exist.");
		}

		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}