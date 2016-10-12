package indexedList;

public interface iIndexedListArray <Type>
{

	boolean add(Type t);
	boolean set(int i, Type t);
	Type remove(int i);
	int indexOf(Type t);
	boolean contains(Type t);
	boolean isEmpty();
	int size();
	Type get(int i);
	String toString();
	void reset();
	

	 
}
