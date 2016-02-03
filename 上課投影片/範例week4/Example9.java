package Java20151001;

public class Example9 {
	// 類別方法: 將攝氏溫度轉成華氏溫度
	static double convert2F(double c) {
		// 變數宣告
		double f;
		f = (9.0 * c) / 5.0 + 32.0; // 轉換溫度
		return f; // 傳回值
	}

	// 主程式
	public static void main(String[] args) {
		// 建立Scanner物件
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("請輸入攝氏溫度=> ");
		double c = sc.nextDouble();
		double f = convert2F(c); // 類別方法的呼叫
		System.out.println("攝氏" + c + " = 華氏" + f);
	}
}