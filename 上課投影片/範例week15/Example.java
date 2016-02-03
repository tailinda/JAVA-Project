package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example extends JFrame {
   // �غc�l
   public Example() { super("JFrame�e��"); }
   // ø�Ϥ�k
   public void paint(Graphics g) {
      Insets ins = getInsets(); // ���o��u�ؤo
      // �p���ڪ�ø�Ϥؤo
      int width = getWidth() - (ins.left + ins.right);
      int height = getHeight() - (ins.top + ins.bottom);
      g.setColor(Color.white); // ��J�I����m
      g.fillRect(ins.left,ins.top,width,height);
      g.setColor(Color.red);   // ø����ή�
      g.drawRect(ins.left,ins.top,width-1,height-1);
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example app = new Example();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}