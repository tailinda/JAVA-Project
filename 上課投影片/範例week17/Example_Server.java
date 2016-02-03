package Java20151105;

import java.net.*;
import java.io.*;
import java.util.Date;
// 主類別
public class Example_Server {
   static final int PORT = 5000;
   // 主程式
   public static void main(String[] args) {
      try { // 建立ServerSocket物件
         ServerSocket server = new ServerSocket(PORT);
         System.out.println("使用通訊埠: " + PORT);
         while (true) {  // 建立客戶端Socket物件
            Socket socket = server.accept();
            sendDateTime(socket);  // 送出日期資料
         }
      }
      catch ( Exception e ) { }
   }
   // 送出日期時間
   static void sendDateTime(Socket client) {
      try {
         System.out.println("連接的IP位址: " +
                          client.getInetAddress());
         Date now = new Date();
         PrintWriter out = new PrintWriter(
                           client.getOutputStream());
         out.println(now);  // 送出資料
         out.flush();       // 清除緩衝區
         client.close();    // 關閉客戶端連線
      }
      catch ( Exception e ) { }
   }
}