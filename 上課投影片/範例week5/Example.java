package Java20151008;

public class Example {

	public static void main(String[] args) {
		int i, sum = 0;
		double average, total = 0.0;
		int[] temp; // 宣告陣列變數
		int[] grades = { 87, 78, 95 }; // 建立int陣列
		// 建立double陣列
		double[] sales = new double[4];
		sales[0] = 145.6;sales[1] = 178.9;
		sales[2] = 197.3;sales[3] = 156.7;
				
		temp = grades;
		// 使用迴圈顯示陣列值和計算總和
		for (int ele : temp) {
			sum += ele;
			System.out.print("| " + ele);
		}
		System.out.println("\n成績總分: " + sum);
		// 使用迴圈顯示陣列值和計算平均
		for (i = 0; i < sales.length; i++) {
			total += sales[i];
			System.out.print("| " + sales[i]);
		}
		System.out.println("\n業績總和: " + total);
		average = total / (double) sales.length;
		System.out.println("平均業績: " + average);
	}
}
