package Java20151022;

class VehicleQ {  // Vehicle類別宣告
   // 成員資料
   public static int count;   // 車輛數
   private int serial_num;    // 車輛編號
   public int engineNum;      // 引擎號碼
   public char color;         // 車輛色彩
   // 建構子
   public Vehicle(int num, char color, int no) {
      serial_num = num;  this.color = color;
      engineNum = no;    count++;
   }
   // 成員方法: 顯示車輛編號
   public void printVehicle()
   { System.out.print("車輛編號:" + serial_num); }
}
class CarQ extends Vehicle { // Car類別宣告
   private char color;
   private int engineNum;
   private int doors;     // 車門數
   // 建構子
   public Car(int num,char color,int no,int doors) {
      // 呼叫父類別的建構子
      super(num, color, no);
      this.color = 'B';  engineNum = 4444444;
      this.doors = doors;
   }
   // 成員方法: 顯示轎車資料
   public void printVehicle() {
      // 顯示轎車資料
      System.out.print("====");
      super.printVehicle();
      System.out.println("轎車資料====");
      System.out.println("車輛色彩(父): " + super.color);
      System.out.print("引擎號碼(父): ");
      System.out.println(super.engineNum);
      System.out.println("轎車色彩(子): " + color);
      System.out.println("引擎號碼(子): " + engineNum);
      System.out.println("轎車車門: " + doors);
      System.out.println("車輛數: " + count);
   }
}
// 主程式類別
public class Example1 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Car類別型態的變數且建立物件
      Car joe = new Car(1,'R',1234567,4);
      Car jane= new Car(2,'W',5678924,5);
      joe.printVehicle(); // 呼叫物件的實例方法
      jane.printVehicle();
   }
}