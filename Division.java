import java.util.Scanner;
public class Division
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ( " Enter a number ");
String s1=scanner.next();
System.out.println (" Enter another number ");
String s2=scanner.next();
int number1=Integer.parseInt(s1);
int number2=Integer.parseInt(s2);
int answer=1;

while  ((number1-number2)>= number2) {
	answer++;
	number1=number1-number2;
}

System.out.println ( "The answer is "+answer);
System.out.println ( "The the remaider is "+(number1-number2));
	
}}

