import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.filechooser.*;
// �~��JFrame���O
public class aaaaaa extends JFrame {
	 public int cc;
	 public int sum=0;
   public aaaaaa() {    // �غc�l
      super("�[�`�p���");
      Container c = getContentPane();
      final JTextArea area = new JTextArea(15,30);
      JLabel lb = new JLabel("�п�J�ƭ�:");
      c.add(lb,BorderLayout.NORTH);
      JScrollPane scroll = new JScrollPane(area);
      final JFileChooser jfc = new JFileChooser();
      JPanel button = new JPanel(); // ���s��JPanel
      
      JButton save = new JButton("�x�s�ɮ�");
      save.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
        	 try{
                 int op= jfc.showSaveDialog(aaaaaa.this);   //�x�s�ɮ׹�ܮ�
                 if(op == JFileChooser.APPROVE_OPTION){
                    File file = jfc.getSelectedFile();  //���o������ɮ�
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()+".txt"));
                    String lines[] = area.getText().split("\n");
                    for(int i = 0 ; i<lines.length ; i++){
                       bw.write(lines[i]);
                       bw.newLine();
                    }
                 bw.close();
                 area.append("\n�g�J�ɮק���...\n");
                 area.append("�ɮ�: "+file.getName() + "\n\n");
                 area.append("----------------------------\n");
                 area.append("1�[��"+cc+"���`�M:"+sum + "\n");
                 }
              }catch(IOException ioe){
                 ioe.printStackTrace();
              }
            
           }
        });
       
      button.add(save);
      
      // �إ߭p����s
      JButton calculate = new JButton("�p��");
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
        	 area.append("1�[��"+cc+"���`�M:"+sum);
         	}
        });
      button.add(calculate); 
      // �إ߲M�������s
      
      JButton clear = new JButton("�M��");
      clear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
        	 area.setText(null);
         } });
      button.add(clear);
      
      
      c.add(scroll, BorderLayout.CENTER);
      c.add(button, BorderLayout.SOUTH);
   }
   
   
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      aaaaaa app = new aaaaaa();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}