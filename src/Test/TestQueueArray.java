package Test;

import static org.junit.Assert.*;
import indexedList.IndexedListArray;

import org.junit.Test;

import original.Date;
import original.User;
import queue.QueueArray;

public class TestQueueArray {

	@Test
	public void testQueueArray() {
		assert(true);
	}

	@Test
	public void testEnqueue() {
		QueueArray<User> temp = new QueueArray<User>(100);
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		
		assert(temp.size() == 4);
	}

	@Test
	public void testIsEmpty() {
		QueueArray<User> temp = new QueueArray<User>(100);
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		assertFalse(temp.isEmpty());
		temp.dequeue();
		temp.dequeue();
		temp.dequeue();
		temp.dequeue();
		assert(temp.isEmpty());
	}

	@Test
	public void testSize() {
		QueueArray<User> temp = new QueueArray<User>(100);
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		
		assert(temp.size() == 4);
	}

	@Test
	public void testDequeue() {
		QueueArray<User> temp = new QueueArray<User>(100);
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.dequeue();
		assert(temp.size() == 3);
	}

	@Test
	public void testContains() {
		QueueArray<User> temp = new QueueArray<User>(100);
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username1", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username3", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.enqueue(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username4", "Password", "Email@mail.com", Long.parseLong("7894561235"), null));
		temp.dequeue();
		
		assert(temp.contains(new User("Liam", "Heaney", "Male", 123456789, new Date(5, 1, 7), "Username2", "Password", "Email@mail.com", Long.parseLong("7894561235"), null)));
	}

}
