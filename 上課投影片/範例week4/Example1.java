package Java20151001;

public class Example1 {
	// 主程式
	public static void main(String[] args) {
		// 建立Scanner物件
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("請輸最大值=> ");
		int max = sc.nextInt();
		int counter, sum = 0; // 變數宣告
		// 遞增for迴圈敘述
		for (counter = 1; counter <= max; counter++) {
			System.out.print("|" + counter);
			sum += counter;
		}
		System.out.println("\n從1到max的總和: " + sum);
		System.out.println(" ----------------- ");
		// 遞減for迴圈敘述
		for (sum = 0, counter = max; counter >= 1; counter--) {
			System.out.print("|" + counter);
			sum += counter;
		}
		System.out.println("\n從max到1的總和: " + sum);
	}
}