package Test;
import static org.junit.Assert.*;
import indexedList.IndexedListArray;

import org.junit.Test;

import stack.StackArray;
import original.Date;
import original.User;

public class TestStackArray {

	@Test
	public void testStackArray() 
	{

	}

	@Test
	public void testPush() {
		StackArray<User> temp = new StackArray<User>(100);
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
	
		assert(temp.size() == 4);
		
	}

	@Test
	public void testPop() {
		StackArray<User> temp = new StackArray<User>(100);
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
	
		assert(temp.pop().compareTo(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null))==0);
	}

	@Test
	public void testIsEmpty() {
		StackArray<User> temp = new StackArray<User>(100);
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assertFalse(temp.isEmpty());
		temp.pop();
		temp.pop();
		temp.pop();
		temp.pop();
		assert(temp.isEmpty());
	}

	@Test
	public void testSize() {
		StackArray<User> temp = new StackArray<User>(100);
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assert(temp.size() == 4);
	}

	@Test
	public void testIsFull() {
		StackArray<User> temp = new StackArray<User>(10);
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username5", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username6", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username7", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username8", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username9", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username10", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.push(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username11", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assert(temp.isFull());
	}

}
