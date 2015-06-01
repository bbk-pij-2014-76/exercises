public class Script 	{
    public static void main(String[] args)
    {

		IntegerTreeNode n1 = new IntegerTreeNode(22);
		IntegerTreeNode n2 = new IntegerTreeNode(2);
		n1.add ( 23 );
		n1.add ( 93 );
		n1.add ( 83 );
		n1.add ( 3 );
		n1.add ( 65 );
		n1.add ( 13 );

		n1.printInOrder();
		if(n1.contains(23))
			System.out.println("Yes it does");
		else
			System.out.println("No it does not");

	}

}
