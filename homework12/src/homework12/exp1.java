package homework12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 繼承JFrame類別, 實作ActionListener介面
public class exp1 extends JFrame
                      implements ActionListener {

	private JLabel lb1,lb2;
	private JTextField Centigrade,Fahrenheit;
	private JButton btn1,btn2;
	public exp1() {   // 建構子
		super ("攝氏/華氏 轉換");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);
      	Centigrade = new JTextField(12);// 建立文字方塊
		Fahrenheit = new JTextField(12);
      
		// 建立標籤
		JLabel tLbl = new JLabel("攝氏 °C :");
		tLbl.setLabelFor(Centigrade);  // 屬於文字方塊的標籤
		JLabel tLb2 = new JLabel("華氏 °F :");
		tLb2.setLabelFor(Fahrenheit);
      
		//顯示輸入文字內容的標籤
		lb1 = new JLabel("");
		lb2 = new JLabel("");
		
		btn1 = new JButton(">");
      	btn1.addActionListener(this);
      	btn2 = new JButton("<");
      	btn2.addActionListener(this);  // 註冊事件處理
      
      	JPanel jpane = new JPanel(); // 建立JPanel物件
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
   // 實作事件處理方法
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
   // 主程式
   public static void main(String[] args) {
	   // 建立Swing應用程式
	   Example2 app = new Example2();
	   app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	   app.setSize(600,100);  // 設定視窗尺寸
	   app.setVisible(true);  // 顯示視窗
   }
}