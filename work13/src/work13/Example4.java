package work13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class Example4 extends JFrame
                      implements ActionListener {
   private JRadioButtonMenuItem red, green, blue;
   private Container c;
   public Example4() {    // �غc�l
      super ("JMenuBar����d��");
      c = getContentPane();
      c.setBackground(Color.white);
      JMenuBar jmb = new JMenuBar();
      setJMenuBar(jmb);  // �s�W�U�Ԧ��\���
      JMenu file = new JMenu("�ɮ�(F)"); // �Ĥ@�ӿ��
      file.setMnemonic(KeyEvent.VK_F);
      JMenuItem item;
      file.add(item = new
               JMenuItem("�s�W(N)",KeyEvent.VK_N));
      item.addActionListener(this);
      file.add(item = new
               JMenuItem("�}��(O)",KeyEvent.VK_O));
      item.addActionListener(this);
      JMenu setting = new JMenu("�ѼƳ]�w"); // �l���
      setting.add(item = new JMenuItem("�s�X"));
      item.addActionListener(this);
      setting.add(item = new JMenuItem("�r��"));
      item.addActionListener(this);
      file.add(setting);    // �s�W�l���
      file.addSeparator();  // ���j�u
      file.add(item = new
               JMenuItem("����(X)",KeyEvent.VK_X));
      item.addActionListener(this);
      jmb.add(file); // �s�Wfile���
      JMenu choice = new JMenu("�ﶵ(C)"); // �ĤG�ӿ��
      choice.setMnemonic(KeyEvent.VK_C);
      JCheckBoxMenuItem check;
      check = new JCheckBoxMenuItem("����");
      check.addActionListener(this);
      choice.add(check);
      ButtonGroup buttongroup = new ButtonGroup();
      red = new JRadioButtonMenuItem("����");
      choice.add(red);    buttongroup.add(red);
      red.addActionListener(this);
      green = new JRadioButtonMenuItem("���");
      choice.add(green);  buttongroup.add(green);
      green.addActionListener(this);
      blue = new JRadioButtonMenuItem("�Ŧ�");
      choice.add(blue);   buttongroup.add(blue);
      blue.addActionListener(this);
      jmb.add(choice);
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
      if ( evt.getSource() == red )
         c.setBackground(Color.red);
      if ( evt.getSource() == green )
         c.setBackground(Color.green);
      if ( evt.getSource() == blue )
         c.setBackground(Color.blue);
      repaint();  // ��ø
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example4 app = new Example4();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}