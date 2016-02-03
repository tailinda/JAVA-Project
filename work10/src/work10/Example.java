package work10;

class UserClass {  // �ŧi�ϥΪ����O
   private int length;
   // �غc�l
   public UserClass(int length)
   { this.length = length; }
   // �p���`�M
   public int sum() {
      int temp = 0;
      for ( int i = 1; i <= length; i++ ) temp += i;
      return temp;
   }
}
// ��������O, ��@Runnable����
class UserThread extends UserClass implements Runnable {
   // �غc�l
   public UserThread(int length) { super(length); }
   // ��������
   public void run() {
      System.out.println(Thread.currentThread() +
                         "�`�M = " + sum());
   }
}
// �D���O
public class Example {
   // �D�{��
   public static void main(String[] args) {
      System.out.println("�����: " +
                          Thread.currentThread());
      // �إ߰��������
      UserThread ut1 = new UserThread(5);
      Thread t1 = new Thread(ut1, "�����A");
      UserThread ut2 = new UserThread(4);
      Thread t2 = new Thread(ut2, "�����B");
      // �Ұʰ����
      t1.start();   t2.start();
   }
}