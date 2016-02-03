package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class Example3 extends JFrame {
   // 建構子
   public Example3() { super("繪圖功能的顯示範例"); }
   // 繪圖方法
   public void paint(Graphics g) {
      Insets ins = getInsets();  // 取得邊線尺寸
      int width = getWidth() - (ins.left+ins.right);
      int height = getHeight() - (ins.top+ins.bottom);
      int offset = width / 4;    // 圖形寬度的位移
      int noteY = height / 2 - 5;
      int x = ins.left + 5, y = ins.top + 5;
      int w = offset - 2 * x, h = noteY - 15 - y;
      g.setColor(Color.lightGray);
      // 填入背景色彩
      g.fillRect(ins.left, ins.top, width, height);
      g.setColor(Color.black);
      g.drawLine(x, y, x + w, y + h - 1); // 第一列圖形
      g.drawString("畫線", x, noteY);
      x += offset;
      g.drawRect(x, y, w, h); // 畫長方形
      g.drawString("畫長方形", x, noteY);
      x += offset;
      g.setColor(Color.lightGray); // 畫3D方形
      g.draw3DRect(x, y, w, h, true);
      g.setColor(Color.black);
      g.drawString("3D方形", x, noteY);
      x += offset;
      g.drawRoundRect(x,y,w,h,15,15); // 畫圓角方形
      g.drawString("圓角方形", x, noteY);
      x += offset;
      x = ins.left + 3;  // 第二列圖形
      y += height / 2;   noteY += height / 2;
      g.drawOval(x, y, w, h); // 畫圓
      g.drawString("畫圓", x, noteY);
      x += offset;
      g.drawArc(x, y, w, h, 45, 135); // 畫弧
      g.drawString("畫弧", x, noteY);
      x += offset;
      int[] xs = {x, x, x+w, x+w}; // 畫多角形
      int[] ys = {y, y+h, y, y+h};
      g.drawPolygon(xs, ys, xs.length);
      g.drawString("多角形", x, noteY);
      x += offset;
      int[] x1s = {x, x+w, x, x+w};
      int[] y1s = {y, y+h, y+h, y};
      g.drawPolyline(x1s,y1s,x1s.length); // 畫多角線
      g.drawString("多角線", x, noteY);
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example3 app = new Example3();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(350,250);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}