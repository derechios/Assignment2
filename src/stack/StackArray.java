package stack;
import original.User;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class StackArray<Type extends User> implements iStackArray<Type>
{

	private Type[] arr;
	private int size, maxSize;
	@SuppressWarnings("unchecked")
	/**
	 * creates array, at least size 10
	 * @param max
	 */
	public StackArray(int max)
	{
		if(max< 10){max = 10;}
		maxSize = max-1;
		Type t = (Type) new User(null, null, null, 0, null, null, null, null,0, null);
		arr = (Type[]) Array.newInstance(t.getClass(), max);
		size = 0;
		
	}
	@Override
	/**
	 * Adds element to the array
	 */
	public boolean push(Type t) {
		if(isFull() || contains(t))
		{
			return false;
		}
		size +=1;
		arr[size] = t;
		return true;
		
	}
	/**
	 * returns true if the element is inside the array
	 */
	
	private boolean contains(Type t)
	{
		if(size == 0)
		{
			return false;
		}
		for(int x = 0; x<size; x++)
		{
			if(arr[x] == null)
			{
				return false;
			}
			if(arr[x].compareTo(t)==0)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	/**
	 * returns the top element in the array
	 */
	public Type pop() {
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		size -=1;
		return arr[size+1];
	}

	@Override
	/**
	 * returns true of array is empty
	 */
	public boolean isEmpty() {
		return size ==0;
	}

	@Override
	/**
	 * returns the size.
	 */
	public int size() {
		return size;
	}
	@Override
	/**
	 * returns true if full
	 */
	public boolean isFull() {
		return size == maxSize;
	}

}
