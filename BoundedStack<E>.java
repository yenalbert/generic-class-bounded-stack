
/**
 * @author Albert Yen
 * Project 2 - CS 111C
 */
 
public class BoundedStack<E> {
	
					class Node {
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
	   
	    //This will be the push method, overflow method called if the size limit is reached.
	    public void push (E x)
	    { 
		    if (size==50) 
				    {
				    overflow();
				    }	
		first = new Node (x, first);
	    size++;
	    }
	    
	    private void overflow()
	    {
	    	Node f = first;
			    	while (f.next.next != null) {
			    		f = f.next;
			    	}	
		f.next = null;
		//How do I traverse back through the list? Or does this do it?;
		//I feel like f still points to null next, it doesn't point to head of list;
		//first = f;
		size--;
	    }
	    
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

	    
	    public boolean isEmpty() 
	    {
		    	if (first == null) 
			    	{
			    		return true;
			    	}
	    	return false;
	    }
	    
	    

}
