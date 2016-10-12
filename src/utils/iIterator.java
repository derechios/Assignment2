package utils;

public interface iIterator <Type, Collection>
{
	Type getValue();
	boolean hasNext();
	void next();
	boolean hasPrevious();
	void previous();
	
}
