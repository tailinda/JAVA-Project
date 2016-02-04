package work17;

import java.io.*;
import java.net.*;

public class Example1_client {
	static final String IP = "127.0.0.1";
	static final int PORT = 8888;

	public static void main(String[] args) {
		try {
			// ���Server蝡�
			Socket s = new Socket(IP, PORT);

			// 撱箇�撓�/頛詨銝脫��
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			// 撱箇��hread
			Thread rt = new ClientReaderThread(in);
			Thread wt = new ClientWriterThread(out);
			// ����hread
			rt.start();
			wt.start();

		} catch (SocketException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

// 撱箇���hread靘�脰��
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
				System.out.println("撠隤�:" + msg);
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

// 撱箇���hread靘�脰���
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
					System.out.println("�撌梢���!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}