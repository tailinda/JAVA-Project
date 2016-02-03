package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example1 extends JFrame {
   JLabel label;
   int pointX, pointY;
   public Example1() {    // �غc�l
      super("JPanel�e��");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      UserPanel userPane = new UserPanel();
      userPane.setBorder(
             BorderFactory.createLineBorder(Color.red));
      c.add(userPane);
      label = new JLabel("�Ы��@�UJPanel�e��");
      c.add(label);
   }
   // ø�Ϫ�JPanel
   class UserPanel extends JPanel {
      public UserPanel() {   // �غc�l
         setPreferredSize(new Dimension(200, 150));
         // ���U�ƥ�B�z
         addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
               // ���o�y��
               pointX = evt.getX(); pointY = evt.getY();
               repaint();   // ��ø
            } });
      }
      public void paintComponent(Graphics g) {
         super.paintComponent(g);   // �M���I��
         Insets ins = getInsets();  // ���o��u�ؤo
         // �p���ڪ�ø�Ϥؤo
         int width = getWidth()-(ins.left+ins.right);
         int height = getHeight()-(ins.top+ins.bottom);
         int x = ins.left, y = ins.top;
         g.setColor(Color.yellow);
         g.drawRect(x, y, width-1, height-1);
         label.setText("�ثe�y�� :"+pointX+","+pointY);
      }
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example1 app = new Example1();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(250,250);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}