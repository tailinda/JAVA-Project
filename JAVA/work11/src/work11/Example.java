package work11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example extends JFrame {
   public Example() {   // �غc�l
      super("JFrame�̤W�h�e��");
      Container c=getContentPane();// ���oContentPane����
      c.setBackground(Color.black);// ���w�I����m
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
   	  Example app = new Example();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(600,150);  // �]�w�ؤo
      app.setVisible(true);  // ��ܵ���
   }
}