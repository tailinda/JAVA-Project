package work6;

class HTC{
	int salary[] ={36000,45000,28000,32000,26000};
	
	public void setSalary(){
		for(int i = 0; i < 5; i++){
			System.out.println("��" + i + "�ӭ��u���~��:" + salary[i] );
		}
	}
}

public class exp2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTC e;
		e = new HTC();
		e.setSalary();	
	}
}
