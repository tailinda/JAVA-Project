package Java20151001;

public class Example6 {
	// 主程式
	public static void main(String[] args) {
		// 變數宣告
		int i, j;
		System.out.print("    "); // 顯示標題列
		for (i = 1; i <= 9; i++)
			System.out.print(i + "      ");
		System.out.println();
		i = 1;
		while (i <= 9) { // 巢狀迴圈-第一層while迴圈
			// 顯示欄標題
			System.out.print(i + " ");
			for (j = 1; j <= 9; j++) {
				// 第二層for迴圈
				System.out.print(i + "*" + j + "=");
				System.out.print(i * j + " ");
				if ((i * j) < 10 && j != 1)
					System.out.print(" ");// 調整顯示位置
			}
			i++; // 計數器變數加一
			System.out.println();
		}
	}
}