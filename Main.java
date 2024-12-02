import java.util.PriorityQueue;

/*
 * NEXT TIME: take queue and use a LinkedList as a Q
 */

public class Main {

	private static PriorityQueue<Customer> q;
	private static long simTime = 20_000;
	private static long startTime;

	public static void main(String args[]) {
		q = new PriorityQueue<>();

		//time stamp the sims start time
		startTime = System.currentTimeMillis();

		CustomerFactory factory = new CustomerFactory();
		factory.start();

		while(startTime + simTime > System.currentTimeMillis()) {

		}
		factory.interrupt();
	}

	public static void addToQ(Customer c) {
		q.add(c);
	}
}