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
		public exp1() {    // �غc�l
		super("�s��r���");
		c = getContentPane();
		c.setBackground(Color.white);
		
		JMenuBar jmb = new JMenuBar();
	      setJMenuBar(jmb);  // �s�W�U�Ԧ��\���
	      JMenu file = new JMenu("�ɮ�(F)"); // �Ĥ@�ӿ��
	      file.setMnemonic(KeyEvent.VK_F);
	      JMenuItem item;
	      file.add(item = new
	               JMenuItem("�}�s�ɮ�(N)",KeyEvent.VK_N));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("�}������(O)",KeyEvent.VK_O));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("�x�s�ɮ�(S)",KeyEvent.VK_S));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("�t�s�s��(A)",KeyEvent.VK_A));
	      item.addActionListener(this);
	      file.addSeparator();
	      file.add(item = new
	               JMenuItem("�����]�w(U)",KeyEvent.VK_U));
	      item.addActionListener(this);
	      file.add(item = new
	               JMenuItem("�C�L(P)",KeyEvent.VK_P));
	      item.addActionListener(this);
	      file.addSeparator();
	      file.add(item = new
	               JMenuItem("����(X)",KeyEvent.VK_X));
	      item.addActionListener(this);
	      jmb.add(file);
	      
	      JMenu edit = new JMenu("�s��(E)");
	      edit.setMnemonic(KeyEvent.VK_E);
	      edit.add(item = new
	               JMenuItem("�_��(U)",KeyEvent.VK_U));
	      item.addActionListener(this);
	      edit.addSeparator();
	      edit.add(item = new
	               JMenuItem("�ŤU(T)",KeyEvent.VK_T));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("�ƻs(C)",KeyEvent.VK_C));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("�K�W(P)",KeyEvent.VK_P));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("�R��(L)",KeyEvent.VK_L));
	      item.addActionListener(this);
	      edit.addSeparator();
	      edit.add(item = new
	               JMenuItem("�M��(F)",KeyEvent.VK_F));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("��U�@��(N)",KeyEvent.VK_N));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("���N(R)",KeyEvent.VK_R));
	      item.addActionListener(this);
	      edit.addSeparator();
	      edit.add(item = new
	               JMenuItem("����(G)",KeyEvent.VK_G));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("����(A)",KeyEvent.VK_A));
	      item.addActionListener(this);
	      edit.add(item = new
	               JMenuItem("�ɶ�/���(D)",KeyEvent.VK_D));
	      item.addActionListener(this);
	      jmb.add(edit);
	      
	      JMenu format = new JMenu("�榡(O)");
	      format.setMnemonic(KeyEvent.VK_O);
	      format.add(item = new
	               JMenuItem("�۰ʴ���(W)",KeyEvent.VK_W));
	      item.addActionListener(this);
	      format.add(item = new
	               JMenuItem("�r��(F)",KeyEvent.VK_F));
	      item.addActionListener(this);
	      jmb.add(format);
	      
	      JMenu view = new JMenu("�˵�(V)");
	      view.setMnemonic(KeyEvent.VK_V);
	      view.add(item = new
	               JMenuItem("���A�C(S)",KeyEvent.VK_S));
	      item.addActionListener(this);
	      jmb.add(view);
	      
	      JMenu explanation = new JMenu("����(H)");
	      explanation.setMnemonic(KeyEvent.VK_H);
	      explanation.add(item = new
	               JMenuItem("�˵�����(H)",KeyEvent.VK_H));
	      item.addActionListener(this);
	      explanation.add(item = new
	               JMenuItem("����O�ƥ�(A)",KeyEvent.VK_A));
	      item.addActionListener(this);
	      jmb.add(explanation);

		
		popup1 = new JPopupMenu();
		popup1.add(a = new JMenuItem("�_��"));
		a.addActionListener(this);
		popup1.addSeparator();
		popup1.add(b = new JMenuItem("�ŤU"));
		b.addActionListener(this);
		popup1.add(d = new JMenuItem("�ƻs"));
		d.addActionListener(this);
		popup1.add(e = new JMenuItem("�K�W"));
		e.addActionListener(this);
		popup1.add(f = new JMenuItem("�R��"));
		f.addActionListener(this);
		popup1.addSeparator();
		popup1.add(g = new JMenuItem("����"));
		g.addActionListener(this);
		popup1.addSeparator();
		popup1.add(h = new JMenuItem("�q�S�쥪��Ū������"));
		h.addActionListener(this);
		popup1.add(i = new JMenuItem("���Unicode����r��"));
		i.addActionListener(this);
		popup1.add(j = new JMenuItem("���JUnicode����r��"));
		j.addActionListener(this);
		popup1.addSeparator();
		popup1.add(k = new JMenuItem("�}��IME"));
		k.addActionListener(this);
		popup1.add(l = new JMenuItem("���s�ഫ"));
		l.addActionListener(this);
		
		addMouseListener(new MouseAdapter() {
	         public void mousePressed(MouseEvent evt) {
	            if ( evt.isPopupTrigger() ) // ��ܿ��
	               popup1.show(evt.getComponent(),
	                          evt.getX(), evt.getY());
	         }
	         public void mouseReleased(MouseEvent evt) {
	            if ( evt.isPopupTrigger() ) // ��ܿ��
	               popup1.show(evt.getComponent(),
	                          evt.getX(), evt.getY());
	         } });
		
		}

public static void main(String[] args) {
    // �إ�Swing���ε{��
    exp1 app = new exp1();
    app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    app.setSize(600,400);  // �]�w�����ؤo
    app.setVisible(true);  // ��ܵ���
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}