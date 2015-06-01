import java.util.Scanner;


public class hanoiTowers {

	String s;
	int hanoi ( int m ) {
					 	if (m==1) {
								return 1;
						} else if (m == 2 ) {
								return 3;
						} else
							return hanoi(m-1) + 1 + hanoi(m-1);
	}


	public static void main (String [] args ) {
			Scanner scanner = new Scanner(System.in);
			System.out.println (" Please enter a No of discs to move ");
			hanoiTowers towers = new hanoiTowers();
			towers.s = scanner.nextLine();
			int n = Integer.parseInt ( towers.s);
			System.out.println ( towers.hanoi ( n ));
	}
}


