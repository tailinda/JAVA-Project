package work3;

public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�H�����l6000��");
		int i=0,j=0,a=0,b=0,c=0,d=0,e=0,f=0;
		
		for(i=0;i<6000;i++)
		{
			j=(int)(Math.random()*6)+1;  //+1�O���F��0-5�ܦ�1-6
			while(j<=1){
				a=a+1;
				break;
			}
			while(j>1&&j<=2){
				b=b+1;
				break;
			}
			while(j>2&&j<=3){
				c=c+1;
				break;
			}
			while(j>3&&j<=4){
				d=d+1;
				break;
			}
			while(j>4&&j<=5){
				e=e+1;
				break;
			}
			while(j>5&&j<=6){
				f=f+1;
				break;
			}
		}
		
		System.out.println("�X�{1������:"+a);
		System.out.println("�X�{2������:"+b);
		System.out.println("�X�{3������:"+c);
		System.out.println("�X�{4������:"+d);
		System.out.println("�X�{5������:"+e);
		System.out.println("�X�{6������:"+f);
		
	}

}
