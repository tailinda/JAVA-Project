package Java20151001;

public class Example4 {
	// 主程式
	public static void main(String[] args) {
		// 建立Scanner物件
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("請輸溫度下限=> ");
		int lower = sc.nextInt(); // 溫度下限
		System.out.print("請輸溫度上限=> ");
		int upper = sc.nextInt(); // 溫度上限
		int c = lower, step = 10; // 增量
		double f;
		System.out.println("攝氏\t華氏");
		do { // do/while迴圈敘述
			f = (9.0 * c) / 5.0 + 32.0;
			System.out.println("攝氏: " + c);
			System.out.println("=>華氏: " + f);
			c += step;
		} while (c <= upper);
	}
}