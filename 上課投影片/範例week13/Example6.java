package Java20151119;

import java.io.*;
// �D���O
public class Example6 {
   // �D�{��
   public static void main(String[] args)
                      throws Exception {
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
      System.out.print("�п�J���=> ");
      System.out.flush();      // �M���w�İ�
      String str1 = input.readLine();  // Ū���@�C
      input.close();           // ������y
      String str2 = "��J����ƬO: " + str1;
      // �إ�BufferedWriter����X��y����
      BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
      output.write(str2);   // ��X�r��
      output.close();      // ������y
   }
}