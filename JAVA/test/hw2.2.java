

public class hw2 {
	
	private static int rolldice()
	{
		int x,y,target;
		x = (int) Math.ceil(Math.random()*6);
		y = (int) Math.ceil(Math.random()*6);
		target = x + y;
		System.out.println("骰子1點數為: "+x);
		System.out.println("骰子2點數為: "+y);
		System.out.println("相加後的點數為: "+target);
		System.out.println("*******************");
		return target;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target,sum,i=1;
		target = rolldice();
		
		if(target == 7 || target == 11)
			System.out.println("恭喜 !! 你贏了!");
		else if(target == 2 || target == 3 || target == 12)
			System.out.println("弱!! 你輸了!");
		else
		{
			do
			{
				System.out.println("進入第"+(i+1)+"關");
				System.out.println("目標點數為: "+target);
				System.out.println("");
				sum = rolldice();
				i++;
				if(sum == target)
				{
					System.out.println("恭喜 !! 你贏了!");
					break;
				}else if(sum == 7)
				{
					System.out.println("弱!! 你輸了!");
					break;
				}else
					continue;
			}while(true);
		}
		System.out.println("");
		System.out.println("共骰了"+i+"次");	
	}

}
