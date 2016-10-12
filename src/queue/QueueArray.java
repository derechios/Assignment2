package queue;
import java.lang.reflect.Array;
import java.util.EmptyStackException;

import original.User;
public class QueueArray<Type extends User> implements iQueueArray<Type>
{
	private Type[] arr;
	private int front, back, maxSize;
	@SuppressWarnings("unchecked")
	public QueueArray(int size)
	{	
		maxSize = size;
		if(maxSize < 10){maxSize = 10;}
		front = 0;
		back = 1;
		Type t = (Type) new User(null, null, null, 0, null, null, null, null,0, null);
		arr = (Type[]) Array.newInstance(t.getClass(), maxSize);
		
	}
	@Override
	/**
	 * adds element to queue
	 * if Element already present, returns false
	 */
	public boolean enqueue(Type t) 
	{
		
			if((back+1)%maxSize == front%maxSize)
			{
				throw new EmptyStackException();
				//throw full exception
			}
			arr[back%maxSize] = t;
			back++;
			return true;
	}

	@Override
	/**
	 * returns true if list is empty
	 */
	public boolean isEmpty() 
	{
		return (front +1) % maxSize == back%maxSize;
	}

	@Override
	/**
	 * returns number of elements in the list
	 */
	public int size() {
		return maxSize;
	}

	@Override
	/**
	 * removes and returns first element of the queue
	 */
	public Type dequeue() 
	{
		if(isEmpty())
		{
			return null;
			//throws empty exception
		}
		Type temp = arr[(front+1)%maxSize];
		front +=1;
		return temp;
	}
	/**
	 * returns true if element is within list
	 * @param t
	 * @return
	 */
	public boolean contains(Type t)
	{
		for(int x = front%maxSize; x<(back+1)%maxSize; x++)
		{
			if(arr[x % maxSize].compareTo(t)==0)
			{
				return true;
			}
		}
		return false;
	}

}
