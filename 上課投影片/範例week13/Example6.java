package Java20151119;

import java.io.*;
// 主類別
public class Example6 {
   // 主程式
   public static void main(String[] args)
                      throws Exception {
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
      System.out.print("請輸入資料=> ");
      System.out.flush();      // 清除緩衝區
      String str1 = input.readLine();  // 讀取一列
      input.close();           // 關閉串流
      String str2 = "輸入的資料是: " + str1;
      // 建立BufferedWriter的輸出串流物件
      BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
      output.write(str2);   // 輸出字串
      output.close();      // 關閉串流
   }
}