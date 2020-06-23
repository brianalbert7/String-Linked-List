package lab04stringlinkedbagsum19;

/**
 *
 * @author Brian Albert
 */
public class StringLinkedBag {
    private StringNode head;
    private StringNode tail;
    private int numElements;
    
    public StringLinkedBag()
    {
        head = null;
        tail = null;
        numElements = 0;
    }
    
    /**
     * getSize method returns the number of elements
     * @return The value in the numElements field
     */
    public int getSize()
    {
        return numElements;
    }
    
    /**
     * add method adds a String 
     * @param element The String to be added
     */
    public void add(String element)
    {
        if (tail == null)
        {
            head = new StringNode(element, null);
            tail = head;
        }
        else
        {
            tail.setLink(new StringNode(element, null));
            tail = tail.getLink();
        }
        numElements++;
    }
    
    /**
     * exists boolean checks if a string exists in the data
     * @param target is the target value checked for existence
     * @return That the value has been found
     */
    public boolean exists(String target)
    {
        boolean found = false;
        StringNode cursor = head;
        
        while (cursor!= null && !found)
        {
            if (cursor.getData().equalsIgnoreCase(target))
                found = true;
            else
                cursor = cursor.getLink();
        }
        return found;
    }
    
    /**
     * countOccurences method looks for a String in the data
     * @param target The String to be found in the data
     * @return an int with the number of times target is 
     * found in the data
     */
    public int countOccurences(String target)
    {
        int numOccur = 0;
        StringNode cursor = head;
        
        while (cursor != null)
        {
            if (cursor.getData().equalsIgnoreCase(target))
                numOccur++;
            else
                cursor = cursor.getLink();
        }
        
        return numOccur;
    }
    
    /**
     * remove method looks for the 1st occurrence of a String
     * and removes it
     * @param target The String to be removed
     * @return a boolean to indicate if the target was removed
     */
    public boolean remove(String target)
    {
        StringNode cursor = head, previous = null;
        boolean found = false;
        
        while (cursor!= null && !found)
        {
            if (cursor.getData().equalsIgnoreCase(target))
                found = true;
            else
            {
                previous = cursor;
                cursor = cursor.getLink();
            }
        }
        if (found && cursor != null)
        {
            if (previous == null)
                head = head.getLink();
            else
                previous.setLink(cursor.getLink());
            
            if (tail == cursor)
                tail = previous;
            numElements--;
        }
        return found;
    }
    
    /**
     * the iteratorPrototype method "copies" the linked list and passes the
     * copied linked list to a new ListerPrototype2
     *
     * @return a ListerPrototype2 using a copy of the linked list
     */
    public ListerPrototype2 iteratorPrototype() {
        // declare variables
        StringNode headOfListToReturn; // beginning of new "copied" list
        StringNode cursorOfListToCopy; // active node of list to copy
        StringNode lastNodeOfListToReturn; // end of new "copied" list

        // establish the copied list
        headOfListToReturn = null;

        if (head != null) {
            // create the head of the new list
            headOfListToReturn = new StringNode(head.getData(), null);
            // use lastNodeOfListToReturn as a pointer to the last node in the copied list
            lastNodeOfListToReturn = headOfListToReturn;
            // use currentCursor as the pointer to the existing list
            cursorOfListToCopy = head.getLink();
            // if we have a node...
            while (cursorOfListToCopy != null) {
                // create a new node from the end of the new list
                lastNodeOfListToReturn.setLink(new StringNode(cursorOfListToCopy.getData(), null));
                // move lastNodeOfListToReturn to the new last node
                lastNodeOfListToReturn = lastNodeOfListToReturn.getLink();
                // move the cursorOfListToCopy to the next node
                cursorOfListToCopy = cursorOfListToCopy.getLink();
            }
        }

        return new ListerPrototype2(headOfListToReturn);
    }
    
}
