package Java20151022;

class VehicleQ {  // Vehicle類別宣告
   // 成員資料
   private int engineNum; // 引擎號碼
   private char color;     // 色彩
   // 成員方法: 設定引擎號碼
   public void setNum(int num) { engineNum=num; }
   // 成員方法: 設定色彩
   public void setColor(char color) { this.color=color; }
   // 成員方法: 顯示車輛資料
   public void printVehicle() {
      // 顯示車輛的基本資料
      System.out.println("引擎號碼: " + engineNum);
      System.out.println("車輛色彩: " + color);
   }
}
class CarQ extends Vehicle { // Car類別宣告
   // 成員資料
   private int doors;  // 車門數
   // 建構子
   public Car(int num, char color, int doors) {
      // 呼叫父類別的成員方法
      setNum(num);
      setColor(color);
      this.doors = doors;
   }
   // 成員方法: 顯示轎車資料
   public void printCar() {
      // 顯示轎車資料
      System.out.println("====轎車資料====");
      printVehicle();      // 呼叫父類別的成員方法
      System.out.println("轎車門數: " + doors);
   }
}
// 主程式類別
public class Example {
   // 主程式
   public static void main(String[] args) {
      // 宣告Car類別型態的變數且建立物件
      Car joe = new Car(1233567, 'R', 4);
      Car jane= new Car(5678924, 'B', 5);
      joe.setColor('W'); // 更改色彩-呼叫繼承的方法
      joe.printCar();    // 呼叫物件的實例方法
      jane.printCar();
   }
}