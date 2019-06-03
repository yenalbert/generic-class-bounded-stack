
/**
 * @author Albert Yen
 * Bounded Stack implemented with a linked list, and a nested node class, with a pointed called: next;
 */
 
public class BoundedStack<E> {
	
	class Node 
	{
		public E item;
		public Node next;
		private Node(E i, Node n)
		{
			item = i;
			next = n;
		}	
	}
					
	private Node first;
	private int size;
		
	public BoundedStack (E x)
	{
		first = new Node(x, null);
	        size = 1;
	}
	   
	//This will be the push method, overflow method called if the size limit is reached;
	public void push (E x)
	{ 
		if (size==50) 
		{
			overflow();
		}
		
		first = new Node (x, first);
	    	size++;
	}
	
	//This method removes the oldest item in the stack;
	private void overflow()
	{
	    	Node f = first;
		while (f.next.next != null) 
		{
			f = f.next;
		}	
		
		f.next = null;
		size--;
	}
	 
	//This method removes the generic item from the top of the stack and returns it;  
	public E pop ()
	{
		E tempValue = null;
		if (first != null) 
		{
			tempValue = first.item;
			first = first.next;
		}
		return tempValue;
	}

	//This public method will return true if the stack is empty;
	public boolean isEmpty() 
	{
		if (first == null) 
		{
			return true;
		}
	    	return false;
	 }    

}
