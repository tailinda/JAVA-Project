package Java20151112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class Example2 extends JFrame
                      implements ActionListener {
   private JLabel lbl;
   private JTextField txt;
   public Example2() {   // �غc�l
      super ("JTextField����d��");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      txt = new JTextField(12);// �إߤ�r���
      // �إ߼���
      JLabel tLbl = new JLabel("�ϥΪ̦W��: ");
      tLbl.setLabelFor(txt);  // �ݩ��r���������
      // ��ܿ�J��r���e������
      lbl = new JLabel("�������J�����");
      JButton btn1 = new JButton("�T�w");
      btn1.addActionListener(this); // ���U�ƥ�B�z
      JPanel jpane = new JPanel(); // �إ�JPanel����
      jpane.add(tLbl); jpane.add(txt); jpane.add(btn1);
      c.add(jpane);    c.add(lbl);
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
      lbl.setText("��J��� : " + txt.getText());
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example2 app = new Example2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,150);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}