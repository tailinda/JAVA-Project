package exp1;
	
class  Man{
	private int height;
	private int weight;
	
	public void printMan(){
		System.out.println("����:"+height+ "�魫:" +weight);
	}
	
	public void setMan(int h,int w)
	{
		
	}
	
	public void BMI()
	{
		
	}
}

public class exp3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Man man1,man2,man3;
		
		man1 = new Man();
		man2 = new Man();
		man3 = new Man();
		
		/*
		man1.height = 180;
		man1.weight = 60;
		man2.height = 170;
		man2.weight = 55;
		man3.height = 175;
		man3.weight = 60;	
		*/
		
		System.out.print("�Ĥ@�ӤH:");
		man1.printMan();
		System.out.print("�ĤG�ӤH:");
		man2.printMan();
		System.out.print("�ĤT�ӤH:");
		man3.printMan();
		
		
		
		
	}

}
