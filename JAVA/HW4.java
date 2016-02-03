package project4;

class Employee{
	private int m_salary;
	public void setSalary(int salary){
		m_salary=salary;
	}
	public int getSalary(){
		return m_salary;
	}
}
class Manager extends Employee{
	private String Name;
	private int Bonus;
	public void setData(String Name,int Bonus){
		this.Name=Name;
		this.Bonus=Bonus;
	}
	public void showTotol(){
		System.out.println(Name+"\t"+getSalary()+"\t"+Bonus+"\t"+(getSalary()+Bonus));
	}
}
public class HW4 {
	public static void main(String[] args){
		Manager[] Data=new Manager[5];
		for(int i=0;i<5;i++){
			Data[i]=new Manager();
		}
		Data[0].setSalary(36000);
		Data[1].setSalary(40000);
		Data[2].setSalary(30000);
		Data[3].setSalary(28000);
		Data[4].setSalary(32000);
		Data[0].setData("Mike",15000);
		Data[1].setData("Joe",20000);
		Data[2].setData("Tom",10000);
		Data[3].setData("Coco",18000);
		Data[4].setData("Mary",30000);
		System.out.println("編號"+"\t"+"姓名"+"\t"+"薪水"+"\t"+"紅利"+"\t"+"實領");
		for(int i=0;i<5;i++){
			System.out.print((i+1)+"\t");
			Data[i].showTotol();
		}
	}
}

