package work10;

public class SynchronizedQueue {
   Queue queue;
   // 篶
   public SynchronizedQueue() { queue = new Queue(); }
   // 戈
   public synchronized void enqueue(int value) {
      try { // 狦︻骸
         while ( queue.isFull() ) {
            System.out.println();
            System.out.println("︻骸, 祔单....");
            wait();  // 单
         }
      }
      catch ( InterruptedException e ) { }
      queue.enqueue(value);  // 
      notify();  // 硄dequeue()
   }
   // 戈
   public synchronized int dequeue() {
      try {  // 狦︻
         while ( queue.isEmpty() ) {
            System.out.println();
            System.out.println("︻, 祔单....");
            wait(); // 单
         }
      }
      catch ( InterruptedException e ) { }
      int data = queue.dequeue();  // 
      notify();  // 硄enqueue()
      return data;
   }
}