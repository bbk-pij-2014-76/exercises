import java.io.*;

public class MakeDirectory
{
	public static void main(String[] args)
	{
		File directory = new File(args[0]);
		directory.mkdir();
	}
}