package work13;

import java.io.*;
// �D���O
public class Example6 {
   // �D�{��
   public static void main(String[] args)
                      throws Exception {
	   String f = "Ch9_6_1.txt";
	   String s = " ���h = ";
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
      System.out.print("�п�J���h��=> ");
      System.out.flush();      // �M���w�İ�
      String str1 = input.readLine();  // Ū���@�C
      input.close();           // ������y
      System.out.println("�g�J�ɮק���...");
      int i = 1;
      int str2 = 1;
      int intValue = Integer.valueOf(str1);
      while(i <= intValue){
    	  str2 *= i++; 
      }
      System.out.println("�ɮ�: " + f);
      System.out.println("---------------------");
      // �إ�BufferedWriter����X��y����
      
      BufferedWriter writer = new BufferedWriter(
                new FileWriter(f));
      writer.write(str2);
      writer.close();
      
      BufferedWriter output = new BufferedWriter(
              new FileWriter(f));
      output.write(String.valueOf (str1));   // ��X�r��
      output.write(String.valueOf (s));
      output.write(String.valueOf (str2));
      output.close();      // ������y
   }
}