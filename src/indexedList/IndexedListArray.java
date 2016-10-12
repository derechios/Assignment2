package indexedList;
import java.lang.reflect.Array;

import original.User;

public class IndexedListArray <Type extends User> implements iIndexedListArray<Type>
{
	private Type[] arr;
	private int maxSize, currentSize;
	@SuppressWarnings("unchecked")
	/**
	 * An Indexed List using an Array as the base.
	 * 
	 */
	public IndexedListArray(int n)
	{
		currentSize = -1;
		maxSize = n;
		if (maxSize < 100){maxSize = 100;}
		Type t = (Type) new User(null, null, null, 0, null, null, null, null, 0, null);
		arr = (Type[]) Array.newInstance(t.getClass(), maxSize);
	}
	@Override
	/**
	 * adds an Element to the array, at the end. Resizes the array if it is full.
	 */
	public boolean add(Type t) 
	{
		if(contains(t))
		{
			return false;
		}
		if(currentSize == maxSize)
		{
			reSize();
		}
		currentSize+=1;
		arr[currentSize] = t;
		return true;
	}
	/**
	 * Resizes the underlying array by creating a new, larger array then moving the stored elements of the Original Array to the new one. Finally, it
	 * sets the new array as the primary array, and garbage collection takes the original array.
	 */
	private void reSize()
	{
		maxSize *= 1.3;
		@SuppressWarnings("unchecked")
		Type t = (Type) new User(null, null, null, 0, null, null, null, null, 0, null);
		Type[] arr2 = (Type[]) Array.newInstance(t.getClass(), maxSize);
		for(int x = 0; x<currentSize; x++)
		{
			arr2[x]=arr[x];
			
		}
		arr=arr2;
	}
	@Override
	/**
	 * sets a particular element as a particular index, as long as the index is within 0 and (number-of-elements)
	 */
	public boolean set(int i, Type t) 
	{
		if(currentSize+1 == maxSize){reSize();}
		if(i>-1 && i<currentSize)
		{
			arr[i] = t;
			return true;
		}
		throw new IndexOutOfBoundsException();
		
	}
	@Override
	/**
	 * removes a particular index, as long as the index is within 0 and (number-of-elements)
	 */
	public Type remove(int i) 
	{
		
		if(i <= currentSize&& i>-1)
		{
			Type t = arr[i];
			for(int x = i; x<currentSize; x++)
			{
			arr[x] = arr[x+1];
			}
			currentSize -=1;
			return t;
		}
		throw new IndexOutOfBoundsException();
		
	}
	@Override
	/**
	 * returns the index of a particular element; returns -1 if not found
	 */
	public int indexOf(Type t) 
	{
		for(int x = 0; x<currentSize; x++)
		{
			if(arr[x].compareTo(t)==0)
			{
				return x;
			}
		}
		return -1;
	}
	@Override
	/**
	 * returns whether the data structure contains a particular element
	 */
	public boolean contains(Type t) 
	{
		for(int x = 0; x<currentSize; x++)
		{
			if(arr[x].compareTo(t)==0)
			{
				return true;
			}
		}
		return false;
	}
	@Override
	/**
	 * returns whether the array is Empty.
	 */
	public boolean isEmpty() 
	{
		return currentSize == -1;
	}
	@Override
	/**
	 * returns the size of the array
	 */
	public int size() 
	{
		return currentSize+1;
	}
	@Override
	/**
	 * returns the element found at a particular index, throws exception if index is larger than size of list
	 */
	public Type get(int i) 
	{
		if(i>=1 && i<currentSize)
		{
			return arr[i];
		}
		throw new IndexOutOfBoundsException();
	}
	@SuppressWarnings("unchecked")
	@Override
	/**
	 * resets array to new, size 1000 array
	 */
	public void reset() 
	{
		maxSize = 1000;
		Type t = (Type) new User(null, null, null, 0, null, null, null, null, 0, null);
		arr = (Type[]) Array.newInstance(t.getClass(), maxSize);
		currentSize = -1;
		
	}
	public String toString()
	{
		System.out.println(arr[0].toString());
		String temp = "";
		for(int x = 0; x<currentSize; x++)
		{
			temp += " " +arr[x].toString();
		}
		return temp;
	}
	
}
