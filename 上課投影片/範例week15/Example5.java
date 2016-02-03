package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class Example5 extends JFrame {
   private Image image;
   public Example5() {    // 建構子
      super("圖片縮放的顯示範例");
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      image = toolkit.getImage("Snake.jpg");
   }
   // 繪圖方法
   public void paint(Graphics g) {
      Insets ins = getInsets(); // 取得邊線尺寸
      g.setColor(Color.lightGray); // 填入背景色彩
      g.fillRect(ins.left, ins.top,
                 getWidth()-(ins.left+ins.right),
                 getHeight()-(ins.top+ins.bottom));
      int x, y, width, height;
      width = image.getWidth(this);   // 取得圖片尺寸
      height = image.getHeight(this);
      x = ins.left + 5;  y = ins.top + 5;
      g.drawImage(image,x,y,this); // 原始尺寸
      x += width + 10;
      g.drawImage(image,x,y,50,50,this); // 縮小尺寸
      x += 60;   // 原尺寸上下翻轉
      g.drawImage(image,x,y,x+width,y+height,
                        0,height,width,0,this);
      x += width + 10;  // 縮小尺寸左右翻轉
      g.drawImage(image,x,y,x+100,y+100,
                        width,0,0,height,this);
      x += 110;  // 剪裁部分圖片且放大
      g.drawImage(image,x,y,x+100,y+100,
                       50,50,100,100,this);
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example5 app = new Example5();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(620,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}