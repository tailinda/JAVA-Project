package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class Example extends JFrame {
   // 建構子
   public Example() { super("JFrame畫布"); }
   // 繪圖方法
   public void paint(Graphics g) {
      Insets ins = getInsets(); // 取得邊線尺寸
      // 計算實際的繪圖尺寸
      int width = getWidth() - (ins.left + ins.right);
      int height = getHeight() - (ins.top + ins.bottom);
      g.setColor(Color.white); // 填入背景色彩
      g.fillRect(ins.left,ins.top,width,height);
      g.setColor(Color.red);   // 繪長方形框
      g.drawRect(ins.left,ins.top,width-1,height-1);
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example app = new Example();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}