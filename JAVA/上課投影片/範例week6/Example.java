package Java20151022;

class VehicleQ {  // Vehicle���O�ŧi
   // �������
   private int engineNum; // �������X
   private char color;     // ��m
   // ������k: �]�w�������X
   public void setNum(int num) { engineNum=num; }
   // ������k: �]�w��m
   public void setColor(char color) { this.color=color; }
   // ������k: ��ܨ������
   public void printVehicle() {
      // ��ܨ������򥻸��
      System.out.println("�������X: " + engineNum);
      System.out.println("������m: " + color);
   }
}
class CarQ extends Vehicle { // Car���O�ŧi
   // �������
   private int doors;  // ������
   // �غc�l
   public Car(int num, char color, int doors) {
      // �I�s�����O��������k
      setNum(num);
      setColor(color);
      this.doors = doors;
   }
   // ������k: ����⨮���
   public void printCar() {
      // ����⨮���
      System.out.println("====�⨮���====");
      printVehicle();      // �I�s�����O��������k
      System.out.println("�⨮����: " + doors);
   }
}
// �D�{�����O
public class Example {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiCar���O���A���ܼƥB�إߪ���
      Car joe = new Car(1233567, 'R', 4);
      Car jane= new Car(5678924, 'B', 5);
      joe.setColor('W'); // ����m-�I�s�~�Ӫ���k
      joe.printCar();    // �I�s���󪺹�Ҥ�k
      jane.printCar();
   }
}