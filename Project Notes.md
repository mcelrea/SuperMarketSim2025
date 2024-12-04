# Supermarket Sim

### TODO

- Add checkout time to Customer (random generation)
- Cashier class that is threaded.
- Create cashiers in the main.
- Have cashiers "watch" the q, and remove Customers from it
	- Both Cashiers and Customers touch and change the Q. This could be bad, very bad.
	- Familiarize yourself with Serializable (which locks data structures, so that only, one piece of code, interacts with them at a time)
- A Customer and Cashier "interact" for checkoutTime amount of time, after which the Customer exits the store and the Cashier checks the q again.

### Reach Goals

- stats
	- how long is each customer in line for
	- how does changing the number of Cashiers affect wait times
	- total number of customers
	- how long did customers shop for


