import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.filechooser.*;
// 繼承JFrame類別
public class aaaaaa extends JFrame {
	 public int cc;
	 public int sum=0;
   public aaaaaa() {    // 建構子
      super("加總計算機");
      Container c = getContentPane();
      final JTextArea area = new JTextArea(15,30);
      JLabel lb = new JLabel("請輸入數值:");
      c.add(lb,BorderLayout.NORTH);
      JScrollPane scroll = new JScrollPane(area);
      final JFileChooser jfc = new JFileChooser();
      JPanel button = new JPanel(); // 按鈕的JPanel
      
      JButton save = new JButton("儲存檔案");
      save.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
        	 try{
                 int op= jfc.showSaveDialog(aaaaaa.this);   //儲存檔案對話框
                 if(op == JFileChooser.APPROVE_OPTION){
                    File file = jfc.getSelectedFile();  //取得選取的檔案
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()+".txt"));
                    String lines[] = area.getText().split("\n");
                    for(int i = 0 ; i<lines.length ; i++){
                       bw.write(lines[i]);
                       bw.newLine();
                    }
                 bw.close();
                 area.append("\n寫入檔案完成...\n");
                 area.append("檔案: "+file.getName() + "\n\n");
                 area.append("----------------------------\n");
                 area.append("1加到"+cc+"的總和:"+sum + "\n");
                 }
              }catch(IOException ioe){
                 ioe.printStackTrace();
              }
            
           }
        });
       
      button.add(save);
      
      // 建立計算按鈕
      JButton calculate = new JButton("計算");
      calculate.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
        	 cc=Integer.parseInt(area.getText());
        	 sum=0;
        	 area.setText(null);
        	 if(cc==0){
        		 sum=1; 
        	 }
        	 else{
        		 
        		 for(int i = 0;i<=cc;i++){
            		sum=sum+i;
            	 }
        	 }
        	 area.append("1加到"+cc+"的總和:"+sum);
         	}
        });
      button.add(calculate); 
      // 建立清除的按鈕
      
      JButton clear = new JButton("清除");
      clear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
        	 area.setText(null);
         } });
      button.add(clear);
      
      
      c.add(scroll, BorderLayout.CENTER);
      c.add(button, BorderLayout.SOUTH);
   }
   
   
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      aaaaaa app = new aaaaaa();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}