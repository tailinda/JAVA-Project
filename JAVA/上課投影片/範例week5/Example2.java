package Java20151008;

class Timee {  // Time���O�ŧi
   // �������
   public int second;
   public int minute;
   public int hour;
   // ������k: ��ܮɶ����
   public void printTime() {
      // ��X������ƪ���, ���M��
      System.out.println(hour+":"+minute+":"+second);
   }
}
// �D�{�����O
public class Example2 {
    // �D�{��
    public static void main(String[] args) {
        // �ŧiTime���O���A���ܼ�
        Time now, open, close, meeting;
        now = new Time();  // �إߪ�����
        close = new Time();
        open = now;      // open�N�Onow
        meeting = null;  // �x�snull�Ѧ�
        close.hour = 22; // �]�wclose���󪺹���ܼ�
        close.minute = 30;
        close.second = 30;
        open.hour = 10; // �]�wopen���󪺹���ܼ�
        open.minute = 10;
        open.second = 40;
        // �I�s���󪺹�Ҥ�k
        System.out.print("������~�ɶ� = ");
        close.printTime();
        System.out.print("�{�b�ɶ� = ");
        now.printTime();
        System.out.print("�}�l��~�ɶ� = ");
        open.printTime();
    }
}