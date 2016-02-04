package work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class exp3 extends JFrame {
   // 建構子
   public exp3() { super("顯示數線圖"); }
   // 繪圖方法
   public void paint(Graphics g) {
      Insets ins = getInsets();  // 取得邊線尺寸
      int width = getWidth() - (ins.left+ins.right);
      int height = getHeight() - (ins.top+ins.bottom);
      int x = ins.left + 10, y = ins.top + 10;
      g.setColor(Color.white);
      // 填入背景色彩
      g.fillRect(ins.left, ins.top, width, height);
      g.setColor(Color.black);
      g.drawLine(x, y, x+30 , y );	//0
      g.drawString("0", x-2, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//10
      g.drawString("10", x-7, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//20
      g.drawString("20", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//30
      g.drawString("30", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//40
      g.drawString("40", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//50
      g.drawString("50", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//60
      g.drawString("60", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//70
      g.drawString("70", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//80
      g.drawString("80", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x+30 , y ); 	//90
      g.drawString("90", x-5, y+20);
      g.drawLine(x, y, x , y+5 ); 
      x+=30;
      g.drawLine(x, y, x , y ); 	//100
      g.drawString("100", x-10, y+20);
      g.drawLine(x, y, x , y+5 ); 
      
      g.setColor(Color.blue);
      g.fillRect(x-300, y+30, width-100, height-70); // 畫長方形
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      exp3 app = new exp3();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(350,150);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}