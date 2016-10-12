package stack;

import original.User;

public interface iStackLinkedList <Type extends User>
{

	boolean push(Type t);
	Type popUser();
	Type popGender();
	Type popDOB();
	Type topUser();
	Type topGender();
	Type topDob();
	boolean isEmpty();
	int size();
	String toString();
}
