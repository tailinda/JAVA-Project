package work3;

import java.util.Scanner;

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�п�J÷������:");
		int i=0;
		float l = sc.nextFloat();
		while (l>20)
		{
			
			i=i+1;
			l=(l/2);
			//System.out.println("�������:"+l);
			
		}
			
			System.out.println("�̫�Ѿl����:"+l);
			System.out.println("�`��馸��:"+i);	
			
	}

}
