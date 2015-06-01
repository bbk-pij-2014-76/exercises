public class IntegerTreeNode {
		int value;
		IntegerTreeNode left;
		IntegerTreeNode right;

		public IntegerTreeNode () {
				this.value = 0;
		}

		public IntegerTreeNode ( int value ) {
				this.value = value;
		}

		public void add(int newNumber) {
			if (newNumber > this.value) {
							if (right == null) {
								right = new IntegerTreeNode(newNumber);
							} else {
								right.add(newNumber);
							}
			} else {
							if (left == null) {
								left = new IntegerTreeNode(newNumber);
							} else {
								left.add(newNumber);
							}
			}
		}

		public void printInOrder() {
			if(this.left == null && this.right == null)
				System.out.println("  Traversed " + this.value);
			else
			{
			  if (this.left != null && this.right != null) {
					this.left.printInOrder();
					System.out.println("  Traversed " + this.value);
					this.right.printInOrder();
			  }
			  else
			  {
				  if (this.left != null && this.right == null) {
						this.left.printInOrder();
						System.out.println("  Traversed " + this.value);
				  }

				  if (this.left == null && this.right != null) {
						System.out.println("  Traversed " + this.value);
						this.right.printInOrder();
				  }
			  }
			}
  		}

		public boolean contains(int n)
		{
			if 	(n == this.value)
			{
				return true;
			}
			else
			{
				if 	(n > this.value)
				{
					if (right == null)
					{
						return false;
					}
					else
					{
						return right.contains(n);
					}
				}
				else
				{
					if (left == null)
					{
						return false;
					}
					else
					{
						return left.contains(n);
					}
				}
			}
		}
}