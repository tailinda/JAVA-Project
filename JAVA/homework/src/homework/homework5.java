package homework;

import java.util.Scanner;

class Student{
        public static int number=0;                //�p��ǥͤH��
        private int id;                            //�Ǹ�
        private String Sname;                      //�m�W
        private int chi;                           //���
        private int eng;                           //�^��
        private int bcc;                           //�p��
        private double avg;                        //���Z������
        
        public Student(){
                number++;
        }
        int GetStudentNum(){
                return number;
        }
        void SetStudent(int i, String S, int c, int e, int b){
                id = i;
                Sname = S;
                chi = c;
                eng = e;
                bcc = b;
        }        
        void CheckData(){
            if(chi>100 ||chi<0){
                    Error("��妨�Z");
                    chi = 0;
            }
            if(eng>100 ||eng<0){
                    Error("�^�妨�Z");
                    eng = 0;
            }
            if(bcc>100 ||bcc<0){
                    Error("�p�����Z");
                    bcc = 0;
                }        
            double a=(double) chi;
            double b=(double) eng;
            double c=(double) bcc;
            avg = (a+b+c)/3;
        }
        void Error(String E){
            System.out.println("��J���~!!"+E+"�H�s���p��!!");
        }
        public void printStudent(){
            System.out.println("�Ǹ�:"+id+"\t�m�W:"+Sname);
            System.out.println("��妨�Z:"+chi+"\t�^�妨�Z:"+eng+"\t�p�����Z:"+bcc);
            System.out.println("�������Z:"+avg);
        }
}        
public class homework5 {
        private Scanner input;

		public void main(String[] args) {
            // TODO Auto-generated method stub
            String Sname;
            int id, chi, eng, bcc;
            input = new Scanner(System.in);
            while(true){         	
                System.out.print("�п�J�Ǹ�:");
                id = input.nextInt();
                System.out.print("�п�J�m�W:");
                Sname = input.next();
                System.out.print("�п�J��妨�Z:");
                chi = input.nextInt();
                System.out.print("�п�J�^�妨�Z:");
                eng = input.nextInt();
                System.out.print("�п�J�p�����Z:");
                bcc = input.nextInt();
                
                Student student;
                student = new Student();
                student.GetStudentNum();
				student.SetStudent(id, Sname, chi, eng, bcc);
				student.CheckData();
				student.printStudent();
                }
        }

}
