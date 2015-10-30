package concurency;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String args[]) {
		Queue<User> queue = new LinkedList<User>();
		queue.add(new User(1,"kiran"));
		queue.add(new User(2,"samera"));
		queue.add(new User(3,"sanddep"));
		queue.add(new User(5,"deepak"));
		queue.add(new User(4,"deepika"));
		
		System.out.println(queue);
		
		User user = queue.remove();
		System.out.println(user);
		
	}

}
