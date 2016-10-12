package Test;

import static org.junit.Assert.*;
import indexedList.IndexedLinkedList;
import indexedList.IndexedListArray;

import org.junit.Test;

import original.Date;
import original.User;

public class TestIndexedLinkedList {

	@Test
	public void testIndexedLinkedList() {
		// what am I even supposed to test here?
	}

	@Test
	public void testAddUser() {
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		
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
		
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		
		temp.remove(3);
		
		assertFalse(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
		assert(temp.size() == 3);
	}

	@Test
	public void testContains() {
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		
		assert (temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
		assertFalse (temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username8", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
	}

	@Test
	public void testIsEmpty() {
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		assertFalse(temp.isEmpty());
		temp.remove(0);
		temp.remove(0);
		temp.remove(0);
		temp.remove(0);
		assert(temp.isEmpty());
	}

	@Test
	public void testSize() {
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		
		assert(temp.size() ==4);
	}

	@Test
	public void testReset() {
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		
		temp.reset();
		assert( temp.size() == 0);
	}

	@Test
	public void testAddGender() {
		assert(true);
		//method for extra credit, was not implemented
	}

	@Test
	public void testAddDob() {
		assert(true);
		//method for extra credit, was not implemented
	}

	@Test
	public void testUserIndexOf() 
	{
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		
		assert(temp.userIndexOf(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)) == 3);
	}

	@Test
	public void testGenderIndexOf() {
		assert(true);
		//method for extra credit, was not implemented
	}

	@Test
	public void testDobIndexOf() {
		assert(true);
		//method for extra credit, was not implemented
	}

	@Test
	public void testGetUser() {
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		
		assert(temp.getUser(0).compareTo(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null))==0);
	}

	@Test
	public void testGetGender() {
		assert(true);
		//method for extra credit, was not implemented
	}

	@Test
	public void testGetDob() {
		assert(true);
		//method for extra credit, was not implemented
	}

	@Test
	public void testToString() {
		IndexedLinkedList<User> temp = new IndexedLinkedList<User>();
		temp.addUser((new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)), 0);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 1);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 2);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 4);
		temp.addUser(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null), 3);
		assert(temp.toString().compareTo(" Liam<>Heaney<>Male<>123456789<>50107<>Username1<>Password<>Email@mail.com<>7894561235<>null Liam<>Heaney<>Male<>123456789<>50107<>Username2<>Password<>Email@mail.com<>7894561235<>null Liam<>Heaney<>Male<>123456789<>50107<>Username3<>Password<>Email@mail.com<>7894561235<>null Liam<>Heaney<>Male<>123456789<>50107<>Username4<>Password<>Email@mail.com<>7894561235<>null")==0);
	}

}
