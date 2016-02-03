package Java20151119;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
// �~��JFrame���O
public class Example5 extends JFrame {
   public Example5() {    // �غc�l
      super("JFileChooser����d��");
      Container c = getContentPane();
      // �إ߾֦����ʶb����r�ϰ줸��
      final JTextArea area = new JTextArea(15,30);
      JScrollPane scroll = new JScrollPane(area);
      // �إ�JFileChooser����
      final JFileChooser jfc = new JFileChooser();
      JPanel button = new JPanel(); // ���s��JPanel
      // �إ߶}���ɮת����s
      JButton open = new JButton("�}���ɮ�");
      open.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            int n = jfc.showOpenDialog(Example5.this);
            if ( n == JFileChooser.APPROVE_OPTION ) {
               File file = jfc.getSelectedFile();
               area.append("�}���ɮצW��: ");
               area.append(file.getName() + "\n");
            }
         } });
      button.add(open);
      // �إ��x�s�ɮ׫��s
      JButton save = new JButton("�x�s�ɮ�");
      save.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            int m = jfc.showSaveDialog(Example5.this);
            if ( m == JFileChooser.APPROVE_OPTION ) {
               File file = jfc.getSelectedFile();
               area.append("�x�s�ɮצW��: ");
               area.append(file.getName() + "\n");
            }
         } });
      button.add(save);
      c.add(scroll, BorderLayout.CENTER);
      c.add(button, BorderLayout.SOUTH);
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example5 app = new Example5();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}