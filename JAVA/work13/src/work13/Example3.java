package work13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class Example3 extends JFrame
                      implements ActionListener {
   private JPopupMenu popup;
   private JMenuItem blue, yellow, green;
   private Container c;
   public Example3() {    // �غc�l
      super("JPopupMenu����d��");
      c = getContentPane();
      c.setBackground(Color.white);
      popup = new JPopupMenu();
      popup.add(blue = new JMenuItem("�Ŧ�"));
      blue.addActionListener(this);
      popup.add(yellow = new JMenuItem("����"));
      yellow.addActionListener(this);
      popup.add(green = new JMenuItem("���"));
      green.addActionListener(this);
      popup.addSeparator();
      popup.add("����");  // �ϥΦr��s�W�ﶵ
      addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent evt) {
            if ( evt.isPopupTrigger() ) // ��ܿ��
               popup.show(evt.getComponent(),
                          evt.getX(), evt.getY());
         }
         public void mouseReleased(MouseEvent evt) {
            if ( evt.isPopupTrigger() ) // ��ܿ��
               popup.show(evt.getComponent(),
                          evt.getX(), evt.getY());
         } });
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
      if ( evt.getSource() == blue )
         c.setBackground(Color.blue);    // �Ŧ�
      if ( evt.getSource() == yellow )
         c.setBackground(Color.yellow);  // ����
      if ( evt.getSource() == green )
         c.setBackground(Color.green);   // ���
      repaint();  // ��ø
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example3 app = new Example3();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}