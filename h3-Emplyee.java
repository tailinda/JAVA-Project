package homework3;

import java.util.Scanner;

class Emplyee{		// Emplyee類別宣告
	private int Salary;	
	private String Ename; 
	
	public void setData(int S, String E){
		Salary = S;
		Ename = E;
	}
	
	public void PrintData(){
		System.out.println("員工姓名:"+Ename);
		System.out.println("員工薪水:"+Salary);
	}
	
	public void ShowError(){
		if( Salary > 40000 || Salary < 20000)	//Salary>40000或是Salary<20000執行以下動作
			System.out.println("薪水必須介於20000到40000之間");
	}
}

public class homework3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyee Emplyee;	//宣告Emplyee類別型態的變數
		Emplyee = new Emplyee();	//建立物件實例

		Scanner sc = new Scanner(System.in);	
		
		System.out.println("請輸入員工姓名:");
		String Ename = sc.nextLine();
		
		System.out.println("請輸入員工薪水:");
		int Salary = sc.nextInt();
		//呼叫物件的方法
		Emplyee.setData(Salary, Ename);		//物件.實例變數
		Emplyee.PrintData();
		Emplyee.ShowError();
	}

}
