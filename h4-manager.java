package homework4;

class Empolyee{
	public int m_salary;
	public void setSalary(int s){
		m_salary = s;
	}
	int getSalary(){
		return m_salary;
	}
}
class Manager extends Empolyee{
	private int Bouns; 
	private String Name; 
	public void setNB(String N,int B){
		this.Name = N;
		this.Bouns = B;
	}
	public void ShowTotal(){
			System.out.println("\t" + Name + "\t" + getSalary() + "\t" + Bouns + "\t"+(getSalary()+Bouns) );
	}
}
public class homework4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 編號\t 姓名\t 薪水\t 紅利\t 實領");
		Manager[] NBS = new Manager[5];
		for (int i = 0; i < 5; i++){
			NBS[i] = new Manager();
		}
		NBS[0].setSalary(36000);
		NBS[1].setSalary(40000);
		NBS[2].setSalary(30000);
		NBS[3].setSalary(28000);
		NBS[4].setSalary(32000);
		NBS[0].setNB("Mike",15000);
		NBS[1].setNB("Joe",20000);
		NBS[2].setNB("Tom",10000);
		NBS[3].setNB("Coco",18000);
		NBS[4].setNB("Mary",30000);
		for(int i = 0; i < 5; i++){
			System.out.print(" "+(i+1));
			NBS[i].ShowTotal();
		}
		
		
	}

}
