package homework12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// �~��JFrame���O, ��@ActionListener����
public class exp1 extends JFrame
                      implements ActionListener {

	private JLabel lb1,lb2;
	private JTextField Centigrade,Fahrenheit;
	private JButton btn1,btn2;
	public exp1() {   // �غc�l
		super ("���/�ؤ� �ഫ");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);
      	Centigrade = new JTextField(12);// �إߤ�r���
		Fahrenheit = new JTextField(12);
      
		// �إ߼���
		JLabel tLbl = new JLabel("��� �XC :");
		tLbl.setLabelFor(Centigrade);  // �ݩ��r���������
		JLabel tLb2 = new JLabel("�ؤ� �XF :");
		tLb2.setLabelFor(Fahrenheit);
      
		//��ܿ�J��r���e������
		lb1 = new JLabel("");
		lb2 = new JLabel("");
		
		btn1 = new JButton(">");
      	btn1.addActionListener(this);
      	btn2 = new JButton("<");
      	btn2.addActionListener(this);  // ���U�ƥ�B�z
      
      	JPanel jpane = new JPanel(); // �إ�JPanel����
      	jpane.add(tLbl); 
      	jpane.add(Centigrade); 
      	jpane.add(btn1);
      	jpane.add(btn2);
      	jpane.add(tLb2);
      	jpane.add(Fahrenheit); 
      	jpane.add(lb1);
      	jpane.add(lb2);
      
      	c.add(jpane);    
      
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent evt) {
	   
	   if(evt.getSource() == btn1){
	   double intValue1 = Double.valueOf(Centigrade.getText());
	   Fahrenheit.setText("" + (intValue1*9/5+32));
	   }
	   if(evt.getSource() == btn2){
	   double intValue2 = Double.valueOf(Fahrenheit.getText()); 
	   Centigrade.setText("" + (intValue2-32)*5/9);
	   }
      
   }
   // �D�{��
   public static void main(String[] args) {
	   // �إ�Swing���ε{��
	   Example2 app = new Example2();
	   app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	   app.setSize(600,100);  // �]�w�����ؤo
	   app.setVisible(true);  // ��ܵ���
   }
}