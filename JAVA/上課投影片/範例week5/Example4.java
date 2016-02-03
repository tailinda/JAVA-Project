package Java20151008;

class Timee { // Time類別宣告
	// 成員資料
	private int second;
	private int minute;
	private int hour;

	// 建構子(1): 沒有參數
	public Time() {
		// 設定時間資料預設值
		hour = 12;
		minute = 30;
		second = 10;
	}

	// 建構子(2): 使用參數設定成員資料初始值
	public Time(int h, int m, int s) {
		// 檢查時間參數是否合法
		if (validateTime(h, m, s)) {
			hour = h; // 設定小時
			minute = m; // 設定分鐘
			second = s; // 設定秒數
		} else { // 設定時間資料預設值
			hour = 12;
			minute = 30;
			second = 10;
		}
	}

	// 成員方法: 檢查時間資料
	private boolean validateTime(int h, int m, int s) {
		// 檢查時間資料是否在範圍內
		if (h < 0 || h > 23)
			return false;
		if (m < 0 || m > 59)
			return false;
		if (s < 0 || s > 59)
			return false;
		return true; // 合法時間資料
	}

	// 成員方法: 傳回小時
	public int getHour() {
		return hour;
	}

	// 成員方法: 傳回分鐘
	public int getMinute() {
		return minute;
	}

	// 成員方法: 傳回秒數
	public int getSecond() {
		return second;
	}

	// 成員方法: 顯示時間資料
	public void printTime() {
		// 輸出成員資料的時, 分和秒
		System.out.println(hour + ":" + minute + ":" + second);
	}
}

// 主程式類別
public class Example4 {
	// 主程式
	public static void main(String[] args) {
		// 變數宣告
		int hour, minute, second;
		// 宣告Time類別型態的變數, 且建立物件
		Time open = new Time(10, 10, 40);
		Time now = new Time();
		// 呼叫實例方法顯示時間資料
		System.out.print("開始營業時間 = ");
		open.printTime();
		System.out.print("現在時間 = ");
		now.printTime();
		// 呼叫實例方法取得時間資料
		hour = open.getHour();
		minute = open.getMinute();
		second = open.getSecond();
		System.out.print("開始營業時間 = "); // 顯示時間
		System.out.println(hour + "-" + minute + "-" + second);
	}
}