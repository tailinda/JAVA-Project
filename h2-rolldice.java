package rolldice;

public class rolldice {

	private static void win()
	{
		System.out.println("過關!!!");
	}
	
	private static void lose()
	{
		System.out.println("輸了!!!");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int one,two,total,point=0,i=1;
		boolean flag=true;
		while(flag)
		{
			System.out.println( "第" + i + "關" );
			one=(int) Math.ceil(Math.random()*6);
			System.out.println( "第一顆骰子骰出的點數為:" + one );
			two=(int) Math.ceil(Math.random()*6);
			System.out.println( "第二顆骰子骰出的點數為:" + two );
			total=one+two;
			System.out.println( "總計骰出的點數為:" + total );
			
			if(i==1)
			{
				if(total==7)
				{
					win();
					flag=false;
				}
				else if(total==2 || total==3 || total==12)
				{
					lose();
					flag=false;
				}
				else
				{
					point=total;
					System.out.println( "指定數字為:" + total );
				}
			}
			
			if(i!=1)
			{
				if(total==7)
				{
					lose();
					flag=false;
				}
				else if(total==point)
				{
					win();
					flag=false;
				}
			}
			
			System.out.println("*********************");
			i++;	
		}
	}

}
