package work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O, ��@ActionListener����
public class Example6 extends JFrame
                      implements ActionListener {
   private int offset = -10;
   private Timer timer;
   private AnimationPane animationPane;
   public Example6() {   // �غc�l
      super("�ʵe�\�઺��ܽd��");
      timer = new Timer(100, this);
      timer.setInitialDelay(0);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.gray);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage("SmallSnake.jpg");
      animationPane = new AnimationPane(image);
      c.add(animationPane);
      timer.start();
   }
   // ��ܰʵe��JPanel
   class AnimationPane extends JPanel {
      Image image;
      public AnimationPane(Image image) {  // �غc�l
         setPreferredSize(new Dimension(250, 100));
         setBackground(Color.white);
         this.image = image;
      }
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         int width = getWidth(), height = getHeight();
         int imgW = image.getWidth(this); // �p��Ϥ��ؤo
         int imgH = image.getHeight(this);
         g.drawImage(image,((offset*5)%(imgW+width))
                    - imgW, (height-imgH)/2, this);
      }
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
      offset++;  animationPane.repaint();  // ��ø
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example6 app = new Example6();
      // ���������ƥ�, �����{��������
      app.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent evt)
         { System.exit(0); } });
      app.setSize(300,150);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}