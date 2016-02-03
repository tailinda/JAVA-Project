package rolldice;

public class rolldice {

	private static void WIN(){
		System.out.println("恭喜過關!");
	}
	private static void LOSE(){
		System.out.println("你輸了~");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,c=1,total,goal=0;
		boolean flag=true;
		while(flag){
			System.out.println("第"+c+"關");
			first=(int) Math.ceil(Math.random()*6);
			System.out.println("骰子1點數為"+first);
			second=(int) Math.ceil(Math.random()*6);
			System.out.println("骰子2點數為"+second);
			total=first+second;
			System.out.println("相加後點數為"+total);
			if(c==1){
				if(total==7){
					WIN();
					flag=false;
				}
				else if(total==2 || total==3 || total==12){
					LOSE();
					flag=false;
				}
				else{
					goal=total;
					System.out.println("目標數字為"+total);
				}
			}
			if(c!=1){
				if(total==7){
					LOSE();
					flag=false;
				}
				else if(total==goal){
					WIN();
					flag=false;
				}
			}
			System.out.println("--------------------");
			c++;	
		}
	}

}
