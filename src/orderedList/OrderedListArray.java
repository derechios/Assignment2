package orderedList;
import java.lang.reflect.Array;

import original.User;
public class OrderedListArray <Type extends User> implements iOrderedListArray<Type>
{
	private int size, maxSize;
	private int DEFAULT_SIZE = 100;
	private Type[] arr;
			
	@SuppressWarnings("unchecked")
	/**
	 * starting stats: size 0, maximum size 100.
	 */
	public OrderedListArray()
	{
		maxSize = DEFAULT_SIZE;
		size = 0;
		Type t = (Type) new User(null, null, null, DEFAULT_SIZE, null, null, null, null, DEFAULT_SIZE, null);
		arr = (Type[]) Array.newInstance(t.getClass(), maxSize);
		//arr = (Type[]) new Object[maxSize];
	}
	@Override
	/**
	 * adds an element to the array. If the array is full, resizes the array first.
	 */
	public boolean add(Type t) 
	{
		
		if(size == maxSize)
		{
			maxSize = (int) (1.3*maxSize);
			Type[] temp = (Type[]) new Object[maxSize];
			for(int x = 0; x<size; x++)
			{
				temp[x] = arr[x];
			}
			arr = temp;
		}
		if(size == 0)
		{
			arr[size]=t;
			size+=1;
			return true;
		}
		int y = 0;
		while(y<size && t.compareTo(arr[y])<0)
		{
			y++;
		}
		if(y == size)
		{
			arr[y] = t;
		}
		else
		{
			Type temp = arr[y];
			arr[y] = t;
			while(y<=size)
			{
				Type temp2 = arr[y];
				arr[y] = temp;
				temp = temp2;
				y+=1;
			}
		}
		size +=1;
		return true;
	}

	@Override
	/**
	 * removes an Element given its index
	 */
	public Type remove(int i)
	{
		if(i<0 || i> size)
		{
			throw new IndexOutOfBoundsException();
		}
		Type t = arr[i];
		int x = i;
		x+=1;
		while(x<size)
		{
			arr[x-1] = arr[x];
			x+=1;
		}
		size -=1;
		return t;
	}

	@Override
	/**
	 * returns true if the element is contained within the data structure
	 */
	public boolean contains(Type t) {
		for(int x = 0; x<size; x++)
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
	 * returns size == 0
	 */
	public boolean isEmpty() 
	{
		return size == 0;
	}

	@Override
	/**
	 * returns the size.
	 */
	public int size() 
	{
		return size+1;
	}

	@Override
	/**
	 * returns the element at index i
	 */
	public Type get(int i) {
		return arr[i];
	}

	@Override
	/**
	 * resets the array back to empty, array size 100.
	 */
	public void reset()
	{
		maxSize = DEFAULT_SIZE;
		size = 0;
		Type t = (Type) new User(null, null, null, DEFAULT_SIZE, null, null, null, null, DEFAULT_SIZE, null);
		arr = (Type[]) Array.newInstance(t.getClass(), maxSize);
		
	}

	@Override
	/**
	 * not used really.
	 */
	public Type getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/**
	 * literally useless as I have implemented it.
	 */
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * returns index of an element
	 * @param t
	 * @return
	 */
	public int indexOf(Type t)
	{
		for(int x = 0; x<size; x++)
		{
			if(arr[x].compareTo(t)==0)
			{
				return x;
			}
		}
		return -1;
	}
}
