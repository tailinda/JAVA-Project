package rolldice;

public class rolldice {

	private static void win()
	{
		System.out.println("�L��!!!");
	}
	
	private static void lose()
	{
		System.out.println("��F!!!");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int one,two,total,point=0,i=1;
		boolean flag=true;
		while(flag)
		{
			System.out.println( "��" + i + "��" );
			one=(int) Math.ceil(Math.random()*6);
			System.out.println( "�Ĥ@����l��X���I�Ƭ�:" + one );
			two=(int) Math.ceil(Math.random()*6);
			System.out.println( "�ĤG����l��X���I�Ƭ�:" + two );
			total=one+two;
			System.out.println( "�`�p��X���I�Ƭ�:" + total );
			
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
					System.out.println( "���w�Ʀr��:" + total );
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