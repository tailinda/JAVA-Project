package work13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@MouseListener����
public class Example extends JFrame
                      implements MouseListener {
   private JTextField txt;
   public Example() {  // �غc�l
      super ("�򥻷ƹ��ƥ�d��");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      txt = new JTextField(12);   // �إߤ�r���
      txt.addMouseListener(this); // ���U�ƥ�B�z
      txt.setBackground(Color.white);
      c.add(txt);
   }
   // ��@�ƥ�B�z��k
   public void mousePressed(MouseEvent evt) {
      txt.setText("mousePressed");
   }
   public void mouseEntered(MouseEvent evt) {
      txt.setText("mouseEntered");
      txt.setBackground(Color.yellow);
   }
   public void mouseExited(MouseEvent evt) {
      txt.setText("mouseExited");
      txt.setBackground(Color.white);
   }
   public void mouseClicked(MouseEvent evt) { }
   public void mouseReleased(MouseEvent evt) { }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example app = new Example();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,100);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}