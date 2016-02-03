package Java20151105;

import java.net.*;
import java.io.*;
import java.util.Date;
// �D���O
public class Example_Server {
   static final int PORT = 5000;
   // �D�{��
   public static void main(String[] args) {
      try { // �إ�ServerSocket����
         ServerSocket server = new ServerSocket(PORT);
         System.out.println("�ϥγq�T��: " + PORT);
         while (true) {  // �إ߫Ȥ��Socket����
            Socket socket = server.accept();
            sendDateTime(socket);  // �e�X������
         }
      }
      catch ( Exception e ) { }
   }
   // �e�X����ɶ�
   static void sendDateTime(Socket client) {
      try {
         System.out.println("�s����IP��}: " +
                          client.getInetAddress());
         Date now = new Date();
         PrintWriter out = new PrintWriter(
                           client.getOutputStream());
         out.println(now);  // �e�X���
         out.flush();       // �M���w�İ�
         client.close();    // �����Ȥ�ݳs�u
      }
      catch ( Exception e ) { }
   }
}