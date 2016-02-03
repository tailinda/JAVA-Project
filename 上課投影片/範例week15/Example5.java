package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example5 extends JFrame {
   private Image image;
   public Example5() {    // �غc�l
      super("�Ϥ��Y����ܽd��");
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      image = toolkit.getImage("Snake.jpg");
   }
   // ø�Ϥ�k
   public void paint(Graphics g) {
      Insets ins = getInsets(); // ���o��u�ؤo
      g.setColor(Color.lightGray); // ��J�I����m
      g.fillRect(ins.left, ins.top,
                 getWidth()-(ins.left+ins.right),
                 getHeight()-(ins.top+ins.bottom));
      int x, y, width, height;
      width = image.getWidth(this);   // ���o�Ϥ��ؤo
      height = image.getHeight(this);
      x = ins.left + 5;  y = ins.top + 5;
      g.drawImage(image,x,y,this); // ��l�ؤo
      x += width + 10;
      g.drawImage(image,x,y,50,50,this); // �Y�p�ؤo
      x += 60;   // ��ؤo�W�U½��
      g.drawImage(image,x,y,x+width,y+height,
                        0,height,width,0,this);
      x += width + 10;  // �Y�p�ؤo���k½��
      g.drawImage(image,x,y,x+100,y+100,
                        width,0,0,height,this);
      x += 110;  // �ŵ������Ϥ��B��j
      g.drawImage(image,x,y,x+100,y+100,
                       50,50,100,100,this);
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example5 app = new Example5();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(620,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}