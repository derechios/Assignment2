package orderedList;
import original.User;

public interface iOrderedLinkedList<Type extends User>
{
	boolean add(Type t);
	Type remove();
	boolean contains(Type t);
	boolean isEmpty();
	int size();
	Type get();
	String toString();
	void reset();
	void getNext();
	boolean hasNext ();
	boolean hasPrevious();
}
