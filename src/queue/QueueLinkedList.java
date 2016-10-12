package queue;
import java.util.EmptyStackException;

import original.User;
import utils.MyLinkedList;
public class QueueLinkedList<Type extends User> implements iQueueLinkedList<Type>
{
	private MyLinkedList<Type> front, back;
	private int size;
	public QueueLinkedList()
	{
		size = 0;
		
	}

	@Override
	/**
	 * adds element to queue
	 * if Element already present in queue, returns false
	 */
	public boolean enqueue(Type t) 
	{
		if(contains(t)){return false;}
		if(isEmpty())
		{
			front = new MyLinkedList<Type>(t);
			back = front;
		}
		back.usernameNext = new MyLinkedList<Type>(t);
		back.usernameNext.usernamePrevious = back;
		back = back.usernameNext;
		size +=1;
		return false;
	}

	@Override
	/**
	 * removes and returns first element in the queue
	 */
	public Type dequeue()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		Type temp = front.value;
		if(front == back)
		{
			
			size = 0;
			front = null;
			back = null;
			return temp;
		}
		front = front.usernameNext;
		front.usernamePrevious = null;
		size -=1;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/**
	 * returns true if list is empty
	 */
	public boolean isEmpty()
	{
		return size ==0;
	}

	@Override
	/**
	 * returns number of elements
	 */
	public int size() 
	{
		return size();
	}
	/**
	 * @param t
	 * A Type extending User
	 * @return
	 * returns true if element inside list
	 */
	public boolean contains(Type t)
	{
		if(size == 0)
		{
			return false;
		}
		MyLinkedList<Type> temp = front;
		while(temp.usernameNext!=null)
		{
			if(temp.value.compareTo(t)==0)
			{
				return true;
			}
			temp = temp.usernameNext;
		}
		return false;
		
	}

}
