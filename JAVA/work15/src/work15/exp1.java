package work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// �~��JFrame���O
public class exp1 extends JFrame {
   // �غc�l
   public exp1() { super("JFrame�e��"); }
   // ø�Ϥ�k
   public void paint(Graphics g) {
      Insets ins = getInsets(); // ���o��u�ؤo
      // �p���ڪ�ø�Ϥؤo
      int width = getWidth() - (ins.left + ins.right);
      int height = getHeight() - (ins.top + ins.bottom);
      int a=130;
      int b=40;
      int r=20;
      int R=40;
      int L=80;
      g.setColor(Color.white); 		// ��J�I����m
      g.fillRect(ins.left,ins.top,width,height);
      
      g.setColor(Color.green);   	// ø�Y
      g.fillOval(a,b,R,R);
      
      g.setColor(Color.black);   	// ø����
      g.fillOval(a-r,b+R,r,r);
      
      g.setColor(Color.black);  	 // ø�k��
      g.fillOval(a+R,b+R,r,r);
      
      g.setColor(Color.yellow);  	 // ø���}
      g.fillOval(a-r/2,b+R+L,r,r);
      
      g.setColor(Color.yellow);		// ø�k�}
      g.fillOval(a+R-r/2,b+R+L,r,r);
      
      g.setColor(Color.red);  		 // ø����
      g.fillRect(a,b+R,R,L);
      
   }
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      exp1 app = new exp1();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}