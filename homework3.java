package homework3;

import java.util.Scanner;

class Emplyee{		// Emplyee���O�ŧi
	private int Salary;	
	private String Ename; 
	
	public void setData(int S, String E){
		Salary = S;
		Ename = E;
	}
	
	public void PrintData(){
		System.out.println("���u�m�W:"+Ename);
		System.out.println("���u�~��:"+Salary);
	}
	
	public void ShowError(){
		if( Salary > 40000 || Salary < 20000)	//Salary>40000�άOSalary<20000����H�U�ʧ@
			System.out.println("�~����������20000��40000����");
	}
}

public class homework3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyee Emplyee;	//�ŧiEmplyee���O���A���ܼ�
		Emplyee = new Emplyee();	//�إߪ�����

		Scanner sc = new Scanner(System.in);	
		
		System.out.println("�п�J���u�m�W:");
		String Ename = sc.nextLine();
		
		System.out.println("�п�J���u�~��:");
		int Salary = sc.nextInt();
		//�I�s���󪺤�k
		Emplyee.setData(Salary, Ename);		//����.����ܼ�
		Emplyee.PrintData();
		Emplyee.ShowError();
	}

}
