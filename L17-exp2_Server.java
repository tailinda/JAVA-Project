package work17;

import java.io.*;
import java.net.*;

public class Example1_Server {
	static final int PORT = 8888;

	public static void main(String[] args) {
		try {
			// 閮剔蔭Server蝡舐����
			ServerSocket s = new ServerSocket(PORT);
			System.out.println("Server撌脣�����lient���");
			Socket s1 = s.accept();// 蝑����

			// 撱箇�撓�/頛詨銝脫��
			DataInputStream in = new DataInputStream(s1.getInputStream());
			DataOutputStream out = new DataOutputStream(s1.getOutputStream());
			// 撱箇��hread
			Thread rt = new ServerReaderThread(in);
			Thread wt = new ServerWriterThread(out);
			// ����hread
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

//撱箇���hread靘�脰��
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
				System.out.println("撠霂�:" + msg);
				if (msg.equals("bye")) {
					System.out.println("撠���!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

//撱箇���hread靘�脰���
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
					System.out.println("�撌梢���");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}