package Java20151022;

class VehicleQ {  // Vehicle���O�ŧi
   // �������
   public static int count;   // ������
   private int serial_num;    // �����s��
   public int engineNum;      // �������X
   public char color;         // ������m
   // �غc�l
   public Vehicle(int num, char color, int no) {
      serial_num = num;  this.color = color;
      engineNum = no;    count++;
   }
   // ������k: ��ܨ����s��
   public void printVehicle()
   { System.out.print("�����s��:" + serial_num); }
}
class CarQ extends Vehicle { // Car���O�ŧi
   private char color;
   private int engineNum;
   private int doors;     // ������
   // �غc�l
   public Car(int num,char color,int no,int doors) {
      // �I�s�����O���غc�l
      super(num, color, no);
      this.color = 'B';  engineNum = 4444444;
      this.doors = doors;
   }
   // ������k: ����⨮���
   public void printVehicle() {
      // ����⨮���
      System.out.print("====");
      super.printVehicle();
      System.out.println("�⨮���====");
      System.out.println("������m(��): " + super.color);
      System.out.print("�������X(��): ");
      System.out.println(super.engineNum);
      System.out.println("�⨮��m(�l): " + color);
      System.out.println("�������X(�l): " + engineNum);
      System.out.println("�⨮����: " + doors);
      System.out.println("������: " + count);
   }
}
// �D�{�����O
public class Example1 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiCar���O���A���ܼƥB�إߪ���
      Car joe = new Car(1,'R',1234567,4);
      Car jane= new Car(2,'W',5678924,5);
      joe.printVehicle(); // �I�s���󪺹�Ҥ�k
      jane.printVehicle();
   }
}