package tax;

import java.util.Scanner;

public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long money;
		double tax;
		String name;
		
		System.out.print("請輸入姓名:");
		name = sc.nextLine();
		System.out.print("請輸入本年度綜合所得金額:");
		money = sc.nextInt();
		
		if(money <= 370000)
		{
			tax= (money*0.06);
			System.out.println("所要繳交稅金為:"+tax);
		}
		else if(370001 <= money && money <= 990000)
		{
			tax= (22200+((money-370000)*0.13));
			System.out.println("所要繳交稅金為:"+tax);
		}
		else if (990001 <= money && money <= 1980000)
		{
			tax= (102800+((money-990000)*0.21));
			System.out.println("所要繳交稅金為:"+tax);
		}
		else if (1980001 <= money && money <= 3720000)
		{
			tax= (310700+((money-1980000)*0.3));
			System.out.println("所要繳交稅金為:"+tax);
		}
		else 
		{
			tax= (832700+((money-3720000)*0.4));
			System.out.println("所要繳交稅金為:"+tax);System.out.println("123");
		}
	}

}
