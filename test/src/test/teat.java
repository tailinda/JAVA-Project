package test;

import java.util.Scanner;

public class teat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long money;
		double tax;
		String name;
		
		System.out.print("�п�J�m�W:");
		name = sc.nextLine();
		System.out.print("�п�J���~�׺�X�ұo���B:");
		money = sc.nextInt();
		
		if(money <= 370000)
		{
			tax= (money*0.06);
			System.out.println("�ҭnú��|����:"+tax);
		}
		else if(370001 <= money && money <= 990000)
		{
			tax= (222000+((money-370000)*0.13));
			System.out.println("�ҭnú��|����:"+tax);
		}
		else if (990001 <= money && money <= 1980000)
		{
			tax= (302600+((money-990000)*0.21));
			System.out.println("�ҭnú��|����:"+tax);
		}
		else if (1980001 <= money && money <= 3720000)
		{
			tax= (510500+((money-1980000)*0.3));
			System.out.println("�ҭnú��|����:"+tax);
		}
		else 
		{
			tax= (1626500+((money-3720000)*0.4));
			System.out.println("�ҭnú��|����:"+tax);System.out.println("123");
		}
	}

}
