package work11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class Example1 extends JFrame
                    implements ActionListener {
   private JButton btn1, btn2;
   private JLabel lbl;
   public Example1() { // �غc�l
      super("JButton�PJLabel����d��");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      lbl = new JLabel("����");
      btn1 = new JButton("�}��(S)");
      btn1.setMnemonic(KeyEvent.VK_S);  // �]�w����
      btn1.addActionListener(this); // ���U�ƥ�B�z
      btn2 = new JButton("����(Q)");
      btn2.setMnemonic(KeyEvent.VK_Q);  // �]�w����
      btn2.setToolTipText("����");  // ������r
      btn2.addActionListener(this); // ���U�ƥ�B�z
      JPanel jpane = new JPanel(); // �إ�JPanel����
      jpane.add(lbl);
      jpane.add(btn1);  jpane.add(btn2);
      c.add(jpane);
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
      // �P�_�ƥ�ӷ�������
      if (evt.getSource() == btn1) lbl.setText("�}��");
      if (evt.getSource() == btn2) lbl.setText("����");
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example1 app = new Example1();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(600,100);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}