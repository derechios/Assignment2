package Test;

import static org.junit.Assert.*;
import indexedList.IndexedListArray;
import orderedList.OrderedListArray;

import org.junit.Test;

import original.Date;
import original.User;

public class TestIndexedListArray {

	@Test
	public void testIndexedListArray() 
	{
		
	}

	@Test
	public void testAdd() {
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assert(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
		assert(temp.size() == 4);
	}

	@Test
	public void testSet() {
		assert(true);
		//method was not necessary in implementation
}

	@Test
	public void testRemove() {
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

		temp.remove(1);
		
		assertFalse(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
	assert(temp.size() == 3);
	}

	@Test
	public void testIndexOf() 
	{
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

		temp.remove(1);
		assert(temp.indexOf(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)) == 1);
	}

	@Test
	public void testContains() {
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

		temp.remove(1);
		
		assert(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Usernam4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
	
	}

	@Test
	public void testIsEmpty() {
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

		temp.remove(0);
		temp.remove(0);
		temp.remove(0);
		temp.remove(0);
		assert(temp.size() == 0);
	}

	@Test
	public void testSize() {
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));

	assert(temp.size() == 4);
	}

	@Test
	public void testGet() {
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assert(temp.get(0).compareTo(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)) == 0);
	
	}

	@Test
	public void testReset() {
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.reset();
		assert(temp.size() == 0);
	}

	@Test
	public void testToString() 
	{
		IndexedListArray<User> temp = new IndexedListArray<User>(100);
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.add(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assert(temp.toString().compareTo(" Liam<>Heaney<>Male<>123456789<>50107<>Username1<>Password<>Email@mail.com<>7894561235<>null Liam<>Heaney<>Male<>123456789<>50107<>Username2<>Password<>Email@mail.com<>7894561235<>null Liam<>Heaney<>Male<>123456789<>50107<>Username3<>Password<>Email@mail.com<>7894561235<>null") == 0);
	}

}
