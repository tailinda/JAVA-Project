package Java20151112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class Example3 extends JFrame
                      implements ActionListener {
   private JCheckBox ckbg, ckbr;
   public Example3() {  // �غc�l
      super("JCheckBox����d��");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      ckbg = new JCheckBox("�e�����(G)");
      ckbg.setMnemonic(KeyEvent.VK_G);
      ckbg.setSelected(true);
      ckbr = new JCheckBox("�I������(R)");
      ckbr.setMnemonic(KeyEvent.VK_R);
      JButton btn1 = new JButton("�]�w��m");
      btn1.addActionListener(this); // ���U�ƥ�B�z
      JPanel jpane = new JPanel(); // �إ�JPanel����
      jpane.add(ckbg); jpane.add(ckbr); jpane.add(btn1);
      c.add(jpane);
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
      if ( ckbg.isSelected() )
            ckbg.setForeground(Color.green);
      else  ckbg.setForeground(Color.black);
      if ( ckbr.isSelected() )
            ckbr.setBackground(Color.red);
      else  ckbr.setBackground(Color.white);
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example3 app = new Example3();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,100);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}