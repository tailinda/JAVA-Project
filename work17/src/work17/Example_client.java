package work17;

import java.net.*;
import java.io.*;

// �D���O
public class Example_client {
	static final String IP = "127.0.0.1";
	static final int PORT = 5000;

	// �D�{��
	public static void main(String[] args) {
		try { // �إ�Socket����
			Socket socket = new Socket(IP, PORT);
			InputStreamReader in = new InputStreamReader(
					socket.getInputStream());
			while (true) {
				int ch = in.read(); // Ū�����
				if (ch == -1 || ch == '\n' || ch == '\r')
					break;
				System.out.print((char) ch); // ��ܸ��
			}
			System.out.println();
			in.close();
			socket.close(); // ����Socket����
		} catch (Exception e) {
		}
	}
}