package work13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class exp1 extends JFrame 
				  implements ActionListener {
		private JPopupMenu popup1;
		private JMenuItem a, b, d, e, f, g, h, i, j, k, l;
		private Container c;
		public exp1() {    // 建構子
		super("新文字文件");
		c = getContentPane();
		c.setBackground(Color.white);
		
		JMenuBar jmb = new JMenuBar();
	      setJMenuBar(jmb);  // 新增下拉式功能表
	      JMenu file = new JMenu("檔案(F)"); // 第一個選單
	      file.setMnemonic(KeyEvent.VK_F);
	      JMenuItem item;
	      file.add(item = new
	               JMenuItem("開新檔案(N)",KeyEvent.VK_N));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("開啟舊檔(O)",KeyEvent.VK_O));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("儲存檔案(S)",KeyEvent.VK_S));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("另存新檔(A)",KeyEvent.VK_A));
	      item.addActionListener(this);
	      file.addSeparator();
	      file.add(item = new
	               JMenuItem("版面設定(U)",KeyEvent.VK_U));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("列印(P)",KeyEvent.VK_P));
	      item.addActionListener(this);
	      file.addSeparator();
	      file.add(item = new
	               JMenuItem("結束(X)",KeyEvent.VK_X));
	      item.addActionListener(this);
	      jmb.add(file);
	      
	      JMenu edit = new JMenu("編輯(E)");
	      edit.setMnemonic(KeyEvent.VK_E);
	      edit.add(item = new
	               JMenuItem("復原(U)",KeyEvent.VK_U));
	      item.addActionListener(this);
	      edit.addSeparator();
	      edit.add(item = new
	               JMenuItem("剪下(T)",KeyEvent.VK_T));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("複製(C)",KeyEvent.VK_C));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("貼上(P)",KeyEvent.VK_P));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("刪除(L)",KeyEvent.VK_L));
	      item.addActionListener(this);
	      edit.addSeparator();
	      edit.add(item = new
	               JMenuItem("尋找(F)",KeyEvent.VK_F));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("找下一個(N)",KeyEvent.VK_N));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("取代(R)",KeyEvent.VK_R));
	      item.addActionListener(this);
	      edit.addSeparator();
	      edit.add(item = new
	               JMenuItem("移至(G)",KeyEvent.VK_G));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("全選(A)",KeyEvent.VK_A));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("時間/日期(D)",KeyEvent.VK_D));
	      item.addActionListener(this);
	      jmb.add(edit);
	      
	      JMenu format = new JMenu("格式(O)");
	      format.setMnemonic(KeyEvent.VK_O);
	      format.add(item = new
	               JMenuItem("自動換行(W)",KeyEvent.VK_W));
	      item.addActionListener(this);
	      format.add(item = new
	               JMenuItem("字型(F)",KeyEvent.VK_F));
	      item.addActionListener(this);
	      jmb.add(format);
	      
	      JMenu view = new JMenu("檢視(V)");
	      view.setMnemonic(KeyEvent.VK_V);
	      view.add(item = new
	               JMenuItem("狀態列(S)",KeyEvent.VK_S));
	      item.addActionListener(this);
	      jmb.add(view);
	      
	      JMenu explanation = new JMenu("說明(H)");
	      explanation.setMnemonic(KeyEvent.VK_H);
	      explanation.add(item = new
	               JMenuItem("檢視說明(H)",KeyEvent.VK_H));
	      item.addActionListener(this);
	      explanation.add(item = new
	               JMenuItem("關於記事本(A)",KeyEvent.VK_A));
	      item.addActionListener(this);
	      jmb.add(explanation);

		
		popup1 = new JPopupMenu();
		popup1.add(a = new JMenuItem("復原"));
		a.addActionListener(this);
		popup1.addSeparator();
		popup1.add(b = new JMenuItem("剪下"));
		b.addActionListener(this);
		popup1.add(d = new JMenuItem("複製"));
		d.addActionListener(this);
		popup1.add(e = new JMenuItem("貼上"));
		e.addActionListener(this);
		popup1.add(f = new JMenuItem("刪除"));
		f.addActionListener(this);
		popup1.addSeparator();
		popup1.add(g = new JMenuItem("全選"));
		g.addActionListener(this);
		popup1.addSeparator();
		popup1.add(h = new JMenuItem("從又到左的讀取順序"));
		h.addActionListener(this);
		popup1.add(i = new JMenuItem("顯示Unicode控制字元"));
		i.addActionListener(this);
		popup1.add(j = new JMenuItem("插入Unicode控制字元"));
		j.addActionListener(this);
		popup1.addSeparator();
		popup1.add(k = new JMenuItem("開啟IME"));
		k.addActionListener(this);
		popup1.add(l = new JMenuItem("重新轉換"));
		l.addActionListener(this);
		
		addMouseListener(new MouseAdapter() {
	         public void mousePressed(MouseEvent evt) {
	            if ( evt.isPopupTrigger() ) // 顯示選單
	               popup1.show(evt.getComponent(),
	                          evt.getX(), evt.getY());
	         }
	         public void mouseReleased(MouseEvent evt) {
	            if ( evt.isPopupTrigger() ) // 顯示選單
	               popup1.show(evt.getComponent(),
	                          evt.getX(), evt.getY());
	         } });
		
		}

public static void main(String[] args) {
    // 建立Swing應用程式
    exp1 app = new exp1();
    app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    app.setSize(600,400);  // 設定視窗尺寸
    app.setVisible(true);  // 顯示視窗
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}