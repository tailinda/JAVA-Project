package Java20151105;

import java.io.*;
import java.net.*;

public class Example1_client {
	static final String IP = "127.0.0.1";
	static final int PORT = 8888;

	public static void main(String[] args) {
		try {
			// 連接Server端
			Socket s = new Socket(IP, PORT);

			// 建立輸入/輸出串流
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			// 建立兩個Thread
			Thread rt = new ClientReaderThread(in);
			Thread wt = new ClientWriterThread(out);
			// 啟動兩個Thread
			rt.start();
			wt.start();

		} catch (SocketException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

// 建立一個Thread來進行接收
class ClientReaderThread extends Thread {
	private DataInputStream dis;

	public ClientReaderThread(DataInputStream dis) {
		this.dis = dis;
	}

	@Override
	public void run() {
		String msg;
		try {
			while (true) {
				msg = dis.readUTF();
				System.out.println("對方說:" + msg);
				if (msg.equals("bye")) {
					System.out.println("對方退出!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

// 建立一個Thread來進行發送
class ClientWriterThread extends Thread {
	private DataOutputStream dos;

	public ClientWriterThread(DataOutputStream dos) {
		this.dos = dos;
	}

	@Override
	public void run() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String msg;
		try {
			while (true) {
				msg = br.readLine();
				dos.writeUTF(msg);
				if (msg.equals("bye")) {
					System.out.println("自己退出!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}