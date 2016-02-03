package Java20151119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@KeyListener����
public class Example2 extends JFrame
                    implements KeyListener {
   private JLabel lbl;
   public Example2() {  // �غc�l
      super ("��L�ƥ�d��");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      lbl = new JLabel("KeyEvent"); // �إ߼���
      addKeyListener(this); // ���U�ƥ�B�z
      c.add(lbl);
   }
   // ��@�ƥ�B�z��k
   public void keyPressed(KeyEvent evt) {
      int key = evt.getKeyCode();
      switch (key) {
         case KeyEvent.VK_LEFT:
              lbl.setText("�V��"+Integer.toString(key));
              break;
         case KeyEvent.VK_RIGHT:
              lbl.setText("�V�k"+Integer.toString(key));
              break;
         case KeyEvent.VK_UP:
              lbl.setText("�V�W"+Integer.toString(key));
              break;
         case KeyEvent.VK_DOWN:
              lbl.setText("�V�U"+Integer.toString(key));
              break;
         default: lbl.setText(Integer.toString(key));
      }
   }
   public void keyTyped(KeyEvent evt) { }
   public void keyReleased(KeyEvent evt) { }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example2 app = new Example2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,100);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}