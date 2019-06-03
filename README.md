# generic-class-bounded-stack-browser-history
Browser History and Maji Game implementation with a, generic class, bounded stack (Last-in, First-out), without any use of the classes from the Java Collections Framework. An object of the BoundedStack class declared as a String BoundedStack will be used for a browser back button. Another object of the BoundedStack class, this one declared as a Double BoundedStack, will be used to get spell potency values for a maji game. 

A generic class called BoundedStack. When the capacity is exhausted, a call to push will result in the placement of the new item, trading off with the least recently accessed item. This bounded stack can handle overflow of over 50 items.

You can create your own BoundedStack class from scratch using a linked list or array implementation, or you can modify any of the classes provided in the modules to meet the requirements of a bounded stack. However, you cannot use any of the classes from the Java Collections Framework, (like ArrayList, etc).  Just for fun, I do highly recommend trying this assignment with one of more of these classes, but do not turn that in. 

Important Note: I will ask you to redo the assignment if you use a Stack class that does not meet the requirements of a bounded stack that handles overflow over 50 items, or if you implement your BoundedStack with a class from the Java Collections Framework.

Generic BoundedStack class: 
Must be a generic class.
public void push(E item): This method adds the generic item to the top. If the stack is full, the overflow method is called.
public E pop(): This public method removes the generic item from the top of the stack and returns it.  
private void overflow(): This private method removes the oldest item in the stack.  
public boolean isEmpty(): This public method will return true if the stack is empty

Browser History:

When the client visits more pages, it will make room in the history for a new page by throwing away the page which is on the very bottom of the history (i.e., the least recently visited page). When the client wishes to go back to the last visited page, that page will be popped from the top of the history.

Maji Game:

The BoundedStack class will assist with a larger game that includes characters who battle using magical spells.  Because each of the spells has a potency value, the spell with the highest potency wins the battle.  Throughout the game, players stack their spells to be used later in a speed battle round up to a maximum of 50 spells.  During the game, if a player adds a spell when the stack is full, the spell is added to the top of the BoundedStack and the least recently added spell is removed from the bottom. In the speed battle, the last spell to be added to the stack is played first. You will use the BoundedStack class to load one player's spell potency values into the stack, then display the stack in reverse order to simulate the order each spell potency will be used in the speed round.
