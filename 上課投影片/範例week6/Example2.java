package Java20151022;

class Car {
	public int No;	//�ΨӰO���ĴX����
	public static int Total = 0;	//�ΨӰO�����l�`��

	public static void ShowTotalCars() {
		System.out.println("�{�b�@��" + Total + "�����l");
	}

	public void ShowMe(String vCarName) {
		System.out.println(vCarName + "�O��" + No + "�����l");
	}

	public Car() {
		Total += 1;
		No = Total;
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.ShowTotalCars();
		Car Benz = new Car();	//�ŧi�Ĥ@����
		System.out.println("Benz�O��" + Benz.No + "����");
		Car.ShowTotalCars();
		Car BMW = new Car();	//�ŧi�ĤG����
		Car Ford = new Car();	//�ŧi�ĤT����
		BMW.ShowMe("BMW");
		Ford.ShowMe("Ford");
		Car.ShowTotalCars();
		Car MyCar;				//�ŧiCar���Ѧ�
		Car.ShowTotalCars();
		MyCar = BMW;			//�NMyCar���VBMW
		MyCar.ShowMe("MyCar");
	}

}
