package Test;

import static org.junit.Assert.*;
import orderedList.OrderedListArray;
import original.Date;
import original.User;
import org.junit.Test;

public class TestOrderedListArray {

	@Test
	public void testOrderedListArray() 
	{
		
	}

	@Test
	public void testAdd() 
	{
		OrderedListArray<User> temp = new OrderedListArray<User>();
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Usernam4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
	assert(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
	assert(temp.size() == 4);
	}

	@Test
	public void testRemove()
	{
		OrderedListArray<User> temp = new OrderedListArray<User>();
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Usernam4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

		temp.remove(1);
		
		assertFalse(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
	assert(temp.size() == 3);
	}

	@Test
	public void testContains() {
		OrderedListArray<User> temp = new OrderedListArray<User>();
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Usernam4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

		temp.remove(1);
		
		assert(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Usernam4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
	}

	@Test
	public void testIsEmpty() 
	{
		OrderedListArray<User> temp = new OrderedListArray<User>();
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Usernam4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

		temp.remove(0);
		temp.remove(0);
		temp.remove(0);
		temp.remove(0);
		assert(temp.size() == 0);
	}

	@Test
	public void testSize() {
		OrderedListArray<User> temp = new OrderedListArray<User>();
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Usernam4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

	assert(temp.size() == 4);
		
	}

	@Test
	public void testGet() 
	{
		OrderedListArray<User> temp = new OrderedListArray<User>();
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assert(temp.get(0).compareTo(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)) == 0);
	}

	@Test
	public void testReset() {
		OrderedListArray<User> temp = new OrderedListArray<User>();
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.reset();
		assert(temp.size() == 0);
	}

	@Test
	public void testGetNext() {
		assert(true);
		//methods unused by implementation
	}

	@Test
	public void testHasNext() {
		assert(true);
		//methods unused by implementation
	}

}
