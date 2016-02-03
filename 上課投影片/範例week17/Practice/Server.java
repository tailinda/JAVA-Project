package Java20151105;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static final int PORT = 5000;
	public Server() {
		try {
			ServerSocket ss = new ServerSocket(PORT);
			System.out.println("*****************************");
			while (true) {
				Socket s = ss.accept();
				DataInputStream in = 
						new DataInputStream(s.getInputStream());
				String msg = in.readUTF();
				System.out.println(s.getInetAddress()+" : "+msg);
				DataOutputStream out = 
						new DataOutputStream(s.getOutputStream()); 
				out.writeUTF("Ok, I got it!"); // 將資料寫入網路串流，並輸出到網路
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}