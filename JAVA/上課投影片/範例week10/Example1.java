package Java20151029;
// ��������O, �~��Thread���O
class UserThreadq extends Thread {
   private int length;
   // �غc�l
   public UserThread(int length, String name) {
      super(name);
      this.length = length;
   }
   // ��������
   public void run() {
      int temp = 0;
      for ( int i = 1; i <= length; i++ ) temp += i;
      System.out.println(Thread.currentThread() +
                         "�`�M = " + temp);
   }
}
// �D���O
public class Example1 {
   // �D�{��
   public static void main(String[] args) {
      System.out.println("�����: " +
                         Thread.currentThread());
      // �إ߰��������
      UserThread ut1 = new UserThread(5, "�����A");
      UserThread ut2 = new UserThread(4, "�����B");
      // �Ұʰ����
      ut1.start();    ut2.start();
   }
}