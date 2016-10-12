package utils;
import original.User;

public class MyLinkedList <Type extends User>
{
	public Type value;
	public MyLinkedList<Type> genderNext, genderPrevious, dobNext, dobPrevious, usernameNext, usernamePrevious;
	public MyLinkedList(Type t)
	{
		value = t;
		genderNext = null;
		genderPrevious = null;
		dobNext = null;
		dobPrevious = null;
		usernameNext = null;
		usernamePrevious = null;
		
	}
}
