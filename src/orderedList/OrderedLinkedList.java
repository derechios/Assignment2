package orderedList;
import java.util.EmptyStackException;

import original.User;
import utils.MyLinkedList;

public class OrderedLinkedList<Type extends User> implements iOrderedLinkedList<Type>
{
	MyLinkedList<Type> front, back, iterator;
	private int size;

	public OrderedLinkedList()
	{
		front = null;
		back = null;
		iterator = null;
		size = 0;
	}
	@Override
	/**
	 * Adds Element to the list. If list is empty, creates it. If element already exists, returns false.
	 * 
	 * 
	 */
	public boolean add(Type t) 
	{
		if(contains(t))
		{
			return false;
		}
		if(size == 0)
		{
			front = new MyLinkedList<Type>(t);
			back = front;
			size +=1;
			setIter();
			return true;
		}
		MyLinkedList<Type> temp = front;
		while(temp.usernameNext != null && temp.value.compareTo(t)<0)
		{
			temp = temp.usernameNext;
		}
		MyLinkedList<Type> temp2 = temp.usernameNext;
		temp.usernameNext = new MyLinkedList<Type>(t);
		temp.usernameNext.usernamePrevious = temp;
		if(temp2!=null)
		{
			temp2.usernamePrevious = temp.usernameNext;
			temp.usernameNext.usernameNext = temp2;
		}
		size +=1;
		setIter();
		return false;
	}

	@Override
	/**
	 * removes an Element from the list
	 * throws exception if trying to remove from empty list
	 */
	public Type remove() 
	{
		if(size == 0)
		{
			throw new EmptyStackException();
		}
		MyLinkedList<Type> temp = front;
		
		MyLinkedList<Type> temp2 = temp.usernameNext;
		if(temp.usernamePrevious != null)
		{
			temp.usernamePrevious.usernameNext = temp2;
		}
		if(temp2 != null)
		{
			temp2.usernamePrevious = temp.usernamePrevious;
		}
		size -=1;
		setIter();
		return temp.value;
		
	}
		@Override
		/**
		 * returns true if the element is found within the list
		 */
	public boolean contains(Type t) 
	{
			if(isEmpty())
			{
				return false;
			}
			MyLinkedList<Type> temp = front;
			while(temp != null)
			{
				if(temp.value.compareTo(t)==0)
				{
					return true;
				}
				temp = temp.usernameNext;
			}
		return false;
	}

	@Override
	/**
	 * returns true if the list is empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	/**
	 * returns the size of the list
	 */
	public int size() {
		return size;
	}

	@Override
	/**
	 * returns the value at the iterator
	 */
	public Type get() 
	{
		return iterator.value;
	}

	@Override
	/**
	 * resets the list to empty
	 */
	public void reset()
	{
		front = null;
		back = null;
		iterator = null;
		size = 0;
	}

	@Override
	/**
	 * moves iterator to next node, as long as node is not null
	 */
	public void getNext() 
	{
		if(hasNext())
		{
			iterator=iterator.usernameNext;
		}
	}

	@Override
	/**
	 * returns true if there is a previous node
	 */
	public boolean hasPrevious()
	{
		return iterator.usernamePrevious != null;
		
	}
	/**
	 * moves iterator to previous node, unless previous node is null
	 */
	public void getPrevious()
	{
		if(hasPrevious())
		{
			iterator=iterator.usernamePrevious;
		}
		
	}
	/**
	 * returns true if there is a next node
	 */
	public boolean hasNext() {
		return iterator.usernameNext != null;
	}
	public void setIter()
	{
		iterator = front;
	}

}
