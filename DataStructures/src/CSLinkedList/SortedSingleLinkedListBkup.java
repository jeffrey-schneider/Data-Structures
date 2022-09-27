/*
 * A more appropriate solution would be to use a builder/factory object to 
 * prevent the use of super.addFirst(E item) 
*   super.add(int index, E item)
*   super.add(E item)
*   super.set(E item), E newValue()
 */
package CSLinkedList;

/**
 *
 * @author JeffreySchneider
 */
public class SortedSingleLinkedListBkup<E> extends SingleLinkedList<E> {
    
    public SortedSingleLinkedListBkup(){
        
    }
    
    /**Add
     * @param <E> 
     * @returns none
     * adds an item into the list in sorted order
     */
    public void add(Comparable item){
        //make the new node to insert into the list
        Node newNode = new Node(item);
        // first see if the list is empty
		if (head == null)
		{
			System.out.println("add "+item +" to front");
			head = newNode;
			return;
		}
		// there is something in the list
		// now check to see if it belongs in front
		else if (item.compareTo(head.data) < 0)
		{
			System.out.println("add "+item +" before "+head.data);
			newNode.next = head;
			head = newNode;
		}
		// otherwise, step down the list.  n will stop 
		// at the node after the new node, and trailer will
		// stop at the node before the new node
		else
		{
			Node after = head.next;
			Node before = head;
			while (after != null)
			{
				if (item.compareTo(after.data) < 0)
					break;
				before = after;
				after = after.next;
			}
			// insert between before & after
			newNode.next = before.next;
			before.next = newNode;
			System.out.println("add "+item +" after "+before.data);
		}
                size++;
	}
     
    /**
     *
     * @param index
     * @param newValue
     * @return
     */
    @Override
    public E set(int index, E newValue) {
        return null;
    }
    
}
