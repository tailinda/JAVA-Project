package Java20151008;

class Timeee { // Time類別宣告
	// 成員資料
	private int second;
	private int minute;
	private int hour;

	// 成員方法: 檢查時間資料
	public boolean validateTime(int h, int m, int s) {
		// 檢查時間資料是否在範圍內
		if (h < 0 || h > 23)
			return false;
		if (m < 0 || m > 59)
			return false;
		if (s < 0 || s > 59)
			return false;
		return true; // 合法時間資料
	}

	// 成員方法: 設定時間資料
	public boolean setTime(int h, int m, int s) {
		// 檢查時間參數是否合法
		if (validateTime(h, m, s)) {
			hour = h; // 設定小時
			minute = m; // 設定分鐘
			second = s; // 設定秒數
			return true; // 設定成功
		} else
			return false; // 設定失敗
	}

	// 成員方法: 顯示時間資料
	public void printTime() {
		// 輸出成員資料的時, 分和秒
		System.out.println(hour + ":" + minute + ":" + second);
	}
}

// 主程式類別
public class Example3 {
	// 主程式
	public static void main(String[] args) {
		// 宣告Time類別型態的變數, 且建立物件
		Time open = new Time();
		Time close = new Time();
		// 呼叫實例方法設定open物件的時間資料
		open.setTime(10, 10, 40);
		// 呼叫副本方法設定close物件的時間資料
		close.setTime(22, 30, 30);
		// 呼叫物件的實例方法printTime()
		System.out.print("結束營業時間 = ");
		close.printTime();
		System.out.print("開始營業時間 = ");
		open.printTime();
		// 使用物件實例方法validateDate()檢查時間資料
		if (close.validateTime(18, 30, 20))
			System.out.println("18:30:20是合法時間!");
		if (!open.validateTime(23, 32, 60))
			System.out.println("23:32:60是不合法時間!");
	}
}