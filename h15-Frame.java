package work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class exp1 extends JFrame {
   // 建構子
   public exp1() { super("JFrame畫布"); }
   // 繪圖方法
   public void paint(Graphics g) {
      Insets ins = getInsets(); // 取得邊線尺寸
      // 計算實際的繪圖尺寸
      int width = getWidth() - (ins.left + ins.right);
      int height = getHeight() - (ins.top + ins.bottom);
      int a=130;
      int b=40;
      int r=20;
      int R=40;
      int L=80;
      g.setColor(Color.white); 		// 填入背景色彩
      g.fillRect(ins.left,ins.top,width,height);
      
      g.setColor(Color.green);   	// 繪頭
      g.fillOval(a,b,R,R);
      
      g.setColor(Color.black);   	// 繪左手
      g.fillOval(a-r,b+R,r,r);
      
      g.setColor(Color.black);  	 // 繪右手
      g.fillOval(a+R,b+R,r,r);
      
      g.setColor(Color.yellow);  	 // 繪左腳
      g.fillOval(a-r/2,b+R+L,r,r);
      
      g.setColor(Color.yellow);		// 繪右腳
      g.fillOval(a+R-r/2,b+R+L,r,r);
      
      g.setColor(Color.red);  		 // 繪身體
      g.fillRect(a,b+R,R,L);
      
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      exp1 app = new exp1();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}