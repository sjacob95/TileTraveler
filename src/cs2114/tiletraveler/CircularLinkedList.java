package cs2114.tiletraveler;

/**
 * Circular Linked List to hold directions for enemies to move
 *
 * @param <E>
 *            type of data in list
 * @author Luciano Biondi (lbiondi)
 * @version 2013.11.16
 */
public class CircularLinkedList<E>
{
    private int     size;
    private Node<E> addingItem;
    private Node<E> currentItem;
    private Node<E> firstItem;


    /**
     * Create a new CircularLinkedList object
     */
    public CircularLinkedList()
    {
        clear();
    }


    /**
     * clear the list
     */
    public void clear()
    {
        size = 0;
        addingItem = new Node<E>(null);
        firstItem = new Node<E>(null);
    }


    /**
     * adds a Node before the currentItem
     *
     * @param item
     *            is the item to add to list
     */
    public void add(E item)
    {
        Node<E> itemToAdd = new Node<E>(item);
        if (size == 0)
        {
            addingItem = itemToAdd;
            firstItem = itemToAdd;
            currentItem = firstItem;
            addingItem.join(addingItem);
            size++;
        }
        else
        {
            Node<E> newNext = addingItem.split();
            itemToAdd.join(newNext);
            addingItem.join(itemToAdd);
            addingItem = itemToAdd;
            size++;
        }
    }


    /**
     * method to go to next node
     */
    public void next()
    {
        currentItem = currentItem.next();
    }

    /**
     * method to return the data of current
     * @return E value of current node
     */
    public E getCurrent()
    {
        return currentItem.data();
    }

    /**
     * method to return first of list
     * @return E value of first node
     */
    public E getFirst()
    {
        return firstItem.data();
    }

    // ----------------------------------------------------------
    /**
     * @return the size of the path
     */
    public int size()
    {
        return size;
    }
}
