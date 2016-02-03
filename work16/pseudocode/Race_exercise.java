import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

public class Race_exercise extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AnimationPane animationPane;
	//設定 圖檔來源
	ImageIcon p1 = new ImageIcon("hours1.png");
	ImageIcon p2 = new ImageIcon("hours2.png");
	ImageIcon p3 = new ImageIcon("hours3.png");
	ImageIcon p4 = new ImageIcon("hours4.png");
		
	//Button 移動位置
	int o1;
	int o2;
	int o3;
	int o4;	
	
	//宣告 Timer
	private Timer timer;	

	//設定 終點
	int width = 735;
	
	Container c = getContentPane();
	Border bLine;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	JButton bt4;
	JPanel jp = new JPanel();

	public Race_exercise() {
		//設定 Button 物件
		bt1 = new JButton("粉紅小馬");
		bt2 = new JButton("白色小馬");
		bt3 = new JButton("藍色小馬");
		bt4 = new JButton("超醜小馬");

		timer = new Timer(200,this);
		timer.setInitialDelay(0); //setInitialDelay = 0
		
		c.setLayout(null);
		c.setBackground(Color.white);
		bLine = BorderFactory.createLineBorder(Color.blue);
		JPanel jpane1 = new JPanel();
		jpane1.setBounds(800, 1, 1, 500);
		jpane1.setBorder(bLine);
		c.add(jpane1, BorderLayout.EAST);
		
		timer.start();//開始 timer
	}
	
	class AnimationPane extends JPanel{
		 Image image;
	      public AnimationPane(Image image) {  // 建構子
	         setPreferredSize(new Dimension(250, 100));
	         setBackground(Color.black);
	         this.image = image;
	      }
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 判斷是否到終點
		//如果某匹馬 >= 終點 (1.結束timer 2.顯示 比賽結果)
		if ((o1) >= width) {
			timer.stop(); // 結束timer
			JOptionPane.showMessageDialog(jp, "粉紅小馬win~",
					"**比賽結果**", JOptionPane.WARNING_MESSAGE);
		} else if ((o2) >= width) {
			timer.stop(); // 結束timer
			JOptionPane.showMessageDialog(jp, "白色小馬win~",
					"**比賽結果**", JOptionPane.WARNING_MESSAGE);
		} else if ((o3) >= width) {
			timer.stop(); // 結束timer
			JOptionPane.showMessageDialog(jp, "藍色小馬win~",
					"**比賽結果**", JOptionPane.WARNING_MESSAGE);
		} else if ((o4) >= width) {
			timer.stop(); // 結束timer
			JOptionPane.showMessageDialog(jp, "超醜小馬win~",
					"**比賽結果**", JOptionPane.WARNING_MESSAGE);
		} else {
			repaint();//重繪
		}
			
	}

	public void paint(Graphics g) { // 執行賽馬
		Insets ins = getInsets(); // 取得邊線尺寸
		int width = getWidth() - (ins.left + ins.right);
		int height = getHeight() - (ins.top + ins.bottom);
		g.setColor(Color.WHITE);
		g.fillRect(ins.left, ins.top, width, height);
		
		//隨機產生 - 移動距離
		int rnd1 = (int) Math.ceil(Math.random()*40+1); //隨機 1 ~ n , ex. 1-100:Math.random() * 100 + 1
		int rnd2 = (int) Math.ceil(Math.random()*40+1);
		int rnd3 = (int) Math.ceil(Math.random()*40+1);
		int rnd4 = (int) Math.ceil(Math.random()*40+1);
		
		//累加上次移動距離
		o1 = o1 + rnd1;
		o2 = o2 + rnd2;
		o3 = o3 + rnd3;
		o4 = o4 + rnd4;
		
		//設定 物件位置
		bt1.setBounds(o1, 30, 65, 70); // 設定 X: 水平距離, Y:垂直距離
		bt2.setBounds(o2, 130, 65, 70);
		bt3.setBounds(o3, 230, 65, 70);
		bt4.setBounds(o4, 330, 65, 70);

		//設定 button 圖片
		bt1.setIcon(p1);
		bt2.setIcon(p2);
		bt3.setIcon(p3);
		bt4.setIcon(p4);

		c.add(bt1);
		c.add(bt2);
		c.add(bt3);
		c.add(bt4);

		g.setColor(Color.blue);
		g.drawLine(810, 0, 810, 700);//畫終點線

		// 觀眾席 - 自行發揮:P
		int number = (int) (Math.random() * 4) + 1;
		if (number == 1) {
			g.setColor(Color.green);
			g.drawString("ლ(◉◞౪◟◉ )ლ  加油!! 粉紅小馬!!", o1, getHeight() - 20);
		}
		if (number == 2) {
			g.setColor(Color.green);
			g.drawString("ლ(◉◞౪◟◉ )ლ  加油!! 白色小馬!!", o2, getHeight() - 20);
		}
		if (number == 3) {
			g.setColor(Color.green);
			g.drawString("ლ(◉◞౪◟◉ )ლ  加油!! 藍色小馬!!", o3, getHeight() - 20);
		}
		if (number == 4) {
			g.setColor(Color.green);
			g.drawString("ლ(◉◞౪◟◉ )ლ  加油!! 超醜小馬!!", o4, getHeight() - 20);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Race_exercise app = new Race_exercise();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(1000, 500);
		app.setLocation(100, 100);
		app.setVisible(true);
		app.setTitle("賽彩虹小馬");
	}
}
