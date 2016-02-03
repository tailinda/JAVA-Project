package Java20151001;

public class Example8 {
	// 類別方法: 顯示字元三角形
	static void printTriangle(char ch, int level) {
		// 變數宣告
		int i, j;
		for (i = 1; i <= level; i++) { // 第一層for迴圈
			// 第二層for迴圈
			for (j = 1; j <= i; j++)
				System.out.print(ch);
			System.out.println();
		}
	}

	// 類別方法: 計算1到N的總和
	static void add2N(int max) {
		// 變數宣告
		int i, total = 0;
		for (i = 1; i <= max; i++)
			// for迴圈敘述
			total += i;
		System.out.println("1加到" + max + " = " + total);
	}

	// 主程式
	public static void main(String[] args) {
		// 建立Scanner物件
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("請輸入三角形最大層數=> ");
		int level = sc.nextInt();
		printTriangle('@', level); // 類別方法的呼叫
		System.out.println("請輸入1加到N的最大值=> ");
		int max = sc.nextInt();
		add2N(max); // 類別方法的呼叫
	}
}