package stack;

import java.util.EmptyStackException;

import utils.MyLinkedList;
import original.User;

public class StackLinkedList<Type extends User> implements iStackLinkedList<Type>
{
	private MyLinkedList<Type> usernameFront, usernameBack, genderFront, genderBack, dobFront, dobBack;
	private int size;
	public StackLinkedList()
	{
		size = 0;
		usernameFront = null; 
		usernameBack = null; 
		genderFront = null; 
		genderBack = null; 
		dobFront = null; 
		dobBack = null; 
		
	}
	@Override
	/**
	 * Adds element to list
	 * If list is empty, creates it
	 * If element already present, returns false
	 */
	public boolean push(Type t) {
		if(isEmpty())
		{
			MyLinkedList<Type> temp = new MyLinkedList<Type>(t);
			usernameFront = temp;
			usernameBack = usernameFront;
			usernameFront.usernameNext = usernameBack;
			usernameBack.usernamePrevious = usernameFront;
			
			genderFront = temp;
			genderBack = genderFront;
			genderFront.genderNext = genderBack;
			genderBack.genderPrevious = genderFront;
			
			dobFront = temp;
			dobBack = dobFront;
			dobFront.dobNext = dobBack;
			dobBack.dobPrevious = dobFront;
			size +=1;
			return true;
		}
		if(contains(t))
		{
			return false;
		}
		MyLinkedList<Type> temp = new MyLinkedList<Type>(t);
		
		usernameBack.usernameNext = temp;
		temp.usernamePrevious = usernameBack;
		usernameBack = temp;
		
		genderBack.usernameNext = temp;
		temp.genderPrevious = genderBack;
		genderBack = temp;
		
		genderBack.usernameNext = temp;
		temp.genderPrevious = genderBack;
		genderBack = temp;
		size+=1;
		return true;
	}

	@Override
	/**
	 * removes and returns top element by Username
	 */
	public Type popUser() 
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		
		
		MyLinkedList<Type> temp = usernameBack;
		if(size == 1)
		{
			usernameFront = null;
			usernameBack = null;
			genderFront = null;
			genderBack = null;
			dobFront = null;
			dobBack = null;
			size -=1;
			return temp.value;
		}
		
		usernameBack = usernameBack.usernamePrevious;
		usernameBack.usernameNext = null;

		MyLinkedList<Type> tempNextGender =temp.genderNext;
		MyLinkedList<Type> tempPreviousGender =temp.genderPrevious;
		if(tempNextGender != null){ tempNextGender.genderPrevious = tempPreviousGender;}
		if(tempPreviousGender != null){ tempPreviousGender.genderNext = tempNextGender;}
		
		MyLinkedList<Type> tempNextDOB =temp.dobNext;
		MyLinkedList<Type> tempPreviousDOB =temp.dobPrevious;
		if(tempNextDOB != null){ tempNextDOB.dobPrevious = tempPreviousDOB;}
		if(tempPreviousDOB != null){ tempPreviousDOB.dobNext = tempNextDOB;}
		
		size -=1;
		return temp.value;
		
	}

	@Override
	/**
	 * returns top element by username
	 */
	public Type topUser() {
		return usernameBack.value;
	}

	@Override
	/**
	 * returns true if empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	/**
	 * returns Size
	 */
	public int size() {
		
		return size;
	}
	@Override
	/**
	 * removes and returns top element by Gender
	 */
	public Type popGender() {
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		MyLinkedList<Type> temp = genderBack;
		if(size == 1)
		{
			usernameFront = null;
			usernameBack = null;
			genderFront = null;
			genderBack = null;
			dobFront = null;
			dobBack = null;
			size -=1;
			return temp.value;
		}
		
		genderBack = genderBack.genderPrevious;
		genderBack.genderNext = null;

		MyLinkedList<Type> tempNextDOB =temp.dobNext;
		MyLinkedList<Type> tempPreviousDOB =temp.dobPrevious;
		if(tempNextDOB != null){ tempNextDOB.dobPrevious = tempPreviousDOB;}
		if(tempPreviousDOB != null){ tempPreviousDOB.dobNext = tempNextDOB;}
		
		MyLinkedList<Type> tempNextUser =temp.usernameNext;
		MyLinkedList<Type> tempPreviousUser =temp.usernamePrevious;
		if(tempNextUser != null){ tempNextUser.usernamePrevious = tempPreviousUser;}
		if(tempPreviousUser != null){ tempPreviousUser.usernameNext = tempNextUser;}
		
		size -=1;
		return temp.value;
	}
	@Override
	/**
	 * removes and returns top element by DOB
	 */
	public Type popDOB() {
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
				MyLinkedList<Type> temp = dobBack;
				if(size == 1)
				{
					usernameFront = null;
					usernameBack = null;
					genderFront = null;
					genderBack = null;
					dobFront = null;
					dobBack = null;
					size -=1;
					return temp.value;
				}
				
				dobBack = dobBack.dobPrevious;
				dobBack.dobNext = null;

				MyLinkedList<Type> tempNextGender =temp.genderNext;
				MyLinkedList<Type> tempPreviousGender =temp.genderPrevious;
				if(tempNextGender != null){ tempNextGender.genderPrevious = tempPreviousGender;}
				if(tempPreviousGender != null){ tempPreviousGender.genderNext = tempNextGender;}
				
				MyLinkedList<Type> tempNextUser =temp.usernameNext;
				MyLinkedList<Type> tempPreviousUser =temp.usernamePrevious;
				if(tempNextUser != null){ tempNextUser.usernamePrevious = tempPreviousUser;}
				if(tempPreviousUser != null){ tempPreviousUser.usernameNext = tempNextUser;}
				
				size -=1;
				return temp.value;
	}
	@Override
	/**
	 * returns top element by Gender
	 */
	public Type topGender() {
		return genderBack.value;
	}
	@Override
	/**
	 * returns the top element by DOB
	 */
	public Type topDob() {
		return dobBack.value;
	}
	/**
	 * returns true if element is contained within the data structure
	 */
	public boolean contains(Type t)
	{
		MyLinkedList<Type> temp = usernameFront;
		for(int x = 0; x<size && temp != usernameBack; x++)
		{
			
			if(t.compareTo(temp.value)==0)
			{
				return true;
			}
			temp = temp.usernameNext;
		}
		return false;
	}

}
