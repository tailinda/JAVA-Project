package work13;

import java.io.*;
// 主類別
public class Example6 {
   // 主程式
   public static void main(String[] args)
                      throws Exception {
	   String f = "Ch9_6_1.txt";
	   String s = " 階層 = ";
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
      System.out.print("請輸入階層數=> ");
      System.out.flush();      // 清除緩衝區
      String str1 = input.readLine();  // 讀取一列
      input.close();           // 關閉串流
      System.out.println("寫入檔案完成...");
      int i = 1;
      int str2 = 1;
      int intValue = Integer.valueOf(str1);
      while(i <= intValue){
    	  str2 *= i++; 
      }
      System.out.println("檔案: " + f);
      System.out.println("---------------------");
      // 建立BufferedWriter的輸出串流物件
      
      BufferedWriter writer = new BufferedWriter(
                new FileWriter(f));
      writer.write(str2);
      writer.close();
      
      BufferedWriter output = new BufferedWriter(
              new FileWriter(f));
      output.write(String.valueOf (str1));   // 輸出字串
      output.write(String.valueOf (s));
      output.write(String.valueOf (str2));
      output.close();      // 關閉串流
   }
}