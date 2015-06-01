public class ArrayStack<T> implements Stack<T> {
		private T[] contents;
		private int headIndex;

// ... constructor and other methods would be here ...

		public ArrayStack(int size) {
			this.contents= (T[]) new Object[size] ; // = new T[];   // = (int) 5.0  // = (double) 1 // = (Person) myEmployee // = (Employee) myPerson
			this.headIndex=0;
		}

		public void push(T newElement) {
			contents[headIndex] = newElement;
			headIndex++;
		}

		public T pop() {
			if (headIndex == 0) {
				return null;
			}
			headIndex--;
			T result = contents[headIndex];
			contents[headIndex] = null;
			return result;
		}
}