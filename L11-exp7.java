package work11;
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
      super("��l�C��");
      JButton button;  // �ŧiJButton�����ܼ�
      Container c = getContentPane();
      jpane = new JPanel(); // �إ�JPanel����
      label = new JLabel("�Ы����s�}�l�C��");
      jpane.add(label);
      button = new JButton("�}�l�C��");
      button.addActionListener(this);
      jpane.add(button);
      c.add(jpane);
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
	   Object[] options = {"��j���s","��p���s"};
       int n = JOptionPane.showOptionDialog(
    		   jpane,"�аݧA�n��j(>7)�٬O��p(<7)",
               "�}�l�U�`", JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE, null,
               options, options[0]);
      
       int x,y,target;
       x = (int) Math.ceil(Math.random()*6);
       y = (int) Math.ceil(Math.random()*6);
       target = x + y;
       
       if (n == JOptionPane.YES_OPTION){
       		if(target >7){
       			label.setText("�Ĥ@����l��"+x+"�@�ĤG����l��"+y+"�@�`�p��"+target+"�@�ҥH�AĹ�F!");}
       		else if(target == 7){
       			label.setText("�Ĥ@����l��"+x+"�@�ĤG����l��"+y+"�@�`�p��"+target+"�@�ө��B�F�I");}
       		else{
       			label.setText("�Ĥ@����l��"+x+"�@�ĤG����l��"+y+"�@�`�p��"+target+"�@�ҥH�A��F!");}
       }
       
       else if (n == JOptionPane.NO_OPTION){
           label.setText("��p");
           if(target <7){
        	   	label.setText("�Ĥ@����l��"+x+"�@�ĤG����l��"+y+"�@�`�p��"+target+"�@�ҥH�AĹ�F�I");}
           else if(target == 7){
      			label.setText("�Ĥ@����l��"+x+"�@�ĤG����l��"+y+"�@�`�p��"+target+"�@�ө��B�F�I");}
           else{
      			label.setText("�Ĥ@����l��"+x+"�@�ĤG����l��"+y+"�@�`�p��"+target+"�@�ҥH�A��F�I");}
           }

        else
           label.setText("�S�����");
}
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      Example6 app = new Example6();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(380, 120); // �]�w�ؤo
      app.setVisible(true);  // ��ܵ���
   }
}