

public class hw2 {
	
	private static int rolldice()
	{
		int x,y,target;
		x = (int) Math.ceil(Math.random()*6);
		y = (int) Math.ceil(Math.random()*6);
		target = x + y;
		System.out.println("��l1�I�Ƭ�: "+x);
		System.out.println("��l2�I�Ƭ�: "+y);
		System.out.println("�ۥ[�᪺�I�Ƭ�: "+target);
		System.out.println("*******************");
		return target;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target,sum,i=1;
		target = rolldice();
		
		if(target == 7 || target == 11)
			System.out.println("���� !! �AĹ�F!");
		else if(target == 2 || target == 3 || target == 12)
			System.out.println("�z!! �A��F!");
		else
		{
			do
			{
				System.out.println("�i�J��"+(i+1)+"��");
				System.out.println("�ؼ��I�Ƭ�: "+target);
				System.out.println("");
				sum = rolldice();
				i++;
				if(sum == target)
				{
					System.out.println("���� !! �AĹ�F!");
					break;
				}else if(sum == 7)
				{
					System.out.println("�z!! �A��F!");
					break;
				}else
					continue;
			}while(true);
		}
		System.out.println("");
		System.out.println("�@��F"+i+"��");	
	}

}
