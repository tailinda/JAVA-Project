package Java20151008;

class Timee {  // Time類別宣告
   // 成員資料
   public int second;
   public int minute;
   public int hour;
   // 成員方法: 顯示時間資料
   public void printTime() {
      // 輸出成員資料的時, 分和秒
      System.out.println(hour+":"+minute+":"+second);
   }
}
// 主程式類別
public class Example2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Time類別型態的變數
        Time now, open, close, meeting;
        now = new Time();  // 建立物件實例
        close = new Time();
        open = now;      // open就是now
        meeting = null;  // 儲存null參考
        close.hour = 22; // 設定close物件的實例變數
        close.minute = 30;
        close.second = 30;
        open.hour = 10; // 設定open物件的實例變數
        open.minute = 10;
        open.second = 40;
        // 呼叫物件的實例方法
        System.out.print("結束營業時間 = ");
        close.printTime();
        System.out.print("現在時間 = ");
        now.printTime();
        System.out.print("開始營業時間 = ");
        open.printTime();
    }
}