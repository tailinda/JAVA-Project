package work10;

public class SynchronizedQueue {
   Queue queue;
   // �غc�l
   public SynchronizedQueue() { queue = new Queue(); }
   // �s�J���
   public synchronized void enqueue(int value) {
      try { // �p�G��C�w��
         while ( queue.isFull() ) {
            System.out.println();
            System.out.println("��C�w��, �y��....");
            wait();  // ����
         }
      }
      catch ( InterruptedException e ) { }
      queue.enqueue(value);  // �s�J
      notify();  // �q��dequeue()
   }
   // ���X���
   public synchronized int dequeue() {
      try {  // �p�G��C�w��
         while ( queue.isEmpty() ) {
            System.out.println();
            System.out.println("��C�w��, �y��....");
            wait(); // ����
         }
      }
      catch ( InterruptedException e ) { }
      int data = queue.dequeue();  // ���X
      notify();  // �q��enqueue()
      return data;
   }
}