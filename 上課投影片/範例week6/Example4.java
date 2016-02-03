package Java20151022;

abstract class Shape {  // Shape抽象類別宣告
   // 成員資料
   public double x;   // X座標
   public double y;   // y座標
   abstract void area();  // 抽象方法: 計算面積
}
class Circle extends Shape { // Circle類別宣告
   // 成員資料
   private double r;     // 半徑
   // 建構子
   public Circle(double x, double y, double r) {
      this.x = x;  this.y = y;   this.r = r;
   }
   // 成員方法: 實作抽象方法area()
   public void area()
   { System.out.println("圓面積: " + 3.1416*r*r); }
}
class Rectangle extends Shape { // Rectangle類別宣告
   // 成員資料
   private double x1;     // X座標
   private double y1;     // Y座標
   // 建構子
   public Rectangle(double x, double y,
                    double x1,double y1) {
      this.x = x;      this.y = y;
      this.x1 = x1;    this.y1 = y1;
   }
   // 成員方法: 實作抽象方法area()
   public void area()
   { System.out.println("長方形面積: "+(y1-y)*(x1-x)); }
}
class Triangle extends Shape { // Triangle類別宣告
   // 成員資料
   private double x1;     // X座標
   private double y1;     // Y座標
   private double l;      // 三角形底長
   // 建構子
   public Triangle(double x, double y,
                   double x1, double y1, double l) {
      this.x = x;    this.y = y;
      this.x1 = x1;  this.y1 = y1;  this.l  = l;
   }
   // 成員方法: 實作抽象方法area()
   public void area()
   { System.out.println("三角形面積: "+(y1-y)*l/2.0); }
}
// 主程式類別
public class Example4 {
   // 主程式
   public static void main(String[] args) {
      // 抽象類別的物件變數
      Shape s;
      // 宣告類別型態的變數, 並且建立物件
      Circle c=new Circle(5.0,10.0,4.0);
      Rectangle r=new Rectangle(10.0,10.0,20.0,20.0);
      Triangle t=new Triangle(10.0,10.0,5.0,25.0,5.0);
      // 呼叫抽象類型物件的抽象方法area()
      for ( int i = 1; i <= 3; i++ ) {
         if ( i == 1 )      s = c;  // 圓形
         else if ( i == 2 ) s = r;  // 長方形
              else          s = t;  // 三角形
         s.area();
      }
   }
}