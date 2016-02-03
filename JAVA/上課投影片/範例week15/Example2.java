package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class Example2 extends JFrame {
   // 建構子
   public Example2() { super("色彩顯示的範例"); }
   // 繪圖方法
   public void paint(Graphics g) {
      Insets ins = getInsets(); // 取得邊線尺寸
      g.setColor(Color.white); // 填入背景色彩
      g.fillRect(ins.left, ins.top,
                 getWidth()-(ins.left+ins.right),
                 getHeight()-(ins.top+ins.bottom));
      Color color;
      g.setFont(new Font("標楷體", Font.BOLD, 20));
      for ( int y = 50; y <= 210; y+=40 ) {
         float hue = (float)Math.random();
         color = new Color(hue, 1.0f-hue, 1.0f);
         g.setColor(color);
         String message="RGB值: "+color.getRed()+":";
         message+=color.getGreen()+":"+color.getBlue();
         g.drawString(message, 20, y);
      }
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example2 app = new Example2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(400,250);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}