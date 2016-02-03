package work17;

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
				int j = 0;
				String str;
				Socket s = ss.accept();
				DataInputStream in = 
						new DataInputStream(s.getInputStream());
				String msg = in.readUTF();
				System.out.println(s.getInetAddress()+" : "+msg);
				DataOutputStream out = 
						new DataOutputStream(s.getOutputStream()); 
				Integer m = Integer.valueOf(msg);
				str="1";
				for(int i = 2; i <= m; i++){
					if( m % i == 0){
						str = str+" "+ String.valueOf(i);
					}
					
				}
				out.writeUTF(str); // �N��Ƽg�J������y�A�ÿ�X�����
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}