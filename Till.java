public class Till implements PersonQueue
{
	private Person queueHead;
	private Person queueTail;
	private String tillName;
	public Till (String str)
	{
		queueHead = null;
		queueTail = null;
		tillName = str;
	}
	public void insert (Person person)
	{
		if (queueHead == null)
		{
			queueHead = person;
			queueTail = person;
			System.out.println (" Person named "+person.name+" has joined the till "+this.tillName);
		} else
		{
			queueTail.prev = person;
	  			person.next= queueTail;
				 queueTail = person;
			System.out.println (" Person named "+person.name+" has joined the till "+this.tillName);

		}

	}
	public Person retrieve()
	{
		if (queueTail != null)
		{
			Person personRemoved = queueHead;
			if (queueHead.prev != null)
			{
				queueHead.prev.next = null;
			} else
			{
				queueHead = null;
				queueTail = null;
			}
			queueHead = queueHead.prev;
			System.out.println (" Person "+personRemoved.name+" was served!");
			return personRemoved;
		} else
		{
			return null;
		}
	}
}