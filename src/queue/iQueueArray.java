package queue;
import original.User;

public interface iQueueArray <Type extends User>
{

	boolean enqueue(Type t);
	Type dequeue();
	boolean isEmpty();
	int size();
	String toString();
	
}