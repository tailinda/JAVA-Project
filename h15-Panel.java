package work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class exp2 extends JFrame {
   JLabel label;
   int pointX, pointY;
   public exp2() {    // �غc�l
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
         int R=10;
         g.setColor(Color.yellow);
         g.drawRect(x, y, width-1, height-1);
         label.setText("�ثe�y�� :"+pointX+","+pointY);
	      g.setColor(Color.white);   	// ø
	      g.fillRect(x,y,width,height);
	      g.setColor(Color.green);   	// ø
	      g.fillOval(pointX,pointY,R,R);
      }

   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      exp2 app = new exp2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(250,250);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}