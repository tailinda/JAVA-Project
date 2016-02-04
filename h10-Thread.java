package work10;
class UserThread1 extends Thread {
	public UserThread1(String name) {
		super(name);
	}
	public void run() {
		int numThreads = 100;
		int threadId = (int) Thread.currentThread().getId() % numThreads +1;
	    System.out.println(Thread.currentThread() + "Hello Word ! I am " + getId()% numThreads + " thread");
	}
}
public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("°õ¦æºü: " + Thread.currentThread() );
		UserThread1 ut1 = new UserThread1("°õ¦æºüA");
		UserThread1 ut2 = new UserThread1("°õ¦æºüB");
		UserThread1 ut3 = new UserThread1("°õ¦æºüC");
		UserThread1 ut4 = new UserThread1("°õ¦æºüD");
		UserThread1 ut5 = new UserThread1("°õ¦æºüE");
		ut1.start();   ut2.start();   ut3.start();   ut4.start();   ut5.start();
	}
}
