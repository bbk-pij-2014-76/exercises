public class ExceptionThrower {
	public static void main(String[] args) {
		ExceptionThrower et = new ExceptionThrower();
		et.launch();
	}
	private void launch() {
		System.out.print("Write a number: ");
		try {
			int n = getNumber();
			System.out.println("You entered " + n + ".");
			String isOdd = (n % 2 == 0) ? "even" : "odd";
			System.out.println("You entered " + n + ", it is " + isOdd + ".");
		}
		catch (NumberFormatException exc) {
			exc.printStackTrace();
			System.out.println("What you entered is not an integer number!");
 		}
	}
	private int getNumber() {
		int result = 0;
		String str = System.console().readLine();
		result = Integer.parseInt(str);
		return result;
	}
}