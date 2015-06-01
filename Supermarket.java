public class Supermarket
{
	Till till1,till2;
	public Supermarket (Till till1, Till till2)
	{
		this.till1 = till1;
		this.till2 = till2;
	}
	public void addPerson(Person person, Till till)
	{
		till.insert(person);
	}
	public void	servePerson(Till till)
	{
		till.retrieve();
	}
	public void launch()
	{
		Person person1 = new Person ("Ali");
		addPerson (person1,till1);
		Person person2 = new Person ("John");
		addPerson (person2,till1);
		Person person3 = new Person ("Sarah");
		addPerson (person3,till1);
		Person person4 = new Person ("Liam");
		addPerson (person4,till2);
		Person person5 = new Person ("Martin");
		addPerson (person5,till2);
		Person person6 = new Person ("George");
		addPerson (person6,till1);
		Person person7 = new Person ("Mary");
		addPerson (person7,till2);
		Person person8 = new Person ("Joan");
		addPerson (person8,till1);
		Person person9 = new Person ("Lisa");
		addPerson (person9,till2);
		Person person10 = new Person ("Romeo");
		addPerson (person10,till1);
		servePerson(till1);
		servePerson(till1);
		servePerson(till2);
	}
	public static void main (String [] args )
	{
		Till till1 = new Till ("left Till");
		Till till2 = new Till ("right Till");
		Supermarket ALDI = new Supermarket(till1 ,till2);
		ALDI.launch();
	}


}