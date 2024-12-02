public class Customer extends Thread {

	private static int nextId = 0;
	private int id;
	private long enterTime;     //when did the customer enter the store
	private long shopTime;     //how long in ms is the customer shopping

	public Customer() {
		this.id = nextId++;
		shopTime = (int)(2000 + Math.random() * 15000);
		enterTime = System.currentTimeMillis();
	}

	public String toString() {
		return "Customer: " + id + " (et=" + enterTime%100_000 + " st=" + shopTime + ") ";
	}

	/*
	 * This method will continually run in it's own thread
	 */
	@Override
	public void run() {
		while(enterTime + shopTime > System.currentTimeMillis()) {
			//they are stuck in the store
		}
		/*
		 * addToQ is crashing every single customer!!! I think because PriorityQ requires Comparable
		 * this might fix itself when we switch over to a standard LinkedList
		 */
		Main.addToQ(this);
		System.out.println(this.toString() + " leaves at " + System.currentTimeMillis()%100_000);
	}
}