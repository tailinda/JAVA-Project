package work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別, 實作ActionListener介面
public class Example6 extends JFrame
                      implements ActionListener {
   private int offset = -10;
   private Timer timer;
   private AnimationPane animationPane;
   public Example6() {   // 建構子
      super("動畫功能的顯示範例");
      timer = new Timer(100, this);
      timer.setInitialDelay(0);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.gray);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage("SmallSnake.jpg");
      animationPane = new AnimationPane(image);
      c.add(animationPane);
      timer.start();
   }
   // 顯示動畫的JPanel
   class AnimationPane extends JPanel {
      Image image;
      public AnimationPane(Image image) {  // 建構子
         setPreferredSize(new Dimension(250, 100));
         setBackground(Color.white);
         this.image = image;
      }
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         int width = getWidth(), height = getHeight();
         int imgW = image.getWidth(this); // 計算圖片尺寸
         int imgH = image.getHeight(this);
         g.drawImage(image,((offset*5)%(imgW+width))
                    - imgW, (height-imgH)/2, this);
      }
   }
   // 實作事件處理方法
   public void actionPerformed(ActionEvent evt) {
      offset++;  animationPane.repaint();  // 重繪
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example6 app = new Example6();
      // 關閉視窗事件, 結束程式的執行
      app.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent evt)
         { System.exit(0); } });
      app.setSize(300,150);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}