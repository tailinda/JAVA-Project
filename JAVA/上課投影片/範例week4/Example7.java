package Java20151001;

public class Example7 {
	// 類別方法: 顯示訊息
	private static void printMsg() {
		System.out.println("Hello World!");
	}

	// 類別方法: 顯示1加到10的總和
	public static void add2Ten() {
		// 變數宣告
		int i, total = 0;
		for (i = 1; i <= 10; i++)
			// for迴圈敘述
			total += i;
		System.out.println("1加到10 = " + total);
	}

	// 主程式
	public static void main(String[] args) {
		printMsg(); // 同一個類別的類別方法呼叫
		Example7.add2Ten(); // 其他類別的類別方法呼叫
	}
}