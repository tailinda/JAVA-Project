package Java20151112;
/* �{���d��: Ch11_2_2b.java */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example6 extends JFrame
                     implements ActionListener {
   JLabel label;   // �ŧiSwing�����ܼ�
   JPanel jpane;
   public Example6() {   // �غc�l
      super("��ܹ�ܤ��");
      JButton button;  // �ŧiJButton�����ܼ�
      Container c = getContentPane();
      jpane = new JPanel(); // �إ�JPanel����
      label = new JLabel("���չ�ܤ��");
      jpane.add(label);
      button = new JButton("showConfirmDialog���s");
      button.addActionListener(this);
      jpane.add(button);
      c.add(jpane);
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
       int n = JOptionPane.showConfirmDialog(jpane,
               "�z�O�_�w�g���UshowMessageDialog���s?",
               "�ާ@���D", JOptionPane.YES_NO_OPTION);
       if (n == JOptionPane.YES_OPTION)
          label.setText("���U�O");
       else if (n == JOptionPane.NO_OPTION)
               label.setText("���U�_");
            else
               label.setText("�S�����");
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example6 app = new Example6();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300, 100); // �]�w�ؤo
      app.setVisible(true);  // ��ܵ���
   }
}