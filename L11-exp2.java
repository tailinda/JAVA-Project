package work11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 繼承JFrame類別, 實作ActionListener介面
public class Example1 extends JFrame
                    implements ActionListener {
   private JButton btn1, btn2;
   private JLabel lbl;
   public Example1() { // 建構子
      super("JButton與JLabel元件範例");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.setBackground(Color.white);
      lbl = new JLabel("關閉");
      btn1 = new JButton("開啟(S)");
      btn1.setMnemonic(KeyEvent.VK_S);  // 設定按鍵
      btn1.addActionListener(this); // 註冊事件處理
      btn2 = new JButton("關閉(Q)");
      btn2.setMnemonic(KeyEvent.VK_Q);  // 設定按鍵
      btn2.setToolTipText("關閉");  // 說明文字
      btn2.addActionListener(this); // 註冊事件處理
      JPanel jpane = new JPanel(); // 建立JPanel物件
      jpane.add(lbl);
      jpane.add(btn1);  jpane.add(btn2);
      c.add(jpane);
   }
   // 實作事件處理方法
   public void actionPerformed(ActionEvent evt) {
      // 判斷事件來源的物件
      if (evt.getSource() == btn1) lbl.setText("開啟");
      if (evt.getSource() == btn2) lbl.setText("關閉");
   }
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      Example1 app = new Example1();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(600,100);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}