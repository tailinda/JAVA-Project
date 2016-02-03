package homework;

import java.util.Scanner;

class Student{
        public static int number=0;                //計算學生人數
        private int id;                            //學號
        private String Sname;                      //姓名
        private int chi;                           //國文
        private int eng;                           //英文
        private int bcc;                           //計概
        private double avg;                        //成績平均值
        
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
                    Error("國文成績");
                    chi = 0;
            }
            if(eng>100 ||eng<0){
                    Error("英文成績");
                    eng = 0;
            }
            if(bcc>100 ||bcc<0){
                    Error("計概成績");
                    bcc = 0;
                }        
            double a=(double) chi;
            double b=(double) eng;
            double c=(double) bcc;
            avg = (a+b+c)/3;
        }
        void Error(String E){
            System.out.println("輸入錯誤!!"+E+"以零分計算!!");
        }
        public void printStudent(){
            System.out.println("學號:"+id+"\t姓名:"+Sname);
            System.out.println("國文成績:"+chi+"\t英文成績:"+eng+"\t計概成績:"+bcc);
            System.out.println("平均成績:"+avg);
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
                System.out.print("請輸入學號:");
                id = input.nextInt();
                System.out.print("請輸入姓名:");
                Sname = input.next();
                System.out.print("請輸入國文成績:");
                chi = input.nextInt();
                System.out.print("請輸入英文成績:");
                eng = input.nextInt();
                System.out.print("請輸入計概成績:");
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
