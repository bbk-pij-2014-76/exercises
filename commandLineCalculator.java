import java.util.Scanner;
	public class commandLineCalculator {

			public static void main(String[] args)  {
						System.out.println (" Please enter an expression ");
						Scanner sc= new Scanner(System.in);
						String s1=sc.nextLine();
						int num2=0;
						int result = 0;
						String str="";
						for ( int i=0 ; i<s1.length() ; i++ ) {
								if ( s1.charAt(i) == '+' ) {
										str="+";
										num2 = Integer.parseInt (s1.substring ( i , i+2 ) );
								} else if ( s1.charAt(i) == '-' ) {
										str="-";
										num2 = Integer.parseInt (s1.substring ( i , i+2 ) );
								} else if  ( s1.charAt(i) == '+' ) {
										str="+";
										num2 = Integer.parseInt (s1.substring ( i , i+2 ) );
								} else if ( s1.charAt(i) == '*' ) {
										str="*";
										num2 = Integer.parseInt (s1.substring ( i , i+2 ));
								} else if ( s1.charAt(i) == '%' ) {
										str="%";
										num2 = Integer.parseInt (s1.substring ( i , i+2 ));
								}
						}

	switch (str) {		case "+": result=result+num2;
		break;
		case "-": result=result-num2;
		break;
		case "*":result=result*num2;
		break;
		case "%": result=result/num2;
		break;
		default: System.out.println (" Invalid choise ");
	}

	System.out.println ( result );



//System.out.println (result);
			}
	}

