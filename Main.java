import java.util.LinkedList;

public class Main {

	private static LinkedList<Customer> q;
	private static long simTime = 20_000;
	private static long startTime;

	public static void main(String args[]) {
		q = new LinkedList<>();

		//time stamp the sims start time
		startTime = System.currentTimeMillis();

		CustomerFactory factory = new CustomerFactory(30_000);
		factory.start();

		while(startTime + simTime > System.currentTimeMillis()) {

		}
	}

	public static void addToQ(Customer c) {
		q.add(c);
	}
}