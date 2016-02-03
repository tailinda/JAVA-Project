package work3;

import java.util.Scanner;

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入繩索長度:");
		int i=0;
		float l = sc.nextFloat();
		while (l>20)
		{
			
			i=i+1;
			l=(l/2);
			//System.out.println("對折後長度:"+l);
			
		}
			
			System.out.println("最後剩餘長度:"+l);
			System.out.println("總對折次數:"+i);	
			
	}

}
