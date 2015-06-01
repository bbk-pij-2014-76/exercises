import java.util.Arrays;
import java.util.stream.Stream;
public class Example {
	public static void main ( String [] args) {
		int[] intArray = {1,2,3,4,5};
		System.out.println (
				Arrays.stream ( intArray)
				.map ( x -> x * x)
				.filter ( x -> x % 2 == 0)
				.count ()
				);
	}

}
