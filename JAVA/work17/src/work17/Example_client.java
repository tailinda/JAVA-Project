package work17;

import java.net.*;
import java.io.*;

// 主類別
public class Example_client {
	static final String IP = "127.0.0.1";
	static final int PORT = 5000;

	// 主程式
	public static void main(String[] args) {
		try { // 建立Socket物件
			Socket socket = new Socket(IP, PORT);
			InputStreamReader in = new InputStreamReader(
					socket.getInputStream());
			while (true) {
				int ch = in.read(); // 讀取資料
				if (ch == -1 || ch == '\n' || ch == '\r')
					break;
				System.out.print((char) ch); // 顯示資料
			}
			System.out.println();
			in.close();
			socket.close(); // 關閉Socket物件
		} catch (Exception e) {
		}
	}
}