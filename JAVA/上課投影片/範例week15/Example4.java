package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example4 extends JFrame {
   public Example4() {   // �غc�l
      super("�Ϥ����J�P��ܽd��");
      Container c = getContentPane();
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage("sample.jpg");
      ImagePanel imagePane = new ImagePanel(image);
      c.add(imagePane);
   }
   // �v����JPanel
   class ImagePanel extends JPanel {
      private Image image;
      // �غc�l
      public ImagePanel(Image img) { image = img; }
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawImage(image, 5, 5, this);
      }
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example4 app = new Example4();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(250,250);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}