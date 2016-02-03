package Java20151022;

abstract class Shape {  // Shape��H���O�ŧi
   // �������
   public double x;   // X�y��
   public double y;   // y�y��
   abstract void area();  // ��H��k: �p�⭱�n
}
class Circle extends Shape { // Circle���O�ŧi
   // �������
   private double r;     // �b�|
   // �غc�l
   public Circle(double x, double y, double r) {
      this.x = x;  this.y = y;   this.r = r;
   }
   // ������k: ��@��H��karea()
   public void area()
   { System.out.println("�ꭱ�n: " + 3.1416*r*r); }
}
class Rectangle extends Shape { // Rectangle���O�ŧi
   // �������
   private double x1;     // X�y��
   private double y1;     // Y�y��
   // �غc�l
   public Rectangle(double x, double y,
                    double x1,double y1) {
      this.x = x;      this.y = y;
      this.x1 = x1;    this.y1 = y1;
   }
   // ������k: ��@��H��karea()
   public void area()
   { System.out.println("����έ��n: "+(y1-y)*(x1-x)); }
}
class Triangle extends Shape { // Triangle���O�ŧi
   // �������
   private double x1;     // X�y��
   private double y1;     // Y�y��
   private double l;      // �T���Ω���
   // �غc�l
   public Triangle(double x, double y,
                   double x1, double y1, double l) {
      this.x = x;    this.y = y;
      this.x1 = x1;  this.y1 = y1;  this.l  = l;
   }
   // ������k: ��@��H��karea()
   public void area()
   { System.out.println("�T���έ��n: "+(y1-y)*l/2.0); }
}
// �D�{�����O
public class Example4 {
   // �D�{��
   public static void main(String[] args) {
      // ��H���O�������ܼ�
      Shape s;
      // �ŧi���O���A���ܼ�, �åB�إߪ���
      Circle c=new Circle(5.0,10.0,4.0);
      Rectangle r=new Rectangle(10.0,10.0,20.0,20.0);
      Triangle t=new Triangle(10.0,10.0,5.0,25.0,5.0);
      // �I�s��H�������󪺩�H��karea()
      for ( int i = 1; i <= 3; i++ ) {
         if ( i == 1 )      s = c;  // ���
         else if ( i == 2 ) s = r;  // �����
              else          s = t;  // �T����
         s.area();
      }
   }
}