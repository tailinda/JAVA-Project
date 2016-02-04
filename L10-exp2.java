package work10;
// 執行緒類別, 繼承Thread類別

class UserThreadq extends Thread {
	int length;
   // 建構子
   public UserThreadq (int length, String name) {
      super(name);
   }
   // 執行執行緒
   public void run() {
	   int temp = 0;
	   for ( int i = 1; i <= length; i++ ) 
		   	temp += i;
      		System.out.println("Hello Word ! I am "+'\t'+ temp+'\t'+Thread.currentThread() );
   }
}
// 主類別
public class Example1 {
   // 主程式
   public static void main(String[] args) {
      System.out.println("執行緒: " +Thread.currentThread());
      // 建立執行緒物件
      UserThreadq ut1 = new UserThreadq(1, "執行緒A");
      UserThreadq ut2 = new UserThreadq(2, "執行緒B");
      UserThreadq ut3 = new UserThreadq(3, "執行緒C");
      UserThreadq ut4 = new UserThreadq(4, "執行緒D");
      UserThreadq ut5 = new UserThreadq(5, "執行緒E");
            
      // 啟動執行緒
      ut1.start();    
      ut2.start();
      ut3.start();
      ut4.start();
      ut5.start();
   }
}