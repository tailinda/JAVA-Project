package work6;

class Empolyee{
	public int m_salary;
	int getSalary() {
		return m_salary;
	}
	
	public void setSalary(int s){
		m_salary = s;
		System.out.println("tom���u�~��:" + s);
	}
}

class Manager extends Empolyee{
	public int Bouns;
	public Manager(int s, int B){
		m_salary = s;
		Bouns = B;
		System.out.println("peter�g�z�~��:" + s);
		System.out.println("peter�g�z����:" + B);
	}
	
	public void ShowTotal(){
		
		System.out.println("peter����~��:"+(getSalary()+Bouns));
	}
}

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee e;
		e = new Empolyee();
		e.setSalary(40000);
		
		Manager m;
		m = new Manager(40000,30000);
		m.getSalary();
		m.ShowTotal();
		

	}

}
