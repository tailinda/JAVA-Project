package homework12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 繼承JFrame類別, 實作ActionListener介面
public class exp2 extends JFrame
                      implements ActionListener {

	private JLabel lb1,lb2;
	private JTextField Money;
	private JButton btn1;
	private JCheckBox ck1;
	public exp2() {   // 建構子
		super ("計程車車資計算");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		
      	Money = new JTextField(10);	// 建立文字方塊
      
		// 建立標籤
      	lb1 = new JLabel("總里程數(公尺)");	// 屬於文字方塊的標籤
		lb2 = new JLabel("請輸入里程數");		//顯示輸入文字內容的標籤

		btn1 = new JButton("計算");
      	btn1.addActionListener(this);  // 註冊事件處理
      	
      	ck1 = new JCheckBox("夜間");
      
      	JPanel jpane1 = new JPanel(); 	// 建立JPanel物件
      	jpane1.add(lb1); 
      	jpane1.add(Money); 
      	jpane1.add(btn1);
    	c.add(jpane1); 
      	JPanel jpane2 = new JPanel();
      	jpane2.add(ck1); 
      	jpane2.add(lb2);      
      	c.add(jpane2);    
      
   }
   // 實作事件處理方法
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
	   lb2.setText("車資:" + price);
	   }
	   
   }
   // 主程式
   public static void main(String[] args) {
	   // 建立Swing應用程式
	   exp2 app = new exp2();
	   app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	   app.setSize(350,150);  // 設定視窗尺寸
	   app.setVisible(true);  // 顯示視窗
   }
}