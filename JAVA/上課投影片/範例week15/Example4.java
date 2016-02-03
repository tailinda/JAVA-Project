package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class Example4 extends JFrame {
   public Example4() {   // 建構子
      super("圖片載入與顯示範例");
      Container c = getContentPane();
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage("sample.jpg");
      ImagePanel imagePane = new ImagePanel(image);
      c.add(imagePane);
   }
   // 影像的JPanel
   class ImagePanel extends JPanel {
      private Image image;
      // 建構子
      public ImagePanel(Image img) { image = img; }
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawImage(image, 5, 5, this);
      }
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example4 app = new Example4();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(250,250);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}