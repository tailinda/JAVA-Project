package Java20151119;

import java.io.*;
// �D���O
public class Example7 {
   // �D�{��
   public static void main(String[] args)
                             throws Exception {
      String file = "Ch9_6_1.txt";
      String str1 = "Visual C#�{���]�p�d�ұХ�\r\n";
      String str2 = "This is a pen.\r\n";
      // �إ�BufferedWriter����X��y����
      BufferedWriter output = new BufferedWriter(
                              new FileWriter(file));
      output.write(str1);   // ��X2�Ӧr��
      output.write(str2);
      output.close();       // ������y
      System.out.println("�g�J�ɮק���...");
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                             new FileReader(file));
      System.out.println("�ɮ�: " + file);
      System.out.println("---------------------");
      // �ϥ�while�j��Ū�����
      while ( (str1 = input.readLine()) != null )
         System.out.println(str1);
      input.close();      // ������y
   }
}