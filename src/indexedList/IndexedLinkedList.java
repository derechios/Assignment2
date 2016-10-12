package indexedList;
import java.util.EmptyStackException;

import original.User;
public class IndexedLinkedList<Type extends User > implements iIndexedLinkedList<Type> 
{

	IndexedMyLinkedList<Type> userFront, userBack, genderFront, genderBack, dobFront, dobBack;
	private int size;
	
	public IndexedLinkedList()
	{
	
		size = 0;
		userFront = null;
		userBack = null;
		genderFront = null;
		genderBack = null;
		dobFront = null;
		dobBack = null;
		
	}
	@Override
	/**
	 * Adds User to Linked List if User not already present
	 * support for Gender and DOB orderings not included
	 * if Greater than number of elements in list, adds at back of list and changes index accordingly

	 */
	public boolean addUser(Type t, int i) {

		if(i>size || i<0)
		{
			throw new IndexOutOfBoundsException();
		}
		if(contains(t))
		{
			return false;
		}
		
		IndexedMyLinkedList<Type> temp = new IndexedMyLinkedList<Type>(t);
		if(size == 0)
		{
			userFront = temp;
			userBack = temp;
			genderFront = temp;
			genderBack = temp;
			dobFront = temp;
			dobBack = temp;
			size +=1;
			temp.setDOBIndex(0);
			temp.setGenderIndex(0);
			temp.setUserIndex(0);
			return true;
		}
		if(contains(t))
		{
			return false;
		}
		IndexedMyLinkedList<Type> iter = userFront;
		for(int x = 0; x<i && iter.next != null; x++)
		{
			iter = iter.next;
		}
		IndexedMyLinkedList<Type> temp2 = iter;
		
		iter = iter.next;
		temp.setUserIndex(i);
		temp2.next = temp;
		temp.previous = temp2;
		temp.next = iter;
		if(iter!=null)
		{
			iter.previous = temp;
		}
		while(iter != null)
		{
			iter.setUserIndex(iter.getUserIndex()+1);
			iter = iter.next;
		}
		
		size +=1;
		return true;
	}

	@Override
	public void set(Type t, int i) 
	{
		addUser(t, i);
		
	}

	@Override
	/**
	 * removes an element from the list, then fixes indexes after it.
	 */
	public Type remove(int i) 
	{
		if(i>size || i<0)
		{
			throw new IndexOutOfBoundsException();
		}
		IndexedMyLinkedList<Type> temp = userFront;
		int x = 0;
		while(temp != null&& x<i)
		{
			temp = temp.next;
			x+=1;
		}
		IndexedMyLinkedList<Type> temp2 = temp.previous;
		Type t = temp.value;
		if(temp.next != null)
		{
			temp.next = temp2;
		}
		if(temp2!= null)
		{
			temp2.next = temp.next;
		}
		temp = temp.next;
		while(temp != null)
		{
			temp.setUserIndex(temp.getUserIndex()-1);
			if(temp.next == temp)
			{
				break;
			}
			temp = temp.next;
		}
		size -=1;
		return t;
	}

	
	@Override
	/**
	 * returns true if the element is within the list
	 * throws exception if empty list
	 */
	public boolean contains(Type t) 
	{
		if(size == 0)
		{
			return false;		
		}
		IndexedMyLinkedList<Type> iter = userFront;
		while(iter!=null )
		{
			if(iter.value.compareTo(t)==0)
			{
				return true;
			}
			if(iter.next == null)
			{
				return false;
			}
			iter = iter.next;
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
	 * returns size of the list
	 */
	public int size() {
		return size;
	}

	@Override
	/**
	 * Resets the list 
	 */

	public void reset() 
	{
		size = 0;
		userFront = null;
		userBack = null;
		genderFront = null;
		genderBack = null;
		dobFront = null;
		dobBack = null;
	}

	@Override
	/**
	 * NonFunctional Code Intended for Later Expansion
	 */
	public boolean addGender(Type t, int i) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	/**
	 * NonFunctional Code Intended for Later Expansion
	 */
	public boolean addDob(Type t, int i) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	/**
	 * NonFunctional Code Intended for Later Expansion
	 */
	public int userIndexOf(Type t) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	/**
	 * NonFunctional Code Intended for Later Expansion
	 */
	public int genderIndexOf(Type t) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	/**
	 * NonFunctional Code Intended for Later Expansion
	 */
	public int dobIndexOf(Type t) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Type getUser(int i)
	{
		if(i>size || i<0)
		{
			throw new IndexOutOfBoundsException();
		}
		IndexedMyLinkedList<Type> temp = userFront;
		int x = 0;
		while(temp != null&& x<i)
		{
			temp = temp.next;
			x+=1;
		}
		return temp.value;
	}
	@Override
	/**
	 * NonFunctional Code Intended for Later Expansion
	 */
	public Type getGender(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	/**
	 * NonFunctional Code Intended for Later Expansion
	 */
	public Type getDob(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString()
	{
		String temp = "";
		IndexedMyLinkedList<Type> iter = userFront;
		while(iter!= null)
		{
			temp +=" " + iter.value.toString();
			iter = iter.next;
		}
		return temp;
	}

	
}
