package work11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class Example extends JFrame {
   public Example() {   // 建構子
      super("JFrame最上層容器");
      Container c=getContentPane();// 取得ContentPane物件
      c.setBackground(Color.black);// 指定背景色彩
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
   	  Example app = new Example();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(600,150);  // 設定尺寸
      app.setVisible(true);  // 顯示視窗
   }
}