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
		System.out.println("�����: " + Thread.currentThread() );
		UserThread1 ut1 = new UserThread1("�����A");
		UserThread1 ut2 = new UserThread1("�����B");
		UserThread1 ut3 = new UserThread1("�����C");
		UserThread1 ut4 = new UserThread1("�����D");
		UserThread1 ut5 = new UserThread1("�����E");
		ut1.start();   ut2.start();   ut3.start();   ut4.start();   ut5.start();
	}
}
