package work10;
// ��������O, �~��Thread���O

class UserThreadq extends Thread {
	int length;
   // �غc�l
   public UserThreadq (int length, String name) {
      super(name);
   }
   // ��������
   public void run() {
	   int temp = 0;
	   for ( int i = 1; i <= length; i++ ) 
		   	temp += i;
      		System.out.println("Hello Word ! I am "+'\t'+ temp+'\t'+Thread.currentThread() );
   }
}
// �D���O
public class Example1 {
   // �D�{��
   public static void main(String[] args) {
      System.out.println("�����: " +Thread.currentThread());
      // �إ߰��������
      UserThreadq ut1 = new UserThreadq(1, "�����A");
      UserThreadq ut2 = new UserThreadq(2, "�����B");
      UserThreadq ut3 = new UserThreadq(3, "�����C");
      UserThreadq ut4 = new UserThreadq(4, "�����D");
      UserThreadq ut5 = new UserThreadq(5, "�����E");
            
      // �Ұʰ����
      ut1.start();    
      ut2.start();
      ut3.start();
      ut4.start();
      ut5.start();
   }
}