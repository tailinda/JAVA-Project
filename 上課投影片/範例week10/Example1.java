package Java20151029;
// 執行緒類別, 繼承Thread類別
class UserThreadq extends Thread {
   private int length;
   // 建構子
   public UserThread(int length, String name) {
      super(name);
      this.length = length;
   }
   // 執行執行緒
   public void run() {
      int temp = 0;
      for ( int i = 1; i <= length; i++ ) temp += i;
      System.out.println(Thread.currentThread() +
                         "總和 = " + temp);
   }
}
// 主類別
public class Example1 {
   // 主程式
   public static void main(String[] args) {
      System.out.println("執行緒: " +
                         Thread.currentThread());
      // 建立執行緒物件
      UserThread ut1 = new UserThread(5, "執行緒A");
      UserThread ut2 = new UserThread(4, "執行緒B");
      // 啟動執行緒
      ut1.start();    ut2.start();
   }
}