package homework12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// �~��JFrame���O, ��@ActionListener����
public class exp2 extends JFrame
                      implements ActionListener {

	private JLabel lb1,lb2;
	private JTextField Money;
	private JButton btn1;
	private JCheckBox ck1;
	public exp2() {   // �غc�l
		super ("�p�{������p��");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		
      	Money = new JTextField(10);	// �إߤ�r���
      
		// �إ߼���
      	lb1 = new JLabel("�`���{��(����)");	// �ݩ��r���������
		lb2 = new JLabel("�п�J���{��");		//��ܿ�J��r���e������

		btn1 = new JButton("�p��");
      	btn1.addActionListener(this);  // ���U�ƥ�B�z
      	
      	ck1 = new JCheckBox("�]��");
      
      	JPanel jpane1 = new JPanel(); 	// �إ�JPanel����
      	jpane1.add(lb1); 
      	jpane1.add(Money); 
      	jpane1.add(btn1);
    	c.add(jpane1); 
      	JPanel jpane2 = new JPanel();
      	jpane2.add(ck1); 
      	jpane2.add(lb2);      
      	c.add(jpane2);    
      
   }
   // ��@�ƥ�B�z��k
   public void actionPerformed(ActionEvent event) {
	   
	   if(event.getSource() == btn1){
	   double distance = Double.valueOf(Money.getText());
	   int price,i,j;
	   if(distance <= 1500){
		   price = 80;
	   }
	   else{
		   i = (int)Math.ceil((distance - 1500)/500);
		   price = 80 + i*5;
		   
	   }
	   if(ck1.isSelected()){
		   price = (int)(price*1.2);
	   }
	   lb2.setText("����:" + price);
	   }
	   
   }
   // �D�{��
   public static void main(String[] args) {
	   // �إ�Swing���ε{��
	   exp2 app = new exp2();
	   app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	   app.setSize(350,150);  // �]�w�����ؤo
	   app.setVisible(true);  // ��ܵ���
   }
}