package work13;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// �~��JFrame���O
public class exp2 extends JFrame
					implements ActionListener{
	private static final String NULL = null;
	private JLabel lbl;
	private JButton save, Calculate , Remove;
	private int intValue,i=0;
	
	// �إ߾֦����ʶb����r�ϰ줸��
    final JTextArea area = new JTextArea(10,15);
    JScrollPane scroll = new JScrollPane(area);
    
    // �إ�JFileChooser����
    final JFileChooser jfc = new JFileChooser(); 
    
	public exp2(){    // �غc�l
      super("�[�`�p���");
      Container c = getContentPane();
      // �إ��x�s�ɮ׫��s
      JButton save = new JButton("�x�s�ɮ�");
      save.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
        	 try{
                 int output = jfc.showSaveDialog(exp2.this);   //�x�s�ɮ׹�ܮ�
                 if(output == JFileChooser.APPROVE_OPTION){
                    File file = jfc.getSelectedFile();  //���o������ɮ�
                    BufferedWriter input = new BufferedWriter(new FileWriter(file.getAbsolutePath()+".txt"));
                    String lines[] = area.getText().split("\n");
                    for(int i = 0 ; i < lines.length ; i++){
                       input.write(lines[i]);
                       input.newLine();
                    }
                 input.close();
                 area.append("\n�w�g�J�ɮ�\n");
                 area.append("�ɮצW��: "+file.getName() + "\n");
                 area.append("-----------------------------------------\n");
                 area.append("1�[��" + intValue + "���`�M:" + i );
                 }
              }catch(IOException ioe){
                 ioe.printStackTrace();
              }
           }
        });
      
      lbl = new JLabel("�п�J�ƭ�:");
      Calculate = new JButton("�p��");
      Calculate.addActionListener(this);
      Remove = new JButton("�M��");
      Remove.addActionListener(this);

      JPanel jpane = new JPanel(); // �إ�JPanel����
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
	   		area.append("\n1�[��"+intValue+"���`�M:"+i);
	   	   }
	   	   
	   	   if(evt.getSource() == Remove){
	   		   area.setText(null);
	   	   }
	}
   
   // �D�{��
   public static void main(String[] args) {
      // �إ�Swing���ε{��
      exp2 app = new exp2();
      app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      app.setSize(300,200);  // �]�w�����ؤo
      app.setVisible(true);  // ��ܵ���
   }
}