package finaltest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class finaltest extends JFrame
						implements ActionListener{
	private static final long serialVersionUID = 1L;
	private int ms;
	private int s;
	private int m;
	private int h;
	private String s_ms;
	private String s_s;
	private String s_m;
	private String s_h;
	private Timer timer;
	private JLabel JL;
	private JPanel JP;

		
	public finaltest(){
		super("�p�ɾ�");
		timer = new Timer (100,this);
		timer.setInitialDelay(0);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		JL = new JLabel();	//���i���������A�bJLabel�̭����@�iJL�_�ӥ�
		JP = new JPanel();
		JL.setFont(new Font("�з���",Font.PLAIN,20));
		JP.add(JL);
		c.add(JP);
		timer.start();
	}
	
	

	
	public void actionPerformed(ActionEvent arg0) {
		ms++;
		
		if (ms<10){
			s_ms = Integer.toString(ms);	//�֭p���Ʀr��r��
		}
		else if(ms>10&&ms<99){
			s_ms = Integer.toString(ms);}
		else{
			s++;
			ms=0;}
		if (s<60){
			s_s = Integer.toString(s);}
		else{
			m++;
			s=0;}
		if (m<60){
			s_m = Integer.toString(m);}
		else{
			h++;
			m=0;}
		if(h<24){
			s_h = Integer.toString(h);}
		JL.setText("�ɶ�:"+ s_h +":"+ s_m +":"+ s_s +":"+ "0"+s_ms);		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finaltest app = new finaltest();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(1000, 500);
		app.setLocation(100, 100);
		app.setVisible(true);
		app.setTitle("�p�ɾ�");
	}
}