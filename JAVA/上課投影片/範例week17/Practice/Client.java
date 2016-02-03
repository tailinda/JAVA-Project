package Java20151105;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	static final String IP = "192.168.0.31";
	static final int PORT = 5000;
	private Scanner sc;
	private String str;
	public Client() {
		sc = new Scanner(System.in);
		str=sc.next();
		try {
			Socket s = new Socket(IP, PORT);
			DataOutputStream out = 
					new DataOutputStream(s.getOutputStream());
			out.writeUTF(str); // 將資料寫入網路串流，並輸出到網路
			DataInputStream in = 
					new DataInputStream(s.getInputStream());
			String msg = in.readUTF();
			System.out.println(msg);
			s.close();
		} catch (Exception e) {}
	}
	public static void main(String[] args) {
		new Client();
	}
}