package Java20151105;

import java.io.*;
import java.net.*;

public class Example1_Server {
	static final int PORT = 8888;

	public static void main(String[] args) {
		try {
			// 設置Server端的連接
			ServerSocket s = new ServerSocket(PORT);
			System.out.println("Server已啟動，等待Client連接");
			Socket s1 = s.accept();// 等待連接

			// 建立輸入/輸出串流
			DataInputStream in = new DataInputStream(s1.getInputStream());
			DataOutputStream out = new DataOutputStream(s1.getOutputStream());
			// 建立兩個Thread
			Thread rt = new ServerReaderThread(in);
			Thread wt = new ServerWriterThread(out);
			// 啟動兩個Thread
			rt.start();
			wt.start();
		}

		catch (SocketException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

//建立一個Thread來進行接收
class ServerReaderThread extends Thread {
	private DataInputStream dis;

	public ServerReaderThread(DataInputStream dis) {
		this.dis = dis;
	}

	public void run() {
		String msg;
		try {
			while (true) {
				msg = dis.readUTF();
				System.out.println("對方说:" + msg);
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

//建立一個Thread來進行發送
class ServerWriterThread extends Thread {
	private DataOutputStream dos;

	public ServerWriterThread(DataOutputStream dos) {
		this.dos = dos;
	}

	public void run() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String msg;
		try {
			while (true) {
				msg = br.readLine();
				dos.writeUTF(msg);
				if (msg.equals("bye")) {
					System.out.println("自己退出");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}