package Java20151001;

public class Example5 {
	// 主程式
	public static void main(String[] args) {
		// 建立Scanner物件
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("請輸最大值=> ");
		int max = sc.nextInt();
		int i = 1, sum = 0; // 變數宣告
		do { // do/while迴圈敘述
			System.out.print("|" + i);
			sum += i;
			i++;
			if (i > max)
				break; // 跳出迴圈
		} while (true);
		System.out.println("\n總和: " + sum);
		for (sum = 0, i = 1; i <= max; i++) { // for迴圈敘述
			if ((i % 2) == 1)
				continue; // 繼續迴圈
			System.out.print("|" + i);
			sum += i;
		}
		System.out.println("\n偶數的總和: " + sum);
	}
}