package queue;
import original.User;
public interface iQueueLinkedList <Type extends User>
{
	boolean enqueue(Type t);
	Type dequeue();
	boolean isEmpty();
	int size();
	String toString();
}
