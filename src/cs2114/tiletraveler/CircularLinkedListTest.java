package cs2114.tiletraveler;

/**
 * Example unit tests for the CircularLinkedList class.
 *
 * @author Luciano Biondi (lbiondi)
 * @version 2013.11.16
 */
public class CircularLinkedListTest
    extends student.TestCase
{
    private CircularLinkedList<String> list;
    private Node<String> noder;

    /**
     * Creates a brand new, empty CircularLinkedList for each test method.
     */
    public void setUp()
    {
        list = new CircularLinkedList<String>();
        noder = new Node<String>("hi");
    }

    /**
     * assertions for the list
     */
    public void testList()
    {
        list.add("hi");
        list.add("hello");
        list.add("goodbye");
        assertEquals(list.getCurrent(), "hi");
        list.next();
        assertEquals(list.getCurrent(), "hello");
        assertEquals(list.getFirst(), "hi");
        list.next();
        assertEquals(list.getCurrent(), "goodbye");
        list.next();
        assertEquals(list.getCurrent(), "hi");
        assertEquals(list.getFirst(), "hi");
        noder.previous();
    }
}
