package Java20151029;

// �Ͳ��̰�������O, �~��Thread���O
class Producer extends Thread {
   public int count = 0;
   public void run() { // ��������
      int value;
      while ( Example2.isRunning ) {
         value = (int)(Math.random()*100);
         Example2.squeue.enqueue(value);  // �s�J
         System.out.print(">" + value + "]");
         count++;
         try  {// �Ȱ��@�q�ɶ�
            Thread.sleep((int)(Math.random()*100));
         }
         catch( InterruptedException e ) { }
      }
      System.out.println("\n" + Thread.currentThread()
                              + "�Ͳ��̰��������");
   }
}
// ���O�̰�������O, �~��Thread���O
class Consumer extends Thread {
   public int count = 0;
   public void run() {    // ��������
      int data;
      while ( Example2.isRunning ) {
         data = Example2.squeue.dequeue(); // ���X
         System.out.print("[" + data + ">");
         count++;
         try { // �Ȱ��@�q�ɶ�
            Thread.sleep((int)(Math.random()*100));
         }
         catch( InterruptedException e ) { }
      }
      System.out.println("\n" + Thread.currentThread()
                              + "���O�̰��������");
   }
}
// �D���O
public class Example2 {
   static final int MAXITEMS = 10;
   static SynchronizedQueue squeue = // �إߦ�C����
                     new SynchronizedQueue();
   static boolean isRunning = true;
   // �D�{��
   public static void main(String[] args) {
      // �إ߰��������
      Producer producer = new Producer();
      Consumer consumer = new Consumer();
      // �Ұʰ����
      producer.start();  consumer.start();
      while (true)  // ��������
         if (producer.count >= MAXITEMS &&
             producer.count == consumer.count)
         {  isRunning = false;  break; }
   }
}