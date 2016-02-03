package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example2 extends JFrame {
   // �غc�l
   public Example2() { super("��m��ܪ��d��"); }
   // ø�Ϥ�k
   public void paint(Graphics g) {
      Insets ins = getInsets(); // ���o��u�ؤo
      g.setColor(Color.white); // ��J�I����m
      g.fillRect(ins.left, ins.top,
                 getWidth()-(ins.left+ins.right),
                 getHeight()-(ins.top+ins.bottom));
      Color color;
      g.setFont(new Font("�з���", Font.BOLD, 20));
      for ( int y = 50; y <= 210; y+=40 ) {
         float hue = (float)Math.random();
         color = new Color(hue, 1.0f-hue, 1.0f);
         g.setColor(color);
         String message="RGB��: "+color.getRed()+":";
         message+=color.getGreen()+":"+color.getBlue();
         g.drawString(message, 20, y);
      }
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example2 app = new Example2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(400,250);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}