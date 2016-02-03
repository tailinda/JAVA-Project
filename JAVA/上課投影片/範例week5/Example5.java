package Java20151008;

class Time {  // Time類別宣告
   // 成員資料
   private int second;
   private int minute;
   private int hour;
   // 建構子(1): 沒有參數
   public Time() { this(12, 30, 10); }
   // 建構子(2): 只有分鐘
   public Time(int m) { this(12, m, 10); }
   // 建構子(3): 只有小時和分鐘
   public Time(int h, int m) { this(h, m, 10); }
   // 建構子(4): 使用參數設定成員資料的初始值
   public Time(int hour, int minute, int second) {
      setTime(hour, minute, second);
   }
   // 成員方法: 檢查時間資料
   private boolean validateTime(int h, int m, int s) {
      // 檢查時間資料是否在範圍內
      if ( h < 0 || h > 23 ) return false;
      if ( m < 0 || m > 59 ) return false;
      if ( s < 0 || s > 59 ) return false;
      return true;          // 合法時間資料
   }
   // 成員方法: 設定時間資料
   public Time setTime(int hour,int minute,int second) {
      // 檢查時間參數是否合法
      if ( validateTime(hour, minute, second) ) {
         // 設定時間資料
         this.hour = hour; this.minute = minute;
         this.second = second;
      }
      else { // 設定時間資料預設值
         this.hour = 12; this.minute = 30;
         this.second = 10;
      }
      return this;
   }
   // 成員方法: 傳回小時
   public int getHour(){ return hour; }
   // 成員方法: 傳回分鐘
   public int getMinute(){ return minute; }
   // 成員方法: 傳回秒數
   public int getSecond(){ return second; }
   // 成員方法: 顯示時間資料
   public void printTime()
   {  // 輸出成員資料的時, 分和秒
      System.out.println(hour+":"+minute+":"+second);
   }
}
// 主程式類別
public class Example5
{   // 主程式
    public static void main(String[] args)
    {   // 變數宣告
        int hour, minute, second;
        // 宣告Time類別型態的變數, 並且建立物件
        Time now = new Time();
        Time meeting = new Time(50);
        Time open = new Time(10, 10);
        Time close = new Time(22, 30, 30);
        // 呼叫物件的實例方法
        System.out.print("現在時間 = ");
        now.printTime();
        System.out.print("開會時間 = ");
        meeting.printTime();
        System.out.print("開始營業時間 = ");
        open.printTime();
        System.out.print("結束營業時間 = ");
        close.setTime(23, 10, 20).printTime();
    }
}