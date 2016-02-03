package Java20151022;

class Car {
	public int No;	//ノㄓ癘魁材碭场ó
	public static int Total = 0;	//ノㄓ癘魁ó羆计

	public static void ShowTotalCars() {
		System.out.println("瞷Τ" + Total + "场ó");
	}

	public void ShowMe(String vCarName) {
		System.out.println(vCarName + "琌材" + No + "场ó");
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
		Car Benz = new Car();	//材场ó
		System.out.println("Benz琌材" + Benz.No + "场ó");
		Car.ShowTotalCars();
		Car BMW = new Car();	//材场ó
		Car Ford = new Car();	//材场ó
		BMW.ShowMe("BMW");
		Ford.ShowMe("Ford");
		Car.ShowTotalCars();
		Car MyCar;				//Car把σ
		Car.ShowTotalCars();
		MyCar = BMW;			//盢MyCarBMW
		MyCar.ShowMe("MyCar");
	}

}
