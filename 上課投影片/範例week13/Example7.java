package Java20151119;

import java.io.*;
// 主類別
public class Example7 {
   // 主程式
   public static void main(String[] args)
                             throws Exception {
      String file = "Ch9_6_1.txt";
      String str1 = "Visual C#程式設計範例教本\r\n";
      String str2 = "This is a pen.\r\n";
      // 建立BufferedWriter的輸出串流物件
      BufferedWriter output = new BufferedWriter(
                              new FileWriter(file));
      output.write(str1);   // 輸出2個字串
      output.write(str2);
      output.close();       // 關閉串流
      System.out.println("寫入檔案完成...");
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                             new FileReader(file));
      System.out.println("檔案: " + file);
      System.out.println("---------------------");
      // 使用while迴圈讀取資料
      while ( (str1 = input.readLine()) != null )
         System.out.println(str1);
      input.close();      // 關閉串流
   }
}