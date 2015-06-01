import java.util.Scanner;
public class distancePointtoPoint
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//import java.lang.Math;

Point p1 = new Point();
Point p2 = new Point();
Point p3 = new Point();
System.out.println (" Please enter the x coordinate of the first point ");
String sfx = scanner.next();
p1.x = Double.parseDouble(sfx);
System.out.println (" Please enter the y coordinate of the first point ");
String sfy = scanner.next();
p1.y = Double.parseDouble(sfy);

System.out.print ("P1 = ( " + p1.x + ", ");
System.out.println (p1.y + " )");

System.out.println (" Please enter the x coordinate of the second point ");
String ssx = scanner.next();
p2.x = Double.parseDouble(ssx);
System.out.println (" Please enter the y coordinate of the second point ");
String ssy = scanner.next();
p2.y = Double.parseDouble(ssy);

System.out.print ("P2 = ( " + p2.x + ", ");
System.out.println (p2.y + " )");

System.out.println (" Please enter the x coordinate of the third point ");
String stx = scanner.next();
p3.x = Double.parseDouble(stx);
System.out.println (" Please enter the y coordinate of the third point ");
String sty = scanner.next();
p3.y = Double.parseDouble(ssy);

System.out.print ("P3 = ( " + p3.x + ", ");
System.out.println (p3.y + " )");

double distanceP1P2 = 0;
double distanceP2P3 = 0;
double distanceP3P1 = 0;
double shortestDistance=0;

distanceP1P2 = calculateDistance ( p1 , p2 );
distanceP2P3 = calculateDistance ( p2 , p3 );
distanceP3P1 = calculateDistance ( p3 , p1 );

System.out.println ( " The distance P1 and P2 = " + distanceP1P2 );
System.out.println ( " The distance P2 and P3 = " + distanceP2P3 );
System.out.println ( " The distance P3 and P1 = " + distanceP3P1 );

if ( distanceP1P2 < distanceP2P3 ) {
	shortestDistance = distanceP1P2;
	if ( distanceP3P1 < shortestDistance ) {
			shortestDistance = distanceP3P1;
			System.out.println ( " P1 and P3 are closest ");
			} else {
			System.out.println ( " P1 and P2 are closet ");
			}
		

} else {
	shortestDistance = distanceP2P3;
	if ( distanceP3P1 < shortestDistance ) {
				shortestDistance = distanceP3P1;
				System.out.println ( " P1 and P3 are closest ");
				} else {
				System.out.println ( " P2 and P3 are closet ");
			}
}


} private static double calculateDistance ( Point a, Point b) {
double result = Math.sqrt( (a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y) );
return result;
}
	
}

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
}

class Rectangle {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	Point upLeft;
	Point downRight;
}
