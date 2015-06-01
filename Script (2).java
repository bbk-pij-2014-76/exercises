public class Script 	{
    public static void main(String[] args)
    {

		Stack<Integer> myNumberStack = new ArrayStack<Integer>(10);
		Stack<String> myStringStack = new ArrayStack<String>(10);
		myNumberStack.push(1);
		myNumberStack.push(100);
		myNumberStack.push(431);
		myNumberStack.push(121);
		myNumberStack.push(10);
		myStringStack.push("Test string!");

		System.out.println(myNumberStack.pop());
		System.out.println(myNumberStack.pop());
		System.out.println(myNumberStack.pop());
		System.out.println(myNumberStack.pop());



	}

}
