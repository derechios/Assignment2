package stack;
import original.User;
public interface iStackArray <Type extends User>
{
	
	boolean push(Type t);
	Type pop();
	boolean isEmpty();
	int size();
	String toString();
	boolean isFull();
}
