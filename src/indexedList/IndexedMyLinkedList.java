package indexedList;
import utils.MyLinkedList;
import original.User;
public class IndexedMyLinkedList<Type extends User> extends MyLinkedList<Type>
{
	private int userIndex, genderIndex, dobIndex;
	public IndexedMyLinkedList<Type> next, previous;
	public IndexedMyLinkedList(Type t) {
		super(t);
		userIndex = 0;
		genderIndex = 0;
		dobIndex = 0;
		// TODO Auto-generated constructor stub
	}
	public void setUserIndex(int t)
	{
		userIndex = t;
	}
	public void setGenderIndex(int t)
	{
		genderIndex = t;
	}
	public void setDOBIndex(int t)
	{
		dobIndex = t;
	}
	public int getDOBIndex()
	{
		return dobIndex;
	}
	public int getGenderIndex()
	{
		return genderIndex;
	}
	public int getUserIndex()
	{
		return userIndex;
	}

}
