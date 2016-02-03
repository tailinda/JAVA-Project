package work13;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// 繼承JFrame類別
public class exp2 extends JFrame
					implements ActionListener{
	private static final String NULL = null;
	private JLabel lbl;
	private JButton save, Calculate , Remove;
	private int intValue,i=0;
	
	// 建立擁有捲動軸的文字區域元件
    final JTextArea area = new JTextArea(10,15);
    JScrollPane scroll = new JScrollPane(area);
    
    // 建立JFileChooser元件
    final JFileChooser jfc = new JFileChooser(); 
    
	public exp2(){    // 建構子
      super("加總計算機");
      Container c = getContentPane();
      // 建立儲存檔案按鈕
      JButton save = new JButton("儲存檔案");
      save.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
        	 try{
                 int output = jfc.showSaveDialog(exp2.this);   //儲存檔案對話框
                 if(output == JFileChooser.APPROVE_OPTION){
                    File file = jfc.getSelectedFile();  //取得選取的檔案
                    BufferedWriter input = new BufferedWriter(new FileWriter(file.getAbsolutePath()+".txt"));
                    String lines[] = area.getText().split("\n");
                    for(int i = 0 ; i < lines.length ; i++){
                       input.write(lines[i]);
                       input.newLine();
                    }
                 input.close();
                 area.append("\n已寫入檔案\n");
                 area.append("檔案名稱: "+file.getName() + "\n");
                 area.append("-----------------------------------------\n");
                 area.append("1加到" + intValue + "的總和:" + i );
                 }
              }catch(IOException ioe){
                 ioe.printStackTrace();
              }
           }
        });
      
      lbl = new JLabel("請輸入數值:");
      Calculate = new JButton("計算");
      Calculate.addActionListener(this);
      Remove = new JButton("清除");
      Remove.addActionListener(this);

      JPanel jpane = new JPanel(); // 建立JPanel物件
      	jpane.add(save);
    	jpane.add(Calculate); 
    	jpane.add(Remove); 
    	
      c.add(lbl, BorderLayout.NORTH);
      c.add(scroll, BorderLayout.CENTER);
      c.add(jpane, BorderLayout.SOUTH);
   }
	
	public void actionPerformed(ActionEvent evt) {
	   	   if(evt.getSource() == Calculate){
			   int j = 1;
	   		   intValue = Integer.valueOf(area.getText());
	   		   while(j <= intValue){
	   			   i +=j; 
	   			   j++; 
	   		   }
	   		area.append("\n1加到"+intValue+"的總和:"+i);
	   	   }
	   	   
	   	   if(evt.getSource() == Remove){
	   		   area.setText(null);
	   	   }
	}
   
   // 主程式
   public static void main(String[] args) {
      // 建立Swing應用程式
      exp2 app = new exp2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // 設定視窗尺寸
      app.setVisible(true);  // 顯示視窗
   }
}