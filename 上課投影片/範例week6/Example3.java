package Java20151022;

abstract class ShapeQ { // Shape抽象類別宣告
	// 成員資料
	public double x; // X座標
	public double y; // y座標

	abstract void area(); // 抽象方法: 計算面積
}

class CircleQ extends Shape { // Circle類別宣告
	// 成員資料
	public double r; // 半徑

	// 建構子
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	// 成員方法: 實作抽象方法area()
	public void area() {
		System.out.println("圓面積: " + 3.1416 * r * r);
	}
}

// 主程式類別
public class Example3 {
	// 主程式
	public static void main(String[] args) {
		// Circle類別的物件變數
		Circle c;
		// 宣告Circle類別型態的變數且建立物件
		Circle c1 = new Circle(5.0, 10.0, 4.0);
		Shape c2 = new Circle(10.0, 10.0, 7.0);
		// 顯示圓形c1的資料
		System.out.println("圓形c1的資料 =====");
		System.out.println("X座標: " + c1.x);
		System.out.println("Y座標: " + c1.y);
		System.out.println("半徑: " + c1.r);
		c1.area(); // 呼叫物件的實例方法
		// 顯示圓形c2的資料, 檢查是否為Circle的實例
		if (c2 instanceof Circle)
			System.out.println("----->c2是Circle物件");
		System.out.println("圓形c2的資料 =====");
		System.out.println("X座標: " + c2.x);
		System.out.println("Y座標: " + c2.y);
		c = (Circle) c2; // 型態轉換
		System.out.println("半徑: " + c.r);
		c2.area(); // 呼叫物件的實例方法
	}
}