package Java20151008;

class Time {  // Time���O�ŧi
   // �������
   private int second;
   private int minute;
   private int hour;
   // �غc�l(1): �S���Ѽ�
   public Time() { this(12, 30, 10); }
   // �غc�l(2): �u������
   public Time(int m) { this(12, m, 10); }
   // �غc�l(3): �u���p�ɩM����
   public Time(int h, int m) { this(h, m, 10); }
   // �غc�l(4): �ϥΰѼƳ]�w������ƪ���l��
   public Time(int hour, int minute, int second) {
      setTime(hour, minute, second);
   }
   // ������k: �ˬd�ɶ����
   private boolean validateTime(int h, int m, int s) {
      // �ˬd�ɶ���ƬO�_�b�d��
      if ( h < 0 || h > 23 ) return false;
      if ( m < 0 || m > 59 ) return false;
      if ( s < 0 || s > 59 ) return false;
      return true;          // �X�k�ɶ����
   }
   // ������k: �]�w�ɶ����
   public Time setTime(int hour,int minute,int second) {
      // �ˬd�ɶ��ѼƬO�_�X�k
      if ( validateTime(hour, minute, second) ) {
         // �]�w�ɶ����
         this.hour = hour; this.minute = minute;
         this.second = second;
      }
      else { // �]�w�ɶ���ƹw�]��
         this.hour = 12; this.minute = 30;
         this.second = 10;
      }
      return this;
   }
   // ������k: �Ǧ^�p��
   public int getHour(){ return hour; }
   // ������k: �Ǧ^����
   public int getMinute(){ return minute; }
   // ������k: �Ǧ^���
   public int getSecond(){ return second; }
   // ������k: ��ܮɶ����
   public void printTime()
   {  // ��X������ƪ���, ���M��
      System.out.println(hour+":"+minute+":"+second);
   }
}
// �D�{�����O
public class Example5
{   // �D�{��
    public static void main(String[] args)
    {   // �ܼƫŧi
        int hour, minute, second;
        // �ŧiTime���O���A���ܼ�, �åB�إߪ���
        Time now = new Time();
        Time meeting = new Time(50);
        Time open = new Time(10, 10);
        Time close = new Time(22, 30, 30);
        // �I�s���󪺹�Ҥ�k
        System.out.print("�{�b�ɶ� = ");
        now.printTime();
        System.out.print("�}�|�ɶ� = ");
        meeting.printTime();
        System.out.print("�}�l��~�ɶ� = ");
        open.printTime();
        System.out.print("������~�ɶ� = ");
        close.setTime(23, 10, 20).printTime();
    }
}