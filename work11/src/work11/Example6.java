package work11;
/* 程式範例: Ch11_2_2b.java */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別
public class Example6 extends JFrame
                     implements ActionListener {
   JLabel label;   // 宣告Swing物件變數
   JPanel jpane;
   public Example6() {   // 建構子
      super("骰子遊戲");
      JButton button;  // 宣告JButton物件變數
      Container c = getContentPane();
      jpane = new JPanel(); // 建立JPanel物件
      label = new JLabel("請按按鈕開始遊戲");
      jpane.add(label);
      button = new JButton("開始遊戲");
      button.addActionListener(this);
      jpane.add(button);
      c.add(jpane);
   }
   // 實作事件處理方法
   public void actionPerformed(ActionEvent evt) {
	   Object[] options = {"押大按鈕","押小按鈕"};
       int n = JOptionPane.showOptionDialog(
    		   jpane,"請問你要押大(>7)還是押小(<7)",
               "開始下注", JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE, null,
               options, options[0]);
      
       int x,y,target;
       x = (int) Math.ceil(Math.random()*6);
       y = (int) Math.ceil(Math.random()*6);
       target = x + y;
       
       if (n == JOptionPane.YES_OPTION){
       		if(target >7){
       			label.setText("第一顆骰子為"+x+"　第二顆骰子為"+y+"　總計為"+target+"　所以你贏了!");}
       		else if(target == 7){
       			label.setText("第一顆骰子為"+x+"　第二顆骰子為"+y+"　總計為"+target+"　太幸運了！");}
       		else{
       			label.setText("第一顆骰子為"+x+"　第二顆骰子為"+y+"　總計為"+target+"　所以你輸了!");}
       }
       
       else if (n == JOptionPane.NO_OPTION){
           label.setText("押小");
           if(target <7){
        	   	label.setText("第一顆骰子為"+x+"　第二顆骰子為"+y+"　總計為"+target+"　所以你贏了！");}
           else if(target == 7){
      			label.setText("第一顆骰子為"+x+"　第二顆骰子為"+y+"　總計為"+target+"　太幸運了！");}
           else{
      			label.setText("第一顆骰子為"+x+"　第二顆骰子為"+y+"　總計為"+target+"　所以你輸了！");}
           }

        else
           label.setText("沒有選擇");
}
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example6 app = new Example6();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(380, 120); // 設定尺寸
      app.setVisible(true);  // 顯示視窗
   }
}