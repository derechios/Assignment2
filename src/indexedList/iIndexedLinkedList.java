package indexedList;
import original.User;

public interface iIndexedLinkedList<Type extends User >
{
	boolean addUser(Type t, int i);
	boolean addGender(Type t, int i);
	boolean addDob(Type t, int i);
	void set(Type t, int i);
	Type remove(int i);
	int userIndexOf(Type t);
	int genderIndexOf(Type t);
	int dobIndexOf(Type t);
	boolean contains(Type t);
	boolean isEmpty();
	int size();
	Type getUser(int i);
	Type getGender(int i);
	Type getDob(int i);
	String toString();
	void reset();
	//Type getNext();
	//boolean hasNext();
}
