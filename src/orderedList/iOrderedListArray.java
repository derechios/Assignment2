package orderedList;
import original.User;
public interface iOrderedListArray <Type extends User>
{
	boolean add(Type t);
	Type remove(int i);
	boolean contains(Type t);
	boolean isEmpty();
	int size();
	Type get(int i);
	String toString();
	void reset();
	Type getNext();
	boolean hasNext();
}
