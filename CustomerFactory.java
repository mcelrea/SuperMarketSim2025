public class CustomerFactory extends Thread {

	private long nextCustomer;  //the time in ms, in the future, when the next customer walks in
	private long simTime;
	private long startTime;

	public CustomerFactory(long simTime) {
		nextCustomer = getNextTime(1000, 10000);
		startTime = System.currentTimeMillis();
		this.simTime = simTime;
	}

	public long getNextTime(long min, long max) {
		return System.currentTimeMillis() + (long)(min + Math.random() * (max-min+1));
	}

	@Override
	public void run() {
		while(startTime + simTime > System.currentTimeMillis()) {
			//if it's time to create a new Customer
			if(nextCustomer < System.currentTimeMillis()) {
				Customer c = new Customer();
				c.start();
				System.out.println(c + " enters the store.");
				nextCustomer = getNextTime(1000,10000);
			}
		}
		System.out.println("\nCUSTOMER FACTORY DONE\n");
	}
}