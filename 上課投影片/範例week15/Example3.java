package Java20151126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class Example3 extends JFrame {
   // �غc�l
   public Example3() { super("ø�ϥ\�઺��ܽd��"); }
   // ø�Ϥ�k
   public void paint(Graphics g) {
      Insets ins = getInsets();  // ���o��u�ؤo
      int width = getWidth() - (ins.left+ins.right);
      int height = getHeight() - (ins.top+ins.bottom);
      int offset = width / 4;    // �ϧμe�ת��첾
      int noteY = height / 2 - 5;
      int x = ins.left + 5, y = ins.top + 5;
      int w = offset - 2 * x, h = noteY - 15 - y;
      g.setColor(Color.lightGray);
      // ��J�I����m
      g.fillRect(ins.left, ins.top, width, height);
      g.setColor(Color.black);
      g.drawLine(x, y, x + w, y + h - 1); // �Ĥ@�C�ϧ�
      g.drawString("�e�u", x, noteY);
      x += offset;
      g.drawRect(x, y, w, h); // �e�����
      g.drawString("�e�����", x, noteY);
      x += offset;
      g.setColor(Color.lightGray); // �e3D���
      g.draw3DRect(x, y, w, h, true);
      g.setColor(Color.black);
      g.drawString("3D���", x, noteY);
      x += offset;
      g.drawRoundRect(x,y,w,h,15,15); // �e�ꨤ���
      g.drawString("�ꨤ���", x, noteY);
      x += offset;
      x = ins.left + 3;  // �ĤG�C�ϧ�
      y += height / 2;   noteY += height / 2;
      g.drawOval(x, y, w, h); // �e��
      g.drawString("�e��", x, noteY);
      x += offset;
      g.drawArc(x, y, w, h, 45, 135); // �e��
      g.drawString("�e��", x, noteY);
      x += offset;
      int[] xs = {x, x, x+w, x+w}; // �e�h����
      int[] ys = {y, y+h, y, y+h};
      g.drawPolygon(xs, ys, xs.length);
      g.drawString("�h����", x, noteY);
      x += offset;
      int[] x1s = {x, x+w, x, x+w};
      int[] y1s = {y, y+h, y+h, y};
      g.drawPolyline(x1s,y1s,x1s.length); // �e�h���u
      g.drawString("�h���u", x, noteY);
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example3 app = new Example3();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(350,250);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}